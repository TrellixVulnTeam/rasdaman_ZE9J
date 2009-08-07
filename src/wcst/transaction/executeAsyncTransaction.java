/*
 * This file is part of PetaScope.
 *
 * PetaScope is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * PetaScope is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with PetaScope. If not, see <http://www.gnu.org/licenses/>.
 *
 * For more information please see <http://www.PetaScope.org>
 * or contact Peter Baumann via <baumann@rasdaman.com>.
 *
 * Copyright 2009 Jacobs University Bremen, Peter Baumann.
 */


package wcst.transaction;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import net.opengis.ows.v_1_0_0.ExceptionReport;
import wcst.server.ConfigManager;
import wcst.transaction.schema.TransactionResponseType;

/**
 * This class processes asynchronously an WCS Transaction request. 
 *
 * @author Andrei Aiordachioaie
 */
public class executeAsyncTransaction extends Thread
{
    private boolean printLog;
    private String responseHandler;
    private executeTransaction exec;
	
	/**
	 * Default constructor. 
	 * @param exec a synchroneous executeTransaction object
	 * @param responseHandler destination URL that should receive the processed output
	 */
	public executeAsyncTransaction(executeTransaction exec, String responseHandler)
	{
        this.printLog = ConfigManager.PRINT_LOG;
        this.responseHandler = responseHandler;
        this.exec = exec;
	}

	/**
	 * Log a message to System.out
	 * @param str Text of the message
	 */
	private void log(String str)
	{
		if ( printLog )
		{
			System.out.println("WCS-T Async: " + str);
		}
	}

    /**
	 * Log a message to System.err
	 * @param str Text of the message
	 */
	private static void error(String str)
	{
        System.err.println("WCS-T Async: " + str);
	}

    /** Run the current thread. */
    public void run()
    {
        log("Started async thread...");
        String outString = null;
        try // only for WCSTException
        {
            try
            {
                /* (1) Do the actual processing of the Transaction */
                log("Starting async execution ...");
                TransactionResponseType output = exec.get();
                JAXBElement jaxbOutput = new JAXBElement(new QName("", "TransactionResponse"), TransactionResponseType.class, output);

                /* (2) Marshall the output XML into a String */
                log("Marshalling transaction response into a string ...");
                JAXBContext jaxbCtx = JAXBContext.newInstance(output.getClass().getPackage().getName());
                Marshaller marshaller = jaxbCtx.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                StringWriter strWriter = new StringWriter();

                marshaller.marshal(jaxbOutput, strWriter);
                outString = strWriter.toString();

                /* (3) Send the output to the destination response handler */
                sendPostRequest(outString, responseHandler);
            }
            catch (MalformedURLException ex)
            {
                ex.printStackTrace();
                throw new WCSTException("BadResponseHandler", "Response Handler URL is malformed.");
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
                throw new WCSTException("AsyncResponseFailed", "Could not send asynchronous response to URL: " + responseHandler);
            }
            catch (JAXBException ex)
            {
                ex.printStackTrace();
                throw new WCSTException("XmlStructuresError", "Could not marshall the XML to a string !");
            }
        }
        catch (WCSTException e)
        {
            e.printStackTrace();
            ExceptionReport report = e.getReport();
			try
			{
                /* Build the error report */
				JAXBContext jaxbCtx = JAXBContext.newInstance(report.getClass().getPackage().getName());
				Marshaller marshaller = jaxbCtx.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
				StringWriter strWriter = new StringWriter();
				marshaller.marshal(report, strWriter);
                outString = strWriter.toString();
                error(outString);
				log("Done with the Error Report !");

                /* Send the error report to the responseHandler */
                sendPostRequest(outString, responseHandler);
			}
			catch (JAXBException e2)
			{
				e2.printStackTrace();
				error("Could not build XML error report.");
			}
            catch (IOException e2)
            {
                e2.printStackTrace();
                error("Could not send XML error report to URL: " + responseHandler);
            }
        }
    }

    /** Send string data to a URL end-point. Use this function to send the output 
     *
     * @param content
     * @param destinationUrl
     * @throws MalformedURLException
     * @throws IOException
     */
    private void sendPostRequest(String content, String destinationUrl) throws MalformedURLException, IOException
    {
        log("sendPostRequest() ... to URL: " + destinationUrl);
        
        // connect to the destination 
		URL servlet = new URL(destinationUrl);
		HttpURLConnection conn = (HttpURLConnection) servlet.openConnection();

		// inform the connection that we will send output and will not accept input
		conn.setDoInput(false);
		conn.setDoOutput(true);

		// Don't use a cached version of URL connection.
		conn.setUseCaches(false);
		conn.setDefaultUseCaches(false);

		// Send POST request
		conn.setRequestMethod("POST");

		// Specify the content type that we will send binary data
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

		String data = "xml=" + URLEncoder.encode(content);
		DataOutputStream out = new DataOutputStream(conn.getOutputStream());

		out.writeBytes(data);
		out.flush();
		out.close();
    }
}

CDF      
      lat       lon       bnds      plev      time             CVS_Id        $Id$   creation_date                                        prg_ID        0Source file unknown Version unknown Date unknown   cmd_ln        7bds -x 256 -y 128 -m 23 -o /data/zender/data/dst_T85.nc    history      pFri Apr 12 12:19:26 2019: ncks -d lat,30.0,40.0 -d lon,25.0,30.0 sresa1b_ncar_ccsm3-example.nc output.nc
Tue Oct 25 15:08:51 2005: ncks -O -x -v va -m sresa1b_ncar_ccsm3_0_run1_200001.nc sresa1b_ncar_ccsm3_0_run1_200001.nc
Tue Oct 25 15:07:21 2005: ncks -d time,0 sresa1b_ncar_ccsm3_0_run1_200001_201912.nc sresa1b_ncar_ccsm3_0_run1_200001.nc
Tue Oct 25 13:29:43 2005: ncks -d time,0,239 sresa1b_ncar_ccsm3_0_run1_200001_209912.nc /var/www/html/tmp/sresa1b_ncar_ccsm3_0_run1_200001_201912.nc
Thu Oct 20 10:47:50 2005: ncks -A -v va /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/sresa1b_ncar_ccsm3_0_run1_va_200001_209912.nc /data/brownmc/sresa1b/atm/mo/tas/ncar_ccsm3_0/run1/sresa1b_ncar_ccsm3_0_run1_200001_209912.nc
Wed Oct 19 14:55:04 2005: ncks -F -d time,01,1200 /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/sresa1b_ncar_ccsm3_0_run1_va_200001_209912.nc /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/sresa1b_ncar_ccsm3_0_run1_va_200001_209912.nc
Wed Oct 19 14:53:28 2005: ncrcat /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/foo_05_1200.nc /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/foo_1192_1196.nc /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/sresa1b_ncar_ccsm3_0_run1_va_200001_209912.nc
Wed Oct 19 14:50:38 2005: ncks -F -d time,05,1200 /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/va_A1.SRESA1B_1.CCSM.atmm.2000-01_cat_2099-12.nc /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/foo_05_1200.nc
Wed Oct 19 14:49:45 2005: ncrcat /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/va_A1.SRESA1B_1.CCSM.atmm.2000-01_cat_2079-12.nc /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/va_A1.SRESA1B_1.CCSM.atmm.2080-01_cat_2099-12.nc /data/brownmc/sresa1b/atm/mo/va/ncar_ccsm3_0/run1/va_A1.SRESA1B_1.CCSM.atmm.2000-01_cat_2099-12.nc
Created from CCSM3 case b30.040a
 by wgstrand@ucar.edu
 on Wed Nov 17 14:12:57 EST 2004
 
 For all data, added IPCC requested metadata    table_id      	Table A1       title         #model output prepared for IPCC AR4     institution       CNCAR (National Center for Atmospheric 
Research, Boulder, CO, USA)     source        �CCSM3.0, version beta19 (2004): 
atmosphere: CAM3.0, T85L26;
ocean     : POP1.4.3 (modified), gx1v3
sea ice   : CSIM5.0, T85;
land      : CLM3.0, gx1v3    contact       ccsm@ucar.edu      
project_id        IPCC Fourth Assessment     Conventions       CF-1.0     
references        �Collins, W.D., et al., 2005:
 The Community Climate System Model, Version 3
 Journal of Climate
 
 Main website: http://www.ccsm.ucar.edu      acknowledgment       P Any use of CCSM data should acknowledge the contribution
 of the CCSM project and CCSM sponsor agencies with the 
 following citation:
 'This research uses data provided by the Community Climate
 System Model project (www.ccsm.ucar.edu), supported by the
 Directorate for Geosciences of the National Science Foundation
 and the Office of Biological and Environmental Research of
 the U.S. Department of Energy.'
In addition, the words 'Community Climate System Model' and
 'CCSM' should be included as metadata for webpages referencing
 work using CCSM data or as keywords provided to journal or book
publishers of your manuscripts.
Users of CCSM data accept the responsibility of emailing
 citations of publications of research using CCSM data to
 ccsm@ucar.edu.
Any redistribution of CCSM data must include this data
 acknowledgement statement.    realization             experiment_id         +720 ppm stabilization experiment (SRESA1B)     comment      &This simulation was initiated from year 2000 of 
 CCSM3 model run b30.030a and executed on 
 hardware cheetah.ccs.ornl.gov. The input external forcings are
ozone forcing    : A1B.ozone.128x64_L18_1991-2100_c040528.nc
aerosol optics   : AerosolOptics_c040105.nc
aerosol MMR      : AerosolMass_V_128x256_clim_c031022.nc
carbon scaling   : carbonscaling_A1B_1990-2100_c040609.nc
solar forcing    : Fixed at 1366.5 W m-2
GHGs             : ghg_ipcc_A1B_1870-2100_c040521.nc
GHG loss rates   : noaamisc.r8.nc
volcanic forcing : none
DMS emissions    : DMS_emissions_128x256_clim_c040122.nc
oxidants         : oxid_128x256_L26_clim_c040112.nc
SOx emissions    : SOx_emissions_A1B_128x256_L2_1990-2100_c040608.nc
 Physical constants used for derived data:
 Lv (latent heat of evaporation): 2.501e6 J kg-1
 Lf (latent heat of fusion     ): 3.337e5 J kg-1
 r[h2o] (density of water      ): 1000 kg m-3
 g2kg   (grams to kilograms    ): 1000 g kg-1
 
 Integrations were performed by NCAR and CRIEPI with support
 and facilities provided by NSF, DOE, MEXT and ESC/JAMSTEC.      model_name_english        
NCAR CCSM      NCO       4.4.4            area                   	long_name         Surface area   units         meter2        �     lat                 	long_name         latitude   units         degrees_north      axis      Y      standard_name         	latitude       bounds        	lat_bnds             �   lat_bnds                        �  �   lon                	long_name         	longitude      units         degrees_east   axis      X      standard_name         
longitude      bounds        	lon_bnds            ,   lon_bnds                       @  <   msk_rgn                    	long_name         Mask region    units         bool      �  |   plev               	long_name         	pressure       units         Pa     standard_name         air_pressure       positive      down       axis      Z         �  �   pr                        comment       ?Created using NCL code CCSM_atmm_2cf.ncl on
 machine eagle163s     missing_value         `�x�   
_FillValue        `�x�   cell_methods      time: mean (interval: 1 month)     history       (PRECC+PRECL)*r[h2o]       original_units        m-1 s-1    original_name         PRECC, PRECL       standard_name         precipitation_flux     units         kg m-2 s-1     	long_name         precipitation_flux     cell_method       time: mean        �   �   tas                       comment       ?Created using NCL code CCSM_atmm_2cf.ncl on
 machine eagle163s     missing_value         `�x�   
_FillValue        `�x�   cell_methods      time: mean (interval: 1 month)     history       Added height coordinate    coordinates       height     original_units        K      original_name         TREFHT     standard_name         air_temperature    units         K      	long_name         air_temperature    cell_method       time: mean        �  !   time               calendar      noleap     standard_name         time   axis      T      units         days since 0000-1-1    bounds        	time_bnds      	long_name         time            !�   	time_bnds                            !�   ua                        
   comment       ?Created using NCL code CCSM_atmm_2cf.ncl on
 machine eagle163s     missing_value         `�x�   cell_methods      time: mean (interval: 1 month)     	long_name         eastward_wind      history       (Interpolated U with NCL 'vinth2p_ecmwf'    units         m s-1      original_units        m s-1      original_name         U      standard_name         eastward_wind      
_FillValue        `�x�     �  !�P���P���P���P���P��!P��!P��!P��!P�F�P�F�P�F�P�F�P��KP��KP��KP��KP�F�P�F�P�F�P�F�P���P���P���P���P��P��P��P��P��P��P��P��A��A�#QB�
B	FlB��B{.B�B��@=j�b���@>�۱��@>�۱��@@�&���@@�&���@@�'[��@@�'[��@A�s���V@A�s���V@B5����@B5����@B��0s>@B��0s>@C�Xn@C�Xn@DO���Aʀ A�� A�  A�@ @8�     @:     @:     @;l     @;l     @<�     @<�     @><                                                                                                                                     @�j     @��@    @���    @�     @�L     @�j     @�     @�L     @�j     @ӈ     @�L     @È     @�X     @��     @�p     @�@     @�@     4OE�4��b4���4���5h5sN5�
5�=35�rv6��6$+y6E�5585�Gy5̄_5Ƣ�3�0�4�8�5M55��4(n4:5�5mW�5��5�̪5�4 5��5�K�6Bh�6t׽6���C��JC��yC��C�ZC�YC��C��RC��C�>C�ڼC��]C��
C�C��C�ƄC���C��7C�MBC�)�C�wC�X	C�g6C�( C�C�C��8C��=C�YC�DC��nC�G C�d�C���A&H/    A&H    A&HN    `�x�`�x�`�x�`�x�`�x�>e>���>���?q��?���?Q��>�R�?��?���?��<^�7?)�`�x�`�x�`�x�`�x�`�x�`�x�`�x�`�x�`�x�`�x�`�x�`�x�`�x�`�x�`�x�f�������V��a��w��>t�1?�Ƚ���<��M>T��>���>y�=Q'<��O/���{�>b���ӊ�̠t�����P�l����~����� B�������%��� �&����ON@��@�@p(@��?��>?�b@rr@^�?���?�D?��c?�O�?0?��>���=��>��>
Y�N1V�	j�;qH��������}b���%��J����տ���IB��(,��;c���@˫y@�n@��&@�u�@��@��(@���@�G�@�T@��W@��1@��4@fD�@ex@j �@{ey@;"�@.�@$�s@%�@kZ@��?��b?�j@� ?�;?��?���?�1�?�D=?��@��A��A��A.�A�@��A�A��Axr@ӈq@߸�@��Z@�X�@���@�$D@�)R@ͅ)@��@��@���@�L@�
!@�^g@�a@��h@|�@{t*@{u�@���@yX�@z#@|�@���A:E�AC�}AKO�AP�A!dA(�IA1��A:�AGA� A&YA+�@�E@��o@�F>An%@�!m@��=@��@�zD@�9T@�@@�
@��-@�	4@�5�@���@�[�@�Ed@��;@���@���A���A��A�A���Af�Ar"�A�Z A�xTA*��A1�aA>;|AM]�@��*A�2A�gAR�@�A�@�.�@�0�A`�@�b�@�o@�q�A��@�H�@�?�AQA	À@�5@��9A�bA5KA֗�A��A�ԎA�loA���A�ۡA��AԜTA�3�A�dA��A���A=6AF�4AT�Aet�A�A�-A�A$E]A ��A�8A��A9\A�jA��A��A&�A<XA�	ASuA&��A���B�0B��B
GA��A�/�A�|DB �A�A�Aͬ�A�Q�A��A��
A��A�MA/�jA8��AD"AT��AAJ�A#��A1jA`}A �	A)́A6�0A"�A(u�A0S�A:&BV@B�Bd8B��B��B	%xB��B��A��A�5A�A�ddA�VCA�b=A�\A�n�A~�UA��A�ɽA��(AK�ATfrA^�=Al�A=�AF��APY�A\>A?TPAF*�AM�aAW[�BffB5�Bg�BɲBޭB�B�B�#A�YrA�?�A��A�6KA�oA�AͧvA��A��eA���A���A�BIA�}�A���A�^�A���Ax,vA|��A�ӸA��Aa�AeN"AjX2Aqe�A�q�A�T�A�2�A�>
A��A��A�~dA��A�G�A���A�xA��YA�O�A���A�ڤA��pA��EA�uA�0�A��
A{��A��A��}A���A`�BAb2^Ae)Ai�AFf{AFޞAIN�AM��A�vA#�A)�qA.ΏA$��A)n�A-чA2�VA#[A)�A-�A1�A�A!9�A&�A+T%A�A��AZA��AG>A	��Ag$AN@�=�@�z�AƛA�@�i�@��T@��@�Z>�4y?% J?F��?b��?��?�]?�$:@c?��/@[�@��@+��@j@��@0��@Bu@�\@.��@>j�@MQ�@!i}@0��@?�{@L��@�u@&�@4��@AS�@
+�@�e@"3�@.|��u��u�E�u���v���;��7�|�3���1CY�z���1�������	b��ǈ���R��<� �"��>��f��O#��Pn�ߚ����m��_P��[Q������迨�|�����5������ ��g�4�iD�i���j�G�1uX�1���1��2F��
������]F�����R��Ӊ��4L���4����Ҷ���u���w����{���Z��0O�����>��G��7忻F�F9��Ŀ�ٝ�ԓ��O#�R:]�Ub�WZ ��I�!��y���F������U�������-�C	C�B��EB��I�¾��r��,d�����[�F���C��f��:��Q�s�M�������=��ɾ����8U�WV&���&
echo begin complete fhcf.common src jar

D:/JDK/Java/jdk1.7.0_71/bin/jar -cvf E:/My_Project/msth/fhcf.manager/webapp/WEB-INF/lib/fhcf.common.jar -C E:/My_Project/msth/fhcf.common/bin cn
D:/JDK/Java/jdk1.7.0_71/bin/jar -uvf E:/My_Project/msth/fhcf.manager/webapp/WEB-INF/lib/fhcf.common.jar -C E:/My_Project/msth/fhcf.common/src cn

D:/JDK/Java/jdk1.7.0_71/bin/jar -cvf E:/My_Project/msth/fhcf.portal/webapp/WEB-INF/lib/fhcf.common.jar -C E:/My_Project/msth/fhcf.common/bin cn
D:/JDK/Java/jdk1.7.0_71/bin/jar -uvf E:/My_Project/msth/fhcf.portal/webapp/WEB-INF/lib/fhcf.common.jar -C E:/My_Project/msth/fhcf.common/src cn

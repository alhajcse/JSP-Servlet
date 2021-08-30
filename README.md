# JSP Servlet with Tomcat
# Tomcat Server(Mac OS):
Download Apache Tomcat  
Visit to Apache Tomcat site
http://tomcat.apache.org/  
Download the zip file or tar file

 cd Downloads   
Downloads: cd apache-tomcat-9.0.52   
apache-tomcat-9.0.52:  cd bin 


EATL@Users-MacBook-Pro bin % ls -al *.sh      
-rwxr-xr-x@ 1 EATL  staff  25294 Jul 31 06:12 catalina.sh  
-rwxr-xr-x@ 1 EATL  staff   1997 Jul 31 06:12 ciphers.sh  
-rwxr-xr-x@ 1 EATL  staff   1922 Jul 31 06:12 configtest.sh  
-rwxr-xr-x@ 1 EATL  staff   9100 Jul 31 06:12 daemon.sh  
-rwxr-xr-x@ 1 EATL  staff   1965 Jul 31 06:12 digest.sh  
-rwxr-xr-x@ 1 EATL  staff   3382 Jul 31 06:12 makebase.sh  
-rwxr-xr-x@ 1 EATL  staff   3708 Jul 31 06:12 setclasspath.sh  
-rwxr-xr-x@ 1 EATL  staff   1902 Jul 31 06:12 shutdown.sh  
-rwxr-xr-x@ 1 EATL  staff   1904 Jul 31 06:12 startup.sh  
-rwxr-xr-x@ 1 EATL  staff   5540 Jul 31 06:12 tool-wrapper.sh  
-rwxr-xr-x@ 1 EATL  staff   1908 Jul 31 06:12 version.sh

There is no executable permissions for the .sh files.


# Make the file executable
You just need to give a chmod here and then   +x. +x is going to make this file executable and what are the files we want to make executable we want to make all .sh files   so just give *.sh.

chmod +x *.sh

# Start the Tomcat by startup.sh

then sudo ./startup.sh

Now how to check whether Tomcat that is properly started or not I’m going to go to my browser and in here I will just write http://localhost:8080. The port 8080 is the default port for the Tomcat to start.

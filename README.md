Link to JEP:  https://openjdk.java.net/jeps/408

Java 18 now includes the Simple Web Server, a utility (and API) that allows you to painlessly launch a basic web server. 
The implementation of a web server in Java is hardly a new concept, in fact, the HttpServer package has been included since 2006.
But with this inclusion, Java includes a command-line utility that allows you to launch this web server. 
Launching this utility is easy, just run the jwebserver program in $JAVA_HOME/bin. This utility is great for basic code testing,
as well as an educational tool for up-and-coming web programmers.

Note that jwebserver is designed for development, testing, and ad hoc programming. It is NOT designed to be
a Jakarta EE compliant application server, nor is it a servlet container like Tomcat, it is merely an HTTP
server designed to serve static files.
 
This program looks at the Simple Web Server API.


Usage: mvn clean package
       java -jar .\target\java18-new-features-simple-web-server-1.0-SNAPSHOT.jar

 

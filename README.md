# ExpidiaTask

The project is built using Java programming language. The project let you search for hotels in all over the world, using the city name and the date of start/end travel. The hotels are filtered by star rating and can view the detials of the hotel by pressing on the button number in the same row of the hotel in the column name view hotel.<br /><br />

<h4>Prerequisites:</h4>
JDK, Maven and Tomcat.

<h4>Installing:</h4>
Install one of IDE's like netbeans or eclipse.<br />
Install maven or use the maven inside the IDE.<br />
	For operating systems:<br />
	&emsp;- Linux/Unix command line: sudo apt-get install maven.<br />
	&emsp;- Follow the instructions in this URL for windows: http://www.mkyong.com/maven/how-to-install-maven-in-windows/<br />
	IDE:<br />
	&emsp;- Maven plugin/ built in.<br />
Install Apache Tomcat to deploy the project in.<br />
	&emsp;https://tomcat.apache.org/download-80.cgi<br />
You can use tomcat in two ways to deploy the project:<br />
	&emsp;- Connect IDE with the tomcat and deploy the project using IDE.<br />
	&emsp;- Copy the files to tomcat folder.<br />


<h4>Deployment:</h4>
Clean and build the project to generate a folder name target, which contains .war file.<br />
Clean and build project done by using:<br />
command line:<br />
&emsp;- mvn clean install<br />
OR<br />
&emsp;- clean and build option in IDE tool.<br />
Turn on the tomcat to deploy .war file in the tomcat webapps folder or by IDE.<br />
For local use, you can access the website using localhost/app, ip address/app or by configure url in tomcat server.xml.<br />

<h4>Built With:</h4>
Java prgramming language using Servlet and JSP.<br />
Maven dependency management.<br />

<h4>Author:</h4>
Ahmad Abu-Qura

# gigasetelements
Gigasetelements Java API

A small Java project to connect to a Gigasetelements base station. 

Inspired by the Python command line version that can be find under 

https://github.com/dynasticorpheus/gigaset-elements

The first release can simply query the status of the base, the sensors and list the last N events. <br/>
The base status can also be changed. <br/>
Basic Listeners can be registered. <br/>
No cron actions functionalities have bene added (yet).<br/>

The needed dependencies are given in Maven. The minimal Java version is 1.7.

There are two different implementations:

- for Jersey 2.17     --> Glassfish 4
- for RestEasy 3.0.10 --> Wildfly 8.2.0

Both versions work as standalone application (see JUnit test) or can be deployed to the Application Server.

Maven Targets
------------------------------------------------------------------------------------------
- install
- jar:jar to generate target/GigasetElementsAPI-1.0.0.jar
- dependency:copy-dependencies to export the dependencies (jar) to target/dependency

Usage
------------------------------------------------------------------------------------------
The service method getBase() queries the status of your GigasetElements Base at home:

```java
GigasetElements service = new GigasetElementsRestEasy(username, password);
Base base = service.setEventsCount(10).getBase();
Mode mode = base.getMode();
System.out.println(base.getAttributes());
for (Sensor sensor : base.getSensors()) {
	System.out.println(sensor.getAttributes());
	for (Event event : sensor.getEvents()) {
	  System.out.println(event.getAttributes());
	}
}
for (Event event : base.getEvents()) {
	System.out.println(event.getAttributes());
}
Mode mode = base.getMode();
service.setMode(base, Mode.CUSTOM);
service.setMode(base, mode);
```

You can also register some Listener to the GigasetElements service; they are applied just after calling getBase():

- SensorEventListener
- SensorTypeEventListener
- ModeListener
- SensorListener

Wildfly Deployment
------------------------------------------------------------------------------------------
In Wildfly you have to add the file jboss-deployment-structure.xml in the META-INF dir of the .ear or in the WEB-INF of the .war. The <b>GigasetElementsAPI-*.jar</b> and all dependency jars have to be added to the lib dir, all resteasy jars and the two http*.jar have to be excluded because they are already part of the Wildfly modules.

```xml
<?xml version="1.0"?>
<jboss-deployment-structure xmlns="urn:jboss:deployment-structure:1.2" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	
	<deployment>
		<dependencies>
			<module name="org.apache.httpcomponents" export="true" />
		</dependencies>
	</deployment>
	
</jboss-deployment-structure>
```

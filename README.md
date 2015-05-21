# gigasetelements
Gigasetelements Java API

A small Java project to connect to a Gigasetelements base station. 

Inspired by the Python command line version that can be find under 

https://github.com/dynasticorpheus/gigaset-elements

The first release can simply query the status of the base, the sensors and list the last N events. 
The base status can also be changed. 
Basic Listeners can be registered. 
No cron actions functionalities have bene added (yet).

The needed dependencies are given in Maven. The minimal Java version is 1.7.

There are two different implementations:

- for Jersey          --> Glassfish
- for RestEasy 3.0.10 --> Wildfly 8.2.0

Both versions work as standalone application (see JUnit test) or can be deployed to the Application Server.

Have fun!

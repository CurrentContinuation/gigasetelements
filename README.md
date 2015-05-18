# gigasetelements
Gigasetelements Java API

A small Java project to connect to a Gigasetelements base station. 

Inspired by the Python command line version that can be find under https://github.com/dynasticorpheus/gigaset-elements

The first release can simply query the status of the base, the sensors and list the events. The base status can also be changed. Basic Listeners can be registered. No cron actions functionalities have bene added.

As an example use case I added a scheduled bean that puts the system in HOME status when a phone IP is reachable.

The needed dependencies are given in Maven. The minimal Java version is 1.7

Have fun!

# shiro-geonetwork

## Work in progress: Configuration for integrating apache shiro and geonetwork. 

Designed to allow you to log in to Apache Zeppelin with the usernames and passwords from Geonetwork, stored in a PostgreSQL database.

### Prerequisites

* Apache Zeppelin (0.8.2 is known to work)
* PostgreSQL driver jar file from [https://mvnrepository.com/artifact/org.postgresql/postgresql/42.1.10](https://mvnrepository.com/artifact/org.postgresql/postgresql/42.1.10) copied into Zeppelin's `lib` folder
* Geonetwork 3.8.x (3.4.x or upwards should work) with geonetwork database stored in PostgreSQL
* Apache Maven (for building jar file with dependencies)

### Instructions

* Clone or download this repository
* In the `geonetwork integration` folder execute `mvn package`
* From the `geonetwork-integration\target` folder, copy `testshiro-1.0-SNAPSHOT-jar-with-dependencies.jar` to Zeppelin's `lib` folder
* From the `conf` folder adapt `shiro.ini.geonetworkexample` to match your Geonetwork postgreSQL database credentials
* In zeppelin's `lib` folder take a back up of the existing `shiro.ini` file and replace it with `shiro.ini.geonetworkexample` (renaming as you do so)
* Restart shiro- you should now be able to log in with your existing geonetwork administrative credentials


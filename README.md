# shiro-geonetwork

## Work in progress: Configuration for integrating apache shiro and geonetwork. 

Designed to allow you to log in to Apache Zeppelin with the usernames and passwords from Geonetwork, stored in a PostgreSQL database.

### Prerequisites

* Apache Zeppelin (0.73 works for us)
* PostgreSQL driver from [https://mvnrepository.com/artifact/org.postgresql/postgresql/42.1.4](https://mvnrepository.com/artifact/org.postgresql/postgresql/42.1.4) copied into Zeppelin's `lib` folder
* Geonetwork 3.2.x (not tested on 3.0.x or 3.4.x) with data stored in PostgreSQL
* Apache Maven (for building jar file wit dependencies)

### Instructions

* Clone or download this repository
* In the `geonetwork integration` folder execute `mvn package`
* From the `geonetwork-integration\target` folder, copy `testshiro-1.0-SNAPSHOT-jar-with-dependencies.jar` to Zeppelin's `lib` folder
* From the `conf` folder adapt `shiro.ini.geonetworkexample` to match your Geonetwork postgreSQL database credentials
* In zeppelin's `lib` folder take a back up of the existing `shiro.ini` file and replace it with `shiro.ini.geonetworkexample` (renaming as you do so)
* Restart shiro- you should now be able to log in with your existing geonetwork administrative credentials


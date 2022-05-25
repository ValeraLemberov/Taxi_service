# Welcome to taxi service
Taxi Service is a Web application that implements authentication, registration, and database operations. Application functionality:
- Show all drivers and remove from database of choice.
- Show all cars and remove from database of choice.
- Show all manufacturers and remove from database of choice.
- Add new manufacturer to database.
- Add new driver to database.
- Add new car to database.
- Assigning a driver from the database to a car from the database.
- Show all current assign cars on the driver.
---
## This application has a three-tier architecture.

- Dao - work with database by CRUD operation.
- Service - business logic, working with data before reading or writing to the database.
- Controllers - Presentation layer, work with commands from user and sending incoming data to service.
---

## Using technologies:
- Java 11
- Tomcat - version 9.0.50
- MySQL
- JDBC
- Servlet
- JSTL
- JSP
- HTML
- CSS
---
## How to run "taxi_service"

First of all, you need to install MySql and Tomcat version 9 installed.
1. Connect Tomcat to yours intelligent idea.
2. Clone this repository.
3. Using [init.db.sql](src/main/resources/init_db.sql) in MySQL to create tables and columns.
4. Configure **URL**, **USERNAME**, **PASSWORD**, **JDBC_DRIVER** in [ConnectionUtil](src/main/java/taxi/util/ConnectionUtil.java).
5. In file [log4j.xml](src/main/resources/log4j.xml) you need at line ```<File name="LogToFile" fileName="/logs/app.log">```<br>
  change ```/logs/app.log``` on absolute path to file ```.log```.
6. Configure ```Application context``` in Tomcat.
   * Edit configurations...
   * Deployment
   * Application context: 
   * Change on ```/```
7. You can run "taxi_service"!
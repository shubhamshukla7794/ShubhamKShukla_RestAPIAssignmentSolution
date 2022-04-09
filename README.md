#  Great Learning Assignment 6 - Employee Management - Spring Boot and Spring Security

This repo contains the project **Great Learning Assignment 6 - Employee Management - Spring Boot and Spring Security**. This is a Spring Boot application along with Spring Security developed for [**E&ICT IIT Roorkee: Advanced Certificate Program in Full Stack Software Development**](https://www.greatlearning.in/advanced-certification-full-stack-software-development-iit-roorkee) certification.


##  Problem Statement

Create a Employee Management Rest API based Web application, where you will be developing CRUD(Create,Read,Update and Delete) functionality along with Sorting and some concepts of security.

Also, the application should be able to add roles in the database dynamically and should be able to add Users in the db which can be used for authentication purposes.


##  Working with College Fest in your IDE

###  Prerequisites

The following items should be installed in your system:

* Java 11 or newer

* Your preferred IDE

* [Postman Tool](https://www.postman.com/downloads/ "Postman Tool")

###  URL

The starting URL which is used is http://localhost:8080/api/employees


###  Database configuration
- The Employee Management Spring Boot Application uses H2 Database
- The H2 console can be accessed at http://localhost:8080/h2-console/
- The credentials for login in H2 Console is
    > **Username** - `root`
    > 
    > **Password** - `root`

### Account Details
The script in [data.sql](https://github.com/shubhamshukla7794/ShubhamKShukla_RestAPIAssignmentSolution/blob/main/EmployeeManagement/src/main/resources/data.sql "data.sql") populates the `admin` details with the following credentials 
- The credentials for **ADMIN** login is
    > **Username** - `admin`
    > 
    > **Password** - `admin`

## Issue Faced

While implementing search funtionality there was an issue `java.lang.IllegalArgumentException: Parameter value [%dean%] did not match expected type [java.lang.Character (n/a)]`. I have explained the issue [here](https://github.com/shubhamshukla7794/ShubhamKShukla_RestAPIAssignmentSolution/issues/1) and how I resolved it.


##  Application

The following video shows the functionalities of **Admin** account in **Employee Management** using Postman

https://user-images.githubusercontent.com/37581959/162357965-0b11fd06-420b-48c8-b1a0-f9dc00044f61.mp4


The following video shows the functionalities of **User** account in **Employee Management** using Postman

https://user-images.githubusercontent.com/37581959/162357974-c046d787-1aab-4f6b-be41-806533aee9d0.mp4



You can also view all the screenshots of the project in [EmployeeManagementScreenshots.pdf](https://github.com/shubhamshukla7794/ShubhamKShukla_RestAPIAssignmentSolution/blob/main/EmployeeManagementScreenshots.pdf "EmployeeManagementScreenshots.pdf")


##  Author

Project created by :

**SHUBHAM KUMAR SHUKLA**

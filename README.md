Student Management System (Hibernate)

This project is a simple implementation of a Student Management System using Hibernate. The main goal of this project is to understand how Hibernate works as an ORM tool and how we can perform basic database operations without writing SQL queries manually.

Objective:
The objective of this project is to perform CRUD operations (Create, Read, Update, Delete) on student data using Hibernate.

Technologies Used:
Java
Hibernate
MySQL
Maven
Eclipse IDE

Project Structure:
The project contains the following main components:

* Student.java → Entity class representing student table
* StudentDAO.java → Contains CRUD operations
* HibernateUtil.java → Handles Hibernate configuration and session factory
* MainApp.java → Main class to run the program
* hibernate.cfg.xml → Configuration file for database connection

Database Setup:
First, create a database in MySQL:
CREATE DATABASE tests;

Hibernate will automatically create the table when the program runs.

How to Run:

1. Open the project in Eclipse or IntelliJ
2. Make sure Maven dependencies are updated
3. Check database username and password in hibernate.cfg.xml
4. Run MainApp.java
5. Output will be displayed in the console

Functionalities:

* Insert student records into database
* Fetch all students
* Fetch student by ID
* Update student details (name and course)
* Delete student record

Sample Output:
Student List:
1 Akarsh Java
2 punith Python
3 Meghana AI

After Update:
1 hemanth 

After Delete:
1 hemanth
3 Meghana

Key Concepts Learned:

* Hibernate ORM mapping
* Use of annotations like @Entity and @Id
* Session and Transaction handling
* Performing CRUD operations using Hibernate

Conclusion:
This project helped in understanding how Hibernate simplifies database interaction by mapping Java objects to database tables. It reduces the need for writing SQL queries and makes development easier and cleaner.

Author:
Meghana M

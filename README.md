# Java MVC Full-Stack Student Management

## Technologies
- Java 17
- Spring Boot
- Spring MVC
- Thymeleaf HTML/CSS/JavaScript frontend
- Spring Data JPA
- H2 Database
- Maven

## Architecture

Frontend (HTML/CSS/JS)
        ↓
Controller
        ↓
Service
        ↓
Repository
        ↓
H2 Database

## Run
1. Install JDK 17 and Maven.
2. Open this folder in IntelliJ IDEA, Eclipse, or VS Code.
3. Run:
   mvn spring-boot:run
4. Open:
   http://localhost:8080

## Database
H2 database files are stored under:
./data/studentdb

H2 console:
http://localhost:8080/h2-console

JDBC URL:
jdbc:h2:file:./data/studentdb

Username:
sa

Password:
(empty)

## What the application does
- Displays a student form.
- Saves student data into the database.
- Reads data from the database and displays it in the frontend.
- Deletes a student.
- Demonstrates the complete Java MVC + frontend + database flow.

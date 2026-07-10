# BrainXNext Learning Platform - Backend API

A robust and scalable RESTful API for the BrainXNext Learning Platform, built with Java, Spring Boot, and PostgreSQL. The API powers authentication, user management, course management, enrollments, and other core learning platform features.

---

## 🚀 Features

- Secure RESTful API
- JWT Authentication & Authorization
- Role-Based Access Control (Admin, Instructor, Student)
- User Management
- Course Management
- Enrollment Management
- Lesson Management
- Quiz & Assignment APIs
- Input Validation
- Global Exception Handling
- Pagination & Sorting
- Database Integration with PostgreSQL

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Hibernate
- Maven
- Lombok
- JWT Authentication

---

## 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   ├── config
│   │   ├── controller
│   │   ├── dto
│   │   ├── entity
│   │   ├── exception
│   │   ├── repository
│   │   ├── security
│   │   ├── service
│   │   └── BrainxnextApplication.java
│   └── resources
│       ├── application.properties
│       └── static
└── test
```

---

## ⚙️ Prerequisites

- Java 21 (or later)
- Maven
- PostgreSQL

---

## 📦 Installation

Clone the repository

```bash
git clone https://github.com/your-username/brainxnext-learning-platform-backend.git
```

Navigate to the project

```bash
cd brainxnext-learning-platform-backend
```

Install dependencies

```bash
mvn clean install
```

---

## 🗄️ Database Configuration

Configure your PostgreSQL database in `application.properties`.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/brainxnext
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true
```

---

## ▶️ Running the Application

```bash
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

## 🔐 Authentication

Protected endpoints require a JWT token.

Example header:

```http
Authorization: Bearer YOUR_ACCESS_TOKEN
```

---

## 📚 API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Login |
| GET | `/api/users` | Get all users |
| GET | `/api/courses` | Get all courses |
| POST | `/api/courses` | Create a course |
| PUT | `/api/courses/{id}` | Update a course |
| DELETE | `/api/courses/{id}` | Delete a course |

---

## 🧪 Running Tests

```bash
mvn test
```

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Mohammad Hasibul Hasan**

Java Backend Developer

**Tech Stack:** Java • Spring Boot • Spring Security • PostgreSQL • Hibernate • REST API

---

⭐ If you found this project helpful, consider giving it a star!
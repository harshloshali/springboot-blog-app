# 📝 Spring Boot Blog API

A simple RESTful blog application built with Spring Boot, Spring Data JPA, and MySQL. It allows users to perform CRUD (Create, Read, Update, Delete) operations on blog posts via a REST API.

---

## 🚀 Features

- Create, Read, Update, Delete blog posts
- RESTful API with clear endpoints
- Uses DTOs for data abstraction
- JPA & Hibernate integration for DB persistence
- Exception handling with custom responses
- MySQL database integration
- Clean and layered project structure

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Maven**

---

## 📁 Project Structure

springboot-blog-app/
├── src/
│ ├── main/
│ │ ├── java/com/harsh/blog/
│ │ │ ├── controller/
│ │ │ ├── dto/
│ │ │ ├── entity/
│ │ │ ├── repository/
│ │ │ └── service/
│ │ └── resources/
│ │ ├── application.properties
├── pom.xml
└── README.md

---

## 📦 Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/harshloshali/springboot-blog-app.git
cd springboot-blog-app
2. Configure MySQL
Create a database named blogdb

Update src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/blogdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3. Run the Application

./mvnw spring-boot:run
or from IDE → run the BlogApplication main class.

🧪 API Endpoints
Method	Endpoint	Description
GET	/api/posts	Get all posts
GET	/api/posts/{id}	Get post by ID
POST	/api/posts	Create a new post
PUT	/api/posts/{id}	Update post
DELETE	/api/posts/{id}	Delete post

🧠 Future Enhancements
Add Redis caching

Integrate Kafka for event streaming

JWT-based authentication & authorization

Pagination and filtering

Swagger/OpenAPI documentation

👨‍💻 Author
Harsh Loshali
GitHub: @harshloshali

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.


---



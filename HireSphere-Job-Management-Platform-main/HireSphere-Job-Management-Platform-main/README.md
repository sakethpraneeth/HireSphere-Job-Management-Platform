# HireSphere – Job Management Platform

HireSphere is a full-stack web application that enables users to manage job postings efficiently. Built using **Spring Boot**, **React**, and **MySQL**, it offers a seamless CRUD experience for job listings through RESTful APIs and a modern UI.

## 🚀 Features

* Create, read, update, and delete job posts
* RESTful API integration between backend and frontend
* MySQL database integration with Spring Data JPA
* Responsive UI built with React
* Modular structure for easy scalability

## 🧩 Tech Stack

* **Backend:** Spring Boot (Java), Spring Data JPA
* **Frontend:** React.js
* **Database:** MySQL
* **Build Tools:** Maven, npm

## ⚙️ Setup Instructions

### Backend (Spring Boot)

1. Navigate to the backend folder:

   ```bash
   cd Backend/spring-boot-rest
   ```
2. Update your MySQL credentials in `application.properties` if needed:

   ```properties
   spring.datasource.username=root
   spring.datasource.password=Siri@2010
   ```
3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

   The backend runs on **[http://localhost:8080](http://localhost:8080)**

### Frontend (React)

1. Navigate to a frontend folder (e.g., CRUD UI):

   ```bash
   cd Frontend/CRUD\ UI
   ```
2. Install dependencies and start:

   ```bash
   npm install
   npm start
   ```

   The frontend runs on **[http://localhost:3000](http://localhost:3000)**

## 📂 API Endpoints

| Method | Endpoint       | Description           |
| ------ | -------------- | --------------------- |
| GET    | /api/jobs      | Get all job posts     |
| POST   | /api/jobs      | Create a new job post |
| PUT    | /api/jobs/{id} | Update a job post     |
| DELETE | /api/jobs/{id} | Delete a job post     |

## 🧠 Author

**Abhinav Yagnamurthy**
Full Stack Developer | Java | Spring Boot | React | MySQL

## 🪪 License

This project is open-source and available under the [MIT License](LICENSE).

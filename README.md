# Kotlin Spring Boot Backend

This is a backend service built with **Spring Boot (Kotlin)**, using **JWT for authentication**, **MongoDB** as the database, and **GitHub Actions** for CI/CD deployment to a **VPS**.

---

## Tech Stack

- Kotlin + Spring Boot
- JWT (JSON Web Token) authentication
- MongoDB (NoSQL database)
- GitHub Actions (CI/CD pipeline)
- VPS for deployment (via SSH)

---

## Project Structure

src/
 └── main/
     ├── kotlin/           # Application source code
     ├── resources/        # Application configs (application.yml, etc.)

---

## Features

- User registration and login with JWT
- Role-based access control (if applicable)
- REST API endpoints for [your features]
- MongoDB integration
- Auto-deployment to VPS using GitHub Actions

---

## Authentication

Authentication is handled via JWT. Users authenticate with a username/email and password, and receive a token to access protected endpoints.

---

## Deployment (CI/CD)

Deployment is handled automatically using GitHub Actions:

- On every push to main, the app is built and deployed to a remote VPS using SSH.
- You can find the workflow file in .github/workflows/deploy.yml

---

## Running Locally

Prerequisites
- Java 17+
- Docker (for MongoDB)
- Gradle

## Steps

### Clone the repo
git clone https://github.com/Stan-Balabushevich/spring_boot_notes_backend

### Start MongoDB (optional)
docker run -d -p 27017:27017 --name mongodb mongo

### Run the application
./gradlew bootRun

---

## Environment Variables

Create a file named .env or use your system environment variables:

JWT_SECRET=your-secret-key
MONGO_URI=mongodb://localhost:27017/your-db

---

## GitHub Actions Workflow (Short Overview)

### .github/workflows/deploy.yml
- Trigger: push to main
- Build project
- SSH into VPS
- Pull latest code & restart app (e.g., using systemd or docker)




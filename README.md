# Fresh Vegetable Sales Web Application (Backend)

## Project Overview

This project is the **backend** of a fresh vegetable sales web application, developed in **Java** using the **Spring Boot** framework. The backend handles core functionality such as user authentication, authorization, product and order management, as well as Redis caching. It provides the service infrastructure for a fresh product sales platform.

## Technology Stack

- **Java 1.8**
- **Spring Boot 2.5.4**
- **MySQL 8.0.31**
- **Redis**
- **MyBatis Plus 3.5.1**
- **JWT (JSON Web Token)**
- **Fastjson 2.0.12**
- **PageHelper**
- **Maven**

## Project Structure

- **src/main/java/cn/woniu**
  - **config:** Configuration classes for settings like database connection and Redis.
  - **controller:** Controllers that handle HTTP requests and return responses.
  - **dao:** Data Access Layer, responsible for database interactions.
  - **entity:** Entity classes, mapping Java objects to database tables.
  - **service:** Service layer containing business logic.
  - **utils:** Utility classes, such as JWT token creation/validation and MD5 encryption.
  - **redis:** Code related to Redis, used for caching and optimizing data access.
  
- **resources/mappers:** MyBatis XML mapping files, which define SQL queries and their mapping to Java objects.

- **pom.xml:** Maven configuration file for managing dependencies and build settings.

## Features

- **User Authentication and Authorization:** JWT is used for token-based authentication, and Redis is used for caching session data.
- **Authorization Management:** Role-based authorization ensures that different roles have access to specific resources.
- **Product Management:** CRUD operations for product management.
- **Order Management:** Functionality to create, update, and query orders.
- **Pagination:** Integrated with PageHelper for handling large datasets with pagination.

## Requirements

- **JDK 1.8**
- **Maven 3.6+**
- **MySQL 5.7+**
- **Redis 6.0+**

## Installation and Setup

### 1. Clone the Project

```bash
git clone https://github.com/your-repository/fresh-vegetable-app.git
cd fresh-vegetable-app
```

### 2. Configure the Database

Ensure you have MySQL installed and set up. Run the following SQL command to create the database:

```sql
CREATE DATABASE fresh_food CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

### 3. Update the Database Configuration

Modify the database connection settings in the `src/main/resources/application.yml` file:

```yaml
spring:
  datasource:
    url: jdbc:mysql://<your-database-ip>:3306/fresh_food?characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai
    username: <your-database-username>
    password: <your-database-password>
```

### 4. Configure Redis

Ensure Redis is installed and running. Update Redis connection details in the `application.yml` file:

```yaml
spring:
  redis:
    host: 127.0.0.1
    port: 6379
    database: 0
```

### 5. Run the Application

To start the project, use Maven:

```bash
mvn spring-boot:run
```

The application will be available at `http://localhost:8080`.

## Key Dependencies

The following are the primary dependencies used in the project:

```xml
<dependencies>
    <!-- Spring Boot Core -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Redis Caching -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-redis</artifactId>
    </dependency>

    <!-- MyBatis Plus for ORM -->
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
        <version>3.5.1</version>
    </dependency>

    <!-- MySQL Driver -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>8.0.31</version>
    </dependency>

    <!-- JWT Authentication -->
    <dependency>
        <groupId>com.nimbusds</groupId>
        <artifactId>nimbus-jose-jwt</artifactId>
        <version>9.11.1</version>
    </dependency>

    <!-- Fastjson for JSON Serialization -->
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>fastjson</artifactId>
        <version>2.0.12</version>
    </dependency>

    <!-- Pagination Helper -->
    <dependency>
        <groupId>com.github.pagehelper</groupId>
        <artifactId>pagehelper-spring-boot-starter</artifactId>
        <version>1.3.1</version>
    </dependency>
</dependencies>
```

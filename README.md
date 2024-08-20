# Fresh-vegetable-app

This project is a full-stack web application designed to manage and display information about fresh vegetables. The app offers a comprehensive solution for cataloging, tracking, and interacting with produce data through an intuitive user interface, robust backend, and seamless database integration.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

The Fresh Vegetable App is designed to provide users with an organized platform for managing fresh produce inventory. It is ideal for grocery stores, marketplaces, and consumers to keep track of available vegetables, their pricing, and availability. The app is built with scalability and ease of use in mind, ensuring that users can efficiently manage their inventory.

## Features

- **Product Catalog Management**: Add, edit, view, and delete vegetable products.
- **Search and Filter**: Search for products based on name, category, or availability, and apply filters to refine search results.
- **Responsive Design**: The UI is optimized for desktop and mobile devices, providing a seamless user experience.
- **CRUD Operations**: Comprehensive CRUD (Create, Read, Update, Delete) functionality for managing products with validation and error handling.
- **Database Integration**: Persistent data storage using MySQL, with automated schema updates.
- **RESTful API**: Exposes RESTful API endpoints for interacting with backend services, making the app extendable and suitable for integrations.
- **User Authentication and Authorization**: Supports user roles and secure login for managing access to different features.

## Tech Stack

**Frontend:**
- HTML, CSS, JavaScript (ES6+)
- Bootstrap for responsive design
- Axios for API requests

**Backend:**
- Java with Spring Boot for RESTful APIs
- Spring Data JPA for ORM and database access
- MySQL as the database

**Tools & Libraries:**
- Maven for dependency management and project build
- JUnit for unit testing and integration testing
- Swagger for API documentation

## Installation

Follow these steps to set up and run the project locally:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Maeveyu-2024/fresh-vegetable-app.git
   cd fresh-vegetable-app
   ```

2. **Configure the Database:**
   - Ensure MySQL is installed and running.
   - Create a database named `vegetable_db`.
   - Update the `application.properties` file in the `src/main/resources` directory with your database credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/vegetable_db
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     ```

3. **Build the Project:**
   ```bash
   mvn clean install
   ```

4. **Run the Application:**
   ```bash
   mvn spring-boot:run
   ```
   The app will be accessible at `http://localhost:8080`.

## Usage

- **Access the Web Interface:** Open `http://localhost:8080` in your browser to start using the app.
- **API Documentation:** Visit `http://localhost:8080/swagger-ui.html` for API documentation and testing endpoints interactively.

## Project Structure

The project is structured as follows:

```
fresh-vegetable-app/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/freshvegetableapp/ (Java source code)
│   │   ├── resources/
│   │   │   ├── static/ (HTML, CSS, JavaScript)
│   │   │   ├── templates/ (Thymeleaf templates)
│   │   │   └── application.properties (App configurations)
│   └── test/ (Test cases)
│
├── pom.xml (Project dependencies)
└── README.md
```

## API Endpoints

Here is a summary of the key API endpoints provided by the backend:

- **GET /api/vegetables** - Retrieve a list of all vegetables.
- **POST /api/vegetables** - Add a new vegetable to the catalog.
- **PUT /api/vegetables/{id}** - Update the details of an existing vegetable.
- **DELETE /api/vegetables/{id}** - Delete a vegetable from the catalog.

For a full list of endpoints and their parameters, please refer to the Swagger documentation.

## Contributing

Contributions are welcome! If you want to contribute:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

Please make sure to update tests as appropriate and follow the code style guidelines.

## Contact

For any inquiries or support, please reach out via meaveyu@gmail.com.


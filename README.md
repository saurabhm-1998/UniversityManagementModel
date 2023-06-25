# Restaurant Management Model

The Restaurant Management System is a simple web application developed using the Spring Boot framework and Java programming language. It provides a set of RESTful API endpoints to manage restaurant information, allowing users to perform CRUD (Create, Read, Update, Delete) operations on restaurant records

## Framework and Language Used

- Framework: Spring Boot
- Language: Java

## Data Flow
The data flow in the Restaurant Management System follows a simplified architecture without the use of a service layer. Here's an overview of the data flow:

### Controller: The RestaurantController class serves as the entry point for handling incoming HTTP requests. It receives requests from clients, processes them, and directly performs the required operations on the restaurant data.

## Data Structure Used

The main data structure used in the project is the Restaurant class, which represents a restaurant entity. It includes the following attributes:

id: A unique identifier for each restaurant.
name: The name of the restaurant.
address: The address of the restaurant.
phoneNumber: The phone number of the restaurant.
specialty: The specialty or cuisine type of the restaurant.
totalStaff: The total number of staff members in the restaurant.

## Project Summary

The project is a simple Restaurant Management System implemented using Spring Boot framework in Java. It provides RESTful API endpoints to perform CRUD operations on restaurants. The application follows a basic data flow where the controller layer handles incoming requests, delegates business logic (which is minimal in this case) directly, and manages an in-memory list of restaurants. There is no explicit service layer or database integration in this example.

The purpose of this project is to demonstrate the usage of Spring Boot for building web applications, showcasing how to create API endpoints, handle HTTP requests, and manage a simple data structure within the application.

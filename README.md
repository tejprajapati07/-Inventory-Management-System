# Inventory Management System

## Project Overview
The **Inventory Management System** is a web-based application designed to help manage products, categories, suppliers, and orders. It provides functionalities to create, update, and delete records, as well as track product inventory and manage supplier information. The system also allows the user to view and manage customer orders efficiently.

## Special Features
- **Low Stock Alerts**: Products with quantities below a specified threshold (e.g., 5) are visually highlighted in red, with a tooltip indicating that the product is running low on stock.
- **Out of Stock Label**: If a product's quantity is zero, an "Out of Stock" badge is shown on the product page.
- **Dynamic Status Updates**: Orders have status management where users can update the order status (e.g., Pending, Completed, Canceled) via dropdown selection.
- **Mobile-Responsive Design**: The frontend is fully responsive, ensuring usability across all devices, including mobile, tablet, and desktop views.
- **Tooltip Overlays**: Hovering over low-stock products displays a tooltip indicating that stock is low.
- **Product Image Management**: Each product has an associated image URL for visual representation, along with fields for description, quantity, and price.
- **Supplier Management**: Manage supplier details, including contact information, ensuring an organized supplier relationship.

## Tech Stack

### Backend:
- **Java**: Core programming language used to implement the business logic.
- **Spring Boot**: Backend framework to build a REST API, handle requests, and manage dependencies.
- **Hibernate JPA**: ORM tool used to map Java objects to database tables.
- **MySQL**: Relational database for managing application data.
- **Maven**: Dependency management and build automation tool.

### Frontend:
- **JSP (JavaServer Pages)**: Technology used for displaying dynamic content in the web pages.
- **Bootstrap 4**: CSS framework used to create responsive and mobile-first UI components.
- **Font Awesome**: Icon toolkit for incorporating scalable icons in the frontend.
- **HTML5 & CSS3**: Standard web technologies for structuring and styling the application pages.

### Additional Tools:
- **Tomcat**: Embedded server for running the Spring Boot application.
- **Thymeleaf (optional)**: For rendering the frontend templates (can be used instead of JSP).
- **Spring Data JPA**: For seamless data access operations with the database.
- **Lombok**: Library used to reduce boilerplate code in the Java classes.

## System Requirements
- **JDK**: Java Development Kit (version 8 or later).
- **MySQL**: MySQL database installed and configured.
- **Maven**: Apache Maven installed for project dependency management.
- **IDE**: IntelliJ IDEA, Eclipse, or any IDE with Java and Spring Boot support.

## Screenshots

![Screenshot 2024-10-20 161846](https://github.com/user-attachments/assets/d157a788-e02e-4e70-9df7-3faf2ad17d2a)
![Screenshot 2024-10-20 161855](https://github.com/user-attachments/assets/d76a27d0-98ae-4bfa-a262-53ac256d7e11)
![Screenshot 2024-10-20 161909](https://github.com/user-attachments/assets/22f19237-e70d-439a-b18c-533c46512132)
![Screenshot 2024-10-20 161922](https://github.com/user-attachments/assets/e140b385-fd99-492a-97f0-069da769fb6a)
![Screenshot 2024-10-20 161933](https://github.com/user-attachments/assets/be7121d5-cbb2-4592-93e1-c7bc28c56d49)
![Screenshot 2024-10-20 161948](https://github.com/user-attachments/assets/e3a14d61-c53b-47f4-b551-5709db32e844)
![Screenshot 2024-10-20 162004](https://github.com/user-attachments/assets/cf60822e-6a67-4937-8c8b-5a72142ca4d3)
![Screenshot 2024-10-20 162017](https://github.com/user-attachments/assets/7c20e219-9721-44e8-b3e7-499ea1840b6a)


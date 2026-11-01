# 🏨 Hotel Reservation System

A **Java-based Hotel Reservation System** that simplifies hotel room reservation management through a console-driven interface. The application uses **Java, JDBC, and MySQL** to perform database operations efficiently, allowing users to manage guest reservations and retrieve reservation details.

📌 Project Overview

The Hotel Reservation System is a database-driven Java application designed to manage hotel reservations. It provides a simple and interactive menu through which users can perform essential reservation management operations.

The project demonstrates practical implementation of Java programming, JDBC connectivity, SQL queries, and MySQL database integration.

✨ Features

- **Reserve a Room:** Add new guest reservations with guest name, room number, and contact number.
- **View Reservations:** Display all existing reservations along with their details.
- **Get Room Number:** Retrieve room information using a reservation ID and guest name.
- **Update Reservations:** Modify existing reservation details.
- **Delete Reservations:** Remove a reservation using its unique reservation ID.
- **Reservation Validation:** Check whether a reservation exists before performing update or delete operations.
- **Database Integration:** Store and retrieve reservation records using MySQL.

🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Application development |
| JDBC | Database connectivity |
| MySQL | Database management |
| SQL | Database operations |
| IntelliJ IDEA / Eclipse / VS Code | Development environment |

🏗️ Project Structure

```text
Hotel-Reservation-System/
│
├── HotelReservationSystem.java
├── ReserveRoom.java
├── ViewReservations.java
├── GetRoomNumber.java
├── UpdateReservation.java
├── DeleteReservation.java
├── ReservationExist.java
│
└── README.md
```

Class Responsibilities

| Class | Responsibility |
|---|---|
| `HotelReservationSystem` | Main application entry point and menu management |
| `ReserveRoom` | Handles new room reservations |
| `ViewReservations` | Displays all reservation records |
| `GetRoomNumber` | Retrieves room numbers using reservation details |
| `UpdateReservation` | Updates existing reservation information |
| `DeleteReservation` | Deletes reservation records |
| `ReservationExist` | Validates reservation existence |


📚 Concepts Demonstrated

This project demonstrates practical implementation of:

- Object-oriented programming concepts in Java.
- Java Database Connectivity (JDBC).
- MySQL database integration.
- SQL CRUD operations (Create, Read, Update, Delete).
- Database connection management.
- Exception handling using try-catch.
- Resource management using try-with-resources.
- Modular programming through multiple Java classes.

🚀 Future Improvements

Some potential enhancements for future versions include:

- Implementing a graphical user interface using Java Swing or JavaFX.
- Adding user authentication and role-based access.
- Implementing room availability checking.
- Preventing duplicate room reservations.
- Adding check-in and check-out management.
- Generating reservation receipts.
- Improving database security using PreparedStatement.
- Adding input validation and better exception handling.

👨‍💻 Author

**Shibam Ghosh**
Interested in Java Development, Software Engineering, and Database Management Systems.

⭐ Support

If you find this project useful or interesting, consider giving this repository a ⭐ on GitHub!

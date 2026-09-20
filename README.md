# Hotel Management System

A RESTful Hotel Management API built using Spring Boot, Spring Data JPA, MySQL, and Swagger/OpenAPI.

## 🚀 Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST API
- Swagger / OpenAPI
- Bean Validation
- Git & GitHub

## 📌 Features

- Create a room
- Get all rooms
- Get room by ID
- Update room
- Delete room
- Request validation
- Global exception handling
- Swagger API documentation
- MySQL database integration

## 🔗 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/rooms` | Get all rooms |
| GET | `/rooms/{id}` | Get room by ID |
| POST | `/rooms` | Create a new room |
| PUT | `/rooms/{id}` | Update a room |
| DELETE | `/rooms/{id}` | Delete a room |

## 📝 Sample Request

### POST `/rooms`

```json
{
  "roomNumber": "101",
  "roomType": "DELUXE",
  "price": 3000,
  "available": true
}
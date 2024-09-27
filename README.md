# Banking Application - REST APIs with Spring Boot

## Overview
This is a simple Banking Application developed using Spring Boot. It provides RESTful APIs for basic banking functionalities, including account creation, retrieval, deposit, withdrawal, and deletion.

## Features
- **Account Creation:** Create a new bank account with an initial deposit.
- **Retrieve Account:** Get details of an existing account by its ID.
- **Get All Accounts:** Retrieve a list of all bank accounts.
- **Deposit:** Add funds to an existing account.
- **Withdraw:** Withdraw funds from an existing account.
- **Delete Account:** Remove an account from the system.

## Technologies Used
- **Spring Boot:** For building the RESTful application.
- **Spring Data JPA (Hibernate):** For data access and management.
- **MySQL:** For database management.

## Installation

### Prerequisites
- Java 11 or higher
- Maven
- MySQL Server

### Clone the Repository
```bash
git clone https://github.com/sharikSK/Banking-Application---REST-APIs-with-Spring-Boot.git
```

### Setup MySQL
1. Create a database named `bankingdb`:
   ```sql
   CREATE DATABASE bankingdb;
   ```
2. Update the `src/main/resources/application.properties` file with your MySQL credentials.

### Build and Run the Application
1. Navigate to the project directory:
   ```bash
   cd Banking-Application---REST-APIs-with-Spring-Boot
   ```
2. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints
### Create Account
- **POST** `/api/accounts/create`
- **Parameters:** `accountHolderName`, `initialDeposit`
  
### Get Account
- **GET** `/api/accounts/{id}`
  
### Get All Accounts
- **GET** `/api/accounts/all`
  
### Deposit
- **PUT** `/api/accounts/{id}/deposit`
- **Parameters:** `amount`
  
### Withdraw
- **PUT** `/api/accounts/{id}/withdraw`
- **Parameters:** `amount`
  
### Delete Account
- **DELETE** `/api/accounts/{id}`

## Testing
You can test the API using tools like Postman or cURL.

## Author
[Sharik Shaikh]

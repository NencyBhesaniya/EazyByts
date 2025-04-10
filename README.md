# Chat Application with Spring Boot and WebSocket

This project is a real-time chat application developed using Spring Boot and WebSocket. It allows users to join chat rooms, send messages, and retrieve past conversations, providing a seamless and interactive chatting experience.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Features

- **User Authentication and Authorization:**  
  Secure login and access control using Spring Security.

- **Real-Time Messaging:**  
  Instant message delivery with WebSocket for dynamic, bidirectional communication.

- **Chat Rooms:**  
  Users can join or create chat rooms dynamically.

- **Message History:**  
  Retrieve past messages from individual conversations for context and continuity.

- **User Presence:**  
  Display online/offline status of users.

- **Responsive UI:**  
  A user-friendly interface that works seamlessly on desktops, tablets, and mobile devices.

## Technologies Used

- **Backend:**
  - Java 17
  - Spring Boot
  - Spring Security
  - WebSocket
  - MongoDB
  - Spring Data MongoDB
  - Maven

- **Frontend:**
  - React.js
  - Redux
  - Material-UI

## Prerequisites

Before you begin, ensure you have the following installed:

- [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Node.js](https://nodejs.org/)
- [MongoDB](https://www.mongodb.com/try/download/community)

## Installation

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/chat-application.git
2. Backend Setup
Navigate to the backend directory, build, and run the Spring Boot application:

bash
Copy
Edit
cd chat-application/backend
mvn clean install
mvn spring-boot:run
3. Frontend Setup
Navigate to the frontend directory, install dependencies, and start the React development server:

bash
Copy
Edit
cd ../frontend
npm install
npm start
After following these steps, the application will be accessible at http://localhost:3000.

Usage
Register an Account:
Create a new user account.

Login:
Authenticate using your credentials.

Join a Chat Room:
Select or create a chat room to join.

Send Messages:
Communicate in real time with other users.

View Message History:
Access previous conversations within chat rooms.

API Endpoints
Authentication
Register:
POST /api/auth/register
Register a new user.

Login:
POST /api/auth/login
Authenticate a user and retrieve a JWT token.

Chat Rooms
List Chat Rooms:
GET /api/chatrooms
Retrieve a list of all chat rooms.

Create Chat Room:
POST /api/chatrooms
Create a new chat room.

Messages
Retrieve Messages:
GET /api/messages/{chatroomId}
Retrieve messages for a specific chat room.

Send Message:
POST /api/messages/{chatroomId}
Send a message to a specific chat room.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Acknowledgments
Spring Boot Guides

React Documentation

MongoDB Manual

How to Write a Good README File

PurpleBooth's README Template

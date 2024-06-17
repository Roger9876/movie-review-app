# Movies Review Application

A Fullstack Movies Review Application built using Java Spring Boot, MongoDB, and ReactJS. This application allows users to see movie reviews, write reviews, and watch trailers.

## Prerequisites

Before you begin, ensure you have the following installed:

- **Java 21** or later
- **Node.js** (with npm)
- **MongoDB**

## Installation

### Backend (Spring Boot)

1. **Clone the repository:**

    ```bash
    git clone https://github.com/Roger9876/movies-review-app.git
    cd movies-review-app/backend/movies
    ```

2. **Set up environment variables:**
    Create a `.env` file in the `resources` directory and add your MongoDB URI details (please refer `.env.example` & `application.properties` file).

3. **Build the application:**

    ```bash
    ./mvnw clean install
    ```

4. **Run the application:**

    ```bash
    ./mvnw spring-boot:run
    ```

### Frontend (ReactJS)

1. **Navigate to the frontend directory:**

    ```bash
    cd ../frontend/movies-v1
    ```

2. **Install dependencies:**

    ```bash
    npm install
    ```

3. **Run the application:**

    ```bash
    npm start
    ```

## Features

- **See Movies Reviews:** Browse through a collection of movie reviews.
- **Write Review:** Authenticated users can write and submit their own movie reviews.
- **Watch Trailer:** Watch trailers for the listed movies directly in the application.

## Libraries and Tools Used

### Backend

- **Spring Boot**
- **MongoDB**
- **spring-dotenv:** For environment variable management.

### Frontend

- **ReactJS**
- **axios:** For making HTTP requests.
- **react-router-dom:** For routing and navigation.
- **bootstrap:** For styling and responsive design.
- **fontawesome:** For icons.
- **materialUI:** For UI components.
- **solidIcons:** For additional icons.
- **react-player:** For playing video trailers.

## Contact

For any inquiries or issues, please contact:

- **Name:** Raviraj Khopade
- **Email:** <rmkhopade21@gmail.com>

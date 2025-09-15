# Spring Boot Hello World Backend

A simple Spring Boot demo application that demonstrates REST endpoints similar to Flask routes.

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## How to Run

1. **Using Maven:**
   ```bash
   mvn spring-boot:run
   ```

2. **Using Java directly (after building):**
   ```bash
   mvn clean package
   java -jar target/hello-spring-backend-1.0.0.jar
   ```

## Available Endpoints

The application will start on `http://localhost:8080` and provides the following endpoint:

- **GET** `/` - Returns "Greetings from Spring Boot!"

## Testing the Endpoint

You can test the endpoint using curl:

```bash
# Hello World
curl http://localhost:8080/
```

## Spring Boot vs Flask Comparison

| Flask (Python) | Spring Boot (Java) |
|----------------|-------------------|
| `@app.route('/')` | `@GetMapping("/")` |
| `def index():` | `public String index()` |
| `return "Hello World"` | `return "Greetings from Spring Boot!"` |
| `app.run()` | `SpringApplication.run()` |

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── hello/
│   │               ├── HelloSpringApplication.java  # Main application class
│   │               └── HelloController.java         # REST controller (routes)
│   └── resources/                                  # Configuration (none needed for basic setup)
└── pom.xml                                         # Maven dependencies
```

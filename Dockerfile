# Use a minimal JDK image for running the pre-built JAR
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy only the pre-built JAR from your host
COPY target/hello-spring-backend-1.0.0.jar app.jar

# Expose port your app uses
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
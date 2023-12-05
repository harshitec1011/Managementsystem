# Use the official OpenJDK base image
FROM openjdk:17-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/FMS-SpringBoot-Backend.jar /app/FMS-SpringBoot-Backend.jar

# Expose the port that the application will run on
EXPOSE 8080

# Specify the command to run on container startup
CMD ["java", "-jar", "FMS-SpringBoot-Backend.jar"]

# Use the official OpenJDK 11 image as the base image
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the Gradle build files to the container
COPY build.gradle.kts .
COPY settings.gradle.kts . 
COPY gradlew .
COPY gradle gradle

# Copy the application source code to the container
COPY src src

RUN microdnf install findutils

# Build the application using Gradle
RUN ./gradlew build

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "build/libs/recipebuilder-0.0.1-SNAPSHOT.jar"]
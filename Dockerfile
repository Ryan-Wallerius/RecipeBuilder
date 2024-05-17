# Use the official OpenJDK 11 image as the base image
FROM openjdk:17-jdk as base

# Set the working directory inside the container
WORKDIR /app
EXPOSE 8080

FROM base as build
WORKDIR /src 
COPY . /src

RUN microdnf install findutils

# Build the application using Gradle
RUN /src/gradlew build

FROM base as final 
WORKDIR /app
COPY --from=build /src/build/libs/*.jar /app/build/libs/

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "build/libs/recipebuilder-0.0.1-SNAPSHOT.jar"]
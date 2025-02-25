#FROM openjdk:17
#COPY . /app
#WORKDIR /app
#COPY .mvn .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw package
#CMD ["sh", "-c", "java -jar target/*.jar"]
#
# Use OpenJDK 17 as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy only the necessary files to leverage Docker caching
COPY .mvn .mvn
COPY mvnw pom.xml ./

# Grant execution permission to the Maven wrapper
RUN chmod +x mvnw

# Build the application (only downloads dependencies in the first step)
RUN ./mvnw dependency:go-offline

# Copy the source code and build the application
COPY src src
RUN ./mvnw package -DskipTests

# Expose port 8081
EXPOSE 8081

# Run the application
CMD ["sh", "-c", "java -jar target/*.jar"]


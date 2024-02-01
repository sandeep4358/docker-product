# Use the AdoptOpenJDK 17 JRE image
FROM amazoncorretto:17.0.0-alpine

ADD target/*.jar app.jar

# Command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]

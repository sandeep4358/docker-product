# Use the AdoptOpenJDK 17 JRE image
FROM adoptopenjdk:17-jre-hotspot

ADD target/*.jar app.jar

# Command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]

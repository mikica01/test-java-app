FROM eclipse-temurin:21-jre
WORKDIR /test-app
COPY target/test-app.jar test-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-XX:MaxRAMPercentage=75", "-jar", "test-app.jar"]
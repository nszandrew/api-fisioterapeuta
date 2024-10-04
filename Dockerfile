FROM openjdk:21-jdk-slim
WORKDIR /app
EXPOSE 8080
COPY target/physiotherapist-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

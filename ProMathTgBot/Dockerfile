FROM ubuntu:latest
# FROM amazoncorretto:21-alpine
LABEL authors="ayzek"

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "jar", "app.jar"]
FROM openjdk:8-jdk-alpine

ARG JAR_FILE=*.jar

COPY ${JAR_FILE} startStringBootApp.jar

ENTRYPOINT ["java","-jar","/startStringBootApp.jar"]


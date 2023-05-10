FROM maven:amazoncorretto
#FROM openjdk:11-jdk-slim

WORKDIR /resources

COPY ./pom.xml .
RUN mvn clean compile install package -f pom.xml
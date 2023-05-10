FROM maven:amazoncorretto
#FROM openjdk:11-jdk-slim

WORKDIR /resources

RUN mvn clean compile install package -f pom.xml
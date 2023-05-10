FROM maven:amazoncorretto
#FROM openjdk:11-jdk-slim

WORKDIR /resources

COPY /api/gestsuite-common/pom.xml .
RUN mvn clean compile install package -f pom.xml
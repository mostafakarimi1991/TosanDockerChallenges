FROM maven:3.6.0-jdk-11-slim AS build
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn -f /usr/local/service/pom.xml clean package

FROM openjdk:11 AS jdk
ADD target/TosanDockerChallenges.jar TosanDockerChallenges.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","TosanDockerChallenges.jar","--port=8080"]
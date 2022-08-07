FROM openjdk:11
ADD target/TosanDockerChallenges.jar TosanDockerChallenges.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","TosanDockerChallenges.jar","--port=8080"]
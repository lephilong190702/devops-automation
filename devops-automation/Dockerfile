FROM openjdk:17-jdk-alpine
WORKDIR /devops-automation
EXPOSE 8081
COPY ./target/*.jar devops-automation.jar
ENTRYPOINT ["java", "-jar", "./devops-automation.jar"]
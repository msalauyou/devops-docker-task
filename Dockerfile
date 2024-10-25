FROM openjdk:21-jdk-slim

ENV DEVOPS="user"

COPY target/dockerdemo-0.0.1-SNAPSHOT.jar dockerdemo-0.0.1.jar

ENTRYPOINT ["java","-jar","/dockerdemo-0.0.1.jar"]

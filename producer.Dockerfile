FROM openjdk:17-ea-3-jdk-slim
ARG JARFILE=Producer/build/libs/Producer-0.0.1-SNAPSHOT.jar
COPY $JARFILE restapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "restapp.jar"]
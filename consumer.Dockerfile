FROM openjdk:17-ea-3-jdk-slim
ARG JARFILE=Consumer/build/libs/Consumer-0.0.1-SNAPSHOT.jar
COPY $JARFILE Consumer.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "Consumer.jar"]
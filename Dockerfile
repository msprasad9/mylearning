FROM openjdk:11.0.7
EXPOSE 8084
ARG JAR_FILE=target/mylearning-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} learning.jar
ENTRYPOINT ["java","-Duser.timezone=UTC","-jar","learning.jar"]
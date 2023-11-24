FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/customerdb-0.0.1-SNAPSHOT.jar customerdb-1.0.0.jar
ENTRYPOINT ["java","-jar","/customerdb-1.0.0.jar"]
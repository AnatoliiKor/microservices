FROM openjdk:8-jre-alpine

VOLUME /tmp

LABEL description="Feign-api module"

COPY target/feign-api-0.0.1-SNAPSHOT.jar /feign-api-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/feign-api-0.0.1-SNAPSHOT.jar" ]

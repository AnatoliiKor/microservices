FROM openjdk:8-jre-alpine

VOLUME /tmp

LABEL description="Discovery module 'Eurika-Server'"

COPY target/discovery-0.0.1-SNAPSHOT.jar /discovery-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/discovery-0.0.1-SNAPSHOT.jar" ]

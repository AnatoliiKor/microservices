FROM openjdk:8-jre-alpine

VOLUME /tmp

LABEL description="Common module"

COPY target/common-0.0.1-SNAPSHOT.jar /common-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/common-0.0.1-SNAPSHOT.jar" ]

FROM openjdk:8-jre-alpine

VOLUME /tmp

LABEL description="One module"

COPY target/one-0.0.1-SNAPSHOT.jar /one-0.0.1-SNAPSHOT.jar

EXPOSE 80

ENTRYPOINT [ "java", "-jar", "/one-0.0.1-SNAPSHOT.jar" ]

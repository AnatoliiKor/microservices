FROM openjdk:8-jre-alpine

VOLUME /tmp

LABEL description="Two module"

COPY target/two-0.0.1-SNAPSHOT.jar /two-0.0.1-SNAPSHOT.jar

EXPOSE 80

ENTRYPOINT [ "java", "-jar", "/two-0.0.1-SNAPSHOT.jar" ]

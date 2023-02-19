FROM openjdk:8-jre-alpine

VOLUME /tmp

LABEL description="Spring Cloud Gateway module"

COPY target/spring-gateway-0.0.1-SNAPSHOT.jar /spring-gateway-0.0.1-SNAPSHOT.jar

EXPOSE 8090

ENTRYPOINT [ "java", "-jar", "/spring-gateway-0.0.1-SNAPSHOT.jar" ]

FROM openjdk:8-jre-alpine

VOLUME /tmp

LABEL description="API Gateway Zuul module"

COPY target/apigateway-0.0.1-SNAPSHOT.jar /apigateway-0.0.1-SNAPSHOT.jar

EXPOSE 8062

ENTRYPOINT [ "java", "-jar", "/apigateway-0.0.1-SNAPSHOT.jar" ]

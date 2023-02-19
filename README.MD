
## Work with Dockerfile
```shell script
#docker compose build
docker-compose build
#docker-compose rub
docker-compose up

#checking 
#eureca
http://localhost:8761/
 
#two
http://localhost:8082/two/55
http://localhost:8082

#one
http://localhost:8081/list
http://localhost:8081/greeting

#common
http://localhost:8000/onePort

#feign
http://localhost:9000/get-greeting
http://localhost:9000/get-list

#zuul
#zuul local
http://localhost:8062/two/3
http://localhost:8062/nau/ua/event/

#zuul as container
http://localhost:8062/nau/ua/event/

#spring gateway
#spring gateway local
http://localhost:8090/actuator/gateway/routes/nau
http://localhost:8062/two/3
http://localhost:8090/ua/info/10-prichin-chomu-nau/

#spring gateway as container
http://localhost:8090/actuator/gateway/routes/nau
http://localhost:8090/ua/info/10-prichin-chomu-nau/

# Create an image by Dockerfile from project root directory
docker build -f platform-services\discovery\Dockerfile platform-services\discovery -t discovery
docker build -f platform-services\apigateway\Dockerfile platform-services\apigateway -t zuul
docker build -f business-services\one\Dockerfile business-services\one -t one
docker build -f business-services\two\Dockerfile business-services\two -t two
docker build -f business-services\common\Dockerfile business-services\common -t common
docker build -f business-services\feign-api\Dockerfile business-services\feign-api -t feign

# Run Docker container 
docker run -p 8761:8761 -d discovery
docker run -p 8000:8000 -d common
docker run -p 8081:8081 -d one
docker run -p 8082:8082 -d two

docker run -p 9000:9000 -d feign
docker run -p 8080:8080 -d zuul

# Watch logs
docker logs ec-app

# Inspect a container
docker inspect ec-app

```
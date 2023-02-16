
## Work with Dockerfile
```shell script
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
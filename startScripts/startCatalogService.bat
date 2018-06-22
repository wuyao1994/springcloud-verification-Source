title CatalogService
java -Dserver.port=8003 -Deureka.client.serviceUrl.defaultZone=http://localhost:8000/eureka/ -jar ..\catalog-service\build\libs\app-0.1.jar
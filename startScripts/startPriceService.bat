title PriceService
java -Dserver.port=8001 -Deureka.client.serviceUrl.defaultZone=http://localhost:8000/eureka/ -jar ..\price-service\build\libs\app-0.1.jar
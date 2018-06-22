title InventoryService
java -Dserver.port=8002 -Deureka.client.serviceUrl.defaultZone=http://localhost:8000/eureka/ -jar ..\inventory-service\build\libs\app-0.1.jar
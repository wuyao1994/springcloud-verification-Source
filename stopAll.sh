#!/usr/bin/env bash
set -e
# function definition
removeDockerImage()
{
if $(docker images | grep -q $1)
then
    docker images|grep $1|awk '{print $3 }'| xargs docker rmi
fi
}

# Remove existing containers
docker-compose stop
docker-compose rm -f
sleep 2

# Remove old docker images
removeDockerImage springcloud-verification_discovery-service
removeDockerImage springcloud-verification_catalog-service
removeDockerImage springcloud-verification_inventory-service
removeDockerImage springcloud-verification_price-service
removeDockerImage springcloud-verification_order-service
removeDockerImage springcloud-verification_user-service
sleep 2

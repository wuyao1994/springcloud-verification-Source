# Description
This project is used to verify spring cloud technical stack.
# Quick Start
* Update hosts:
```
<your eureka server ip> eurekapeer1 eurekapeer2
```
* Install [docker-ce](https://www.docker.com/community-edition#/download)
* Install [docker-compose](https://docs.docker.com/compose/install/)
* Change variables in `startDockerCompose.sh`
```
export EUREKA_SERVER_IP=<your eureka server ip>
export EUREKA_SERVER_PORT1=xxxx
export EUREKA_SERVER_PORT2=xxxx
```
* Change ports in `docker-compose.yml`
* Default ports are `8081~8089`
## On Linux
* Open terminal, run scripts
```
sh startDockerCompose.sh
```
## On Windows
* [TODO]
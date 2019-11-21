# Load Balancing Demo Api

This is a simple demonstration of load balancing using a simple REST API built with Clojure, using HAProxy as the load balancer and Docker Swarm as the orchestrator.

## Setup

At first make sure `docker` and `docker-compose` are installed.

Also make sure the `docker swarm` service was initialized. If not, run the following command:
```
docker swarm init
```

Also for testing purposes, make sure `curl`is installed as well.

## How to start

To run the stack, make the `run.sh` script executable running the following command:
```
chmod +x run.sh
```
And to run:
```
./run.sh
```

## How to test

To test the requests to check if everythin is working make the `test.sh` script executable by:
```
chmod +x test.sh
```
And to test:
```
./test.sh
```
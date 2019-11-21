#!/bin/bash

docker-compose up
docker stack deploy --compose-file=docker-compose.yaml prod
#!/bin/bash

docker-compose build
docker stack deploy --compose-file=docker-compose.yaml prod
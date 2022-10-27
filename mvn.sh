#!/bin/bash

echo "***************************"
echo "** Building jar ***********"
echo "***************************"

echo $PWD

docker run --rm  -v  ./java-app:/app -v /root/.m2/:/root/.m2/ -w /app maven:3-alpine "$@"
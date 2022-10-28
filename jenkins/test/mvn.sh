#!/bin/bash

echo "***************************"
echo "** Testing the code ***********"
echo "***************************"

WORKDIR=C:/Users/user/Documents/jenkins/jenkins-data/pipeline/java-app

docker run  --rm  -v  $WORKDIR/:/app -v /root/.m2/:/root/.m2/ -w /app maven:3-alpine "$@"
#!/bin/bash
echo "***************************"
echo "** Pushing Image to dockerhub ***********"
echo "***************************"
IMAGE="docker-jenkins"
PASSWORD= $(sed -n '1p' ./auth.txt)
BUILD_TAG= $(sed -n '2p' ./auth.txt)
echo "Logging in to docker hub"
docker login -u richebony -p $PASSWORD
echo "Tagging image"
docker tag $IMAGE:$BUILD_TAG richebony/$IMAGE:$BUILD_TAG
echo "Pushing image to docker hub"
docker push richebony/$IMAGE:$BUILD_TAG
#!/bin/bash/
echo '*********************************************'
echo '******** Building Jar *********'
echo '*********************************************'

#  docker run --rm  -it -v $PWD/java-app:/app  -v /root/.m2:/root/.m2 -w /app maven:3.8.6-eclipse-temurin-11-alpine mvn -B -DskipTests clean package
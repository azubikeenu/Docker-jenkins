FROM openjdk:11

RUN mkdir /app

COPY target/*.jar /app/myapp.jar

ENTRYPOINT ["java","-jar", "/app/myapp.jar"]

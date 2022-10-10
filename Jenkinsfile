pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh '''
                     ls /var/jenkins_home/workspace/docker-jenkins/java-app/
                     docker run --rm   -v /var/jenkins_home/workspace/docker-jenkins/java-app:/app  -v /root/.m2:/root/.m2 -w /app maven:3.8.6-eclipse-temurin-11-alpine mvn -B -DskipTests clean package
                     ./build.sh
                   '''
            }
        }
        stage('Test') {
            steps {
                sh ''''
                      docker run --rm   -v /var/jenkins_home/workspace/docker-jenkins/java-app:/app  -v /root/.m2:/root/.m2 -w /app maven:3.8.6-eclipse-temurin-11-alpine mvn test
                   '''
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
pipeline {
    agent {
        docker {
            image 'maven:3.8.6-eclipse-temurin-11-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh ' cd java-app && mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'cd java-app && mvn test'
            }
        }

    }
}

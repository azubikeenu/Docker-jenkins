pipeline {
   agent any
    stages {
        stage('Build') {
            steps {
                sh 'docker run --rm  -v  ./java-app:/app -v /root/.m2/:/root/.m2/ -w /app maven:3-alpine mvn -B -DskipTests clean package'
            }
        }
        stage('Check Docker version') {
            steps {
                sh 'docker --info'
            }
        }

    }
}

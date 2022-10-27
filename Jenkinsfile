pipeline {
   agent any
     tools {
        maven 'jenkins-maven'
    }
    stages {
        stage('Build') {
            steps {
                sh 'cd java-app  && mvn -B -DskipTests clean package'
            }
        }
        stage('Check Docker version') {
            steps {
                sh 'docker info'
                sh 'echo $PWD'
            }
        }

    }
}

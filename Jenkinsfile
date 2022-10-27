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
        stage('Build Image') {
            steps {
                sh 'cd java-app && docker build -t jenkins-docker .'
            }
        }

    }
}

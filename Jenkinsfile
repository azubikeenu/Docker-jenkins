pipeline {
   agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Check Docker version') {
            steps {
                sh 'docker --info'
            }
        }

    }
}

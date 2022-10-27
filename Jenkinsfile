pipeline {
   agent any
    stages {
        stage('Build') {
            steps {
                sh './mvn.sh -B -DskipTests clean package'
            }
        }
        stage('Check Docker version') {
            steps {
                echo "My first pipeline"
                sh 'docker --info'
            }
        }

    }
}

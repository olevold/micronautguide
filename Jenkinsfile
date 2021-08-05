pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build'
                sh 'ls -lFa'
                sh 'ls -lFa build'
            }
        }
    }
}
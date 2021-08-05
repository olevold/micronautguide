pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'chmod a+x gradlew'
                sh 'ls -lFa'
                sh 'dos2unix gradlew'
                sh './gradlew clean build'
                sh 'ls -lFa build'
            }
        }
    }
}
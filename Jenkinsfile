pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh '''
                chmod a+x gradlew
                ./gradlew clean dockerbuild
                docker run -d --rm -p 8081:8080 micronautguide:latest
                '''
            }
        }
    }
}
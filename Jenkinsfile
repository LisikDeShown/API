pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvnw --version'
            }
        }
        stage('run tests') {
            steps {
                sh './mvnw test'
            }
        }
    }
}
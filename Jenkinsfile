pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('run tests') {
            steps {
                sh './mvn test'
            }
        }
    }
}
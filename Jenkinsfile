pipeline {
    agent {
        docker {
            label 'docker'
        }
    }
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
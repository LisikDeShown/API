pipeline {
    agent any


    stages {

            stage ('Build') {
                    steps {
                        sh 'mvn --version'
                    }
                    post {
                        success {
                            junit 'target/surefire-reports/**/*.xml'
                        }
                    }
            }

        stage('run tests') {
            steps {
                sh './mvnw test'
            }
        }
    }
}
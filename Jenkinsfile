pipeline {
    agent any


    stages {

            stage ('Build') {
                    steps {
                    export MAVEN_HOME=/opt/maven
                    export PATH=$PATH:$MAVEN_HOME/bin
                    mvn --version
                    mvn clean package
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
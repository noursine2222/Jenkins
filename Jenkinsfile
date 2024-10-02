pipeline {
    agent any

    tools {
        jdk 'JAVA_HOME'
        maven 'M2_HOME'
    }

    stages {
        stage('GIT') {
            steps {
                git branch: 'main', url: 'https://github.com/noursine2222/Jenkins.git'
            }
        }
        
        stage('Compile') {
            steps {
                script {
                    dir('stage_project') {
                        sh 'mvn clean compile'
                    }
                }
            }
        }
    }
}

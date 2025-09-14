pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac *.java'
            }
        }
        stage('Build-1-hello-code') {
            steps {
                sh 'java hello'
            }
        }
        stage('Build-2-summm-code') {
            steps {
                sh 'java summm'
            }
        }
    }
}


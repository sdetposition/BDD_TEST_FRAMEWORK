pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'CheckOut stage from Jenkins file'
                echo 'Get the Code from GitHub repo'
            }
        }

        stage('Build') {
            steps {
               echo 'Build stage from Jenkins file'
               echo 'Build with Maven commands'
            }
        }

        stage('Test') {
            steps {
               echo 'Test stage from Jenkins file'
               echo 'Execution of Test'
            }
        }
    }
}
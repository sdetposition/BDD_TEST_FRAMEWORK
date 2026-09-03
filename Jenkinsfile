pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out automation framework...'

                git branch: 'master',
                    url: 'https://github.com/sdetposition/BDD_TEST_FRAMEWORK.git'
            }
        }

        stage('Clean') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {

        success {
            echo 'Test execution completed successfully.'
        }

        failure {
            echo 'Test execution failed.'
        }

        always {
            echo 'Pipeline execution completed.'
        }
    }
}
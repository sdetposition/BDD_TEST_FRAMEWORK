pipeline {

    agent any

    tools {
        maven 'Maven'
    }

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
                sh 'mvn clean'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
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
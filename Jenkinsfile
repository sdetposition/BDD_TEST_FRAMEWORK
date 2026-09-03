pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
				git branch: 'master',
					url: https://github.com/sdetposition/BDD_TEST_FRAMEWORK.git
                echo 'CheckOut stage from Jenkins file'
                echo 'Get the Code from GitHub repo'
            }
        }

        stage('Clean Repo') {
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
		always {
			 echo 'Execution completed.'
		}
	}
}
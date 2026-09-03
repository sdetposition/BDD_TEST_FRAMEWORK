pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
				git branch: 'master',
					url: 'https://github.com/sdetposition/BDD_TEST_FRAMEWORK.git'
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
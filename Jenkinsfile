pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/SreejaPasula/AdditionRepo.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'javac Addition.java AdditionTest.java'
            }
        }

        stage('Run Program') {
            steps {
                sh 'java Addition'
            }
        }

        stage('Run Tests') {
            steps {
                sh '''
                curl -L -o junit-platform-console-standalone.jar https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.0/junit-platform-console-standalone-1.10.0.jar
                java -jar junit-platform-console-standalone.jar -cp . --scan-classpath
                '''
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished!'
        }
    }
}

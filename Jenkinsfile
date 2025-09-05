pipeline {
    agent any

    tools {
        // Use Java 21 (or your installed JDK version)
        jdk 'Java21'  
    }

    stages {

        stage('Checkout') {
            steps {
                // Pull code from GitHub
                git 'https://github.com/your-username/AdditionRepo.git'
            }
        }

        stage('Compile') {
            steps {
                echo "Compiling Java files..."
                sh 'javac Addition.java AdditionTest.java'
            }
        }

        stage('Run Program') {
            steps {
                echo "Running Addition program..."
                sh 'java Addition'
            }
        }

        stage('Run Tests') {
            steps {
                echo "Running JUnit tests..."
                // Download JUnit standalone jar if not available
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

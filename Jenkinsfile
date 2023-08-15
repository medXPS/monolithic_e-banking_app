properties([pipelineTriggers([githubPush()])])

pipeline {
    agent any
   
    stages {
        stage('Checkout') {
            steps {
                // Check out the code from the repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Run Maven to package the Spring Boot application
                sh 'mvn clean package'
            }
        }
    }

    post {
        success {
            // Archive the built artifact (JAR or WAR) to make it available for download
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
    }
}

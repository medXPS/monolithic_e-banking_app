

node {
    agent any

    stages {
        stage('Checkout') {
         
        git branch: 'main',
            
            url: 'https://github.com/medXPS/Jenkins_test.git'
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
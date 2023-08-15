<<<<<<< HEAD


node {
=======
pipeline {
>>>>>>> a63768e9e0af923a683c3b045e4652673ef75a34
    agent any

    stages {
        stage('Checkout') {
<<<<<<< HEAD
         
        git branch: 'main',
            
            url: 'https://github.com/medXPS/Jenkins_test.git'
=======
            steps {
                checkout scm
            }
>>>>>>> a63768e9e0af923a683c3b045e4652673ef75a34
        }

        stage('Build') {
            steps {
<<<<<<< HEAD
                // Run Maven to package the Spring Boot application
=======
>>>>>>> a63768e9e0af923a683c3b045e4652673ef75a34
                sh 'mvn clean package'
            }
        }
    }

    post {
        success {
<<<<<<< HEAD
            // Archive the built artifact (JAR or WAR) to make it available for download
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
    }
}
=======
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
    }
}
>>>>>>> a63768e9e0af923a683c3b045e4652673ef75a34

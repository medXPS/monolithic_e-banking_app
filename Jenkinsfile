node {
    def repourl = "${REGISTRY_URL}/${PROJECT_ID}/${ARTIFACT_REGISTRY}"
    def mvnHome = tool name: 'maven', type: 'maven'
    def mvnCMD = "${mvnHome}/bin/mvn "

    stage('Checkout github repo'){
        git branch: 'main',
            credentialsId: 'git',
            url: 'https://github.com/medXPS/Jenkins_test.git'
    }

    stage('Build and Push Image to artifact registry'){
        withCredentials([file(credentialsId: 'gcp', variable: 'GC_KEY')]){
            sh("gcloud auth activate-service-account --key-file=${GC_KEY}")
            sh 'gcloud auth configure-docker us-central1-docker.pkg.dev'
            sh "${mvnCMD} clean install jib:build -DREPO_URL=${REGISTRY_URL}/${PROJECT_ID}/${ARTIFACT_REGISTRY}"
        }
    }

    stage('Deploy to GKE Cluster ') {
        sh "sed -i 's|IMAGE_URL|${repourl}|g' deployment.yaml"
        step([$class: 'KubernetesEngineBuilder',
            projectId: env.PROJECT_ID,
            clusterName: env.CLUSTER,
            location: env.REGION,
            manifestPattern: 'deployment.yaml',
            credentialsId:env.PROJECT_ID,

        ])
    }
}
//my  jenkins file
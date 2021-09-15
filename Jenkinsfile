pipeline {
    agent any
    
    tools {
        maven "maven-nodo-principal"
    }
    
    stages {
        stage('Build') {
            steps {
                dir ('mesas') {
                   sh 'mvn -DskipTests clean package'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
    post {
        success {
            dir ('mesas') {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint:true
            }
        }
    }

}
    

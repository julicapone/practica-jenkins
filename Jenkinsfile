pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                dir (‘maven-adderapp’) {
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
    
    tools {
        maven "maven-nodo-principal"
    }
    
    post {
        success {
            dir (‘practicaORM’) {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint:true
            }
        }
    }
}

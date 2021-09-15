pipeline {
    agent any
    
    tools {
        maven "maven-nodo-principal"
    }

    stages {
        stage('Build') {
            steps {
                dir (‘practicaORM’) {
                    sh 'mvn -DskipTests clean package'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing... :S'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying.... :D'
            }
        }
    }
    
    post {
        success {
            dir (‘practicaORM’) {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint:true
            }
        }
    }
}

pipeline {
    agent any
    
    tools {
        maven "maven-nodo-principal"
    }

    stages {
        stage('Build') {
            steps {
                dir (‘practicaJenkins’) {
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
            dir (‘practicaJenkis’) {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint:true
            }
        }
    }
}

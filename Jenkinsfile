pipeline {

    agent any

    tools {

        maven "maven"

    }

    stages {

        stage('Initialization'){

            steps{

                git branch: 'master',url: 'https://github.com/HemantNagarro/dockerAssignment.git'

            }

        }

        stage('Clean'){

            steps{

                bat "mvn clean"

            }

        }

        stage('Build and Test') {

            steps {

                bat "mvn -Dmaven.test.failure.ignore=true package"

            }

            post {

                success {

                    junit '**/target/surefire-reports/TEST-*.xml'

                    archiveArtifacts 'target/*.jar'

                }

            }

        }

        stage('Build Docker Image'){

            steps{

                script{

                    bat "docker build -t libraryapplication -f DockerFile ."

                }

            }

        }

        stage('Run Docker Image'){

            steps{

                script{

                    bat "docker run libraryapplication."

                }

            }

        }

    }

}
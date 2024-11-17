pipeline {
    agent any

    //environment {
        //JAVA_HOME = '/usr/lib/jvm/java-17-openjdk-amd64'  // Ensure JAVA_HOME points to Java 17
    //}
    stages {
        stage('GetProject') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/JamesSheridanCode/Springboot2.git'

            }
        }
        //stage('Clear Maven Cache') {
            //steps {
                //sh 'mvn dependency:purge-local-repository'
            //}
        //}
        stage('Build'){
            steps {
                sh 'java -version'
                sh 'mvn clean compile'
                sh "mvn clean:clean"

                sh "mvn dependency:copy-dependencies"

                sh "mvn compiler:compile"

            }
        }
        stage('Exec') {
            steps {
                sh "mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=9090"
            }
        }    }
}
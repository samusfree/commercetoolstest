// Verify Jenkinsfile for basket

pipeline {
  agent {
    kubernetes {
      yaml """
apiVersion: v1
kind: Pod
metadata:
  labels: 
    jenkins-agent: daemonless
spec:
  containers:
    - name: java
      image: azul/zulu-openjdk-alpine:11.0.10
      command: 
        - cat
      tty: true
"""
    }
  }
  stages {
    stage("Checkout") {
      steps {
        checkout scm
      }
    }

    stage("Build") {
      steps{
        container('java') {
          withCredentials([usernamePassword(credentialsId: "oxy-artifactory", usernameVariable: "ORG_GRADLE_PROJECT_artifactory_username", passwordVariable: "ORG_GRADLE_PROJECT_artifactory_password")]) {
            sh './gradlew build --no-daemon'
          }
        }
      }
    }

    stage("Test") {
      steps{
        container('java') {
          withCredentials([usernamePassword(credentialsId: "oxy-artifactory", usernameVariable: "ORG_GRADLE_PROJECT_artifactory_username", passwordVariable: "ORG_GRADLE_PROJECT_artifactory_password")]) {
            sh './gradlew test --no-daemon'
          }
        }
      }
    }
  }
  post {
    always {
      junit "build/test-results/**/*.xml"
    }

    failure {
      script {
        def emailSubject = "Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}"
        def emailBody = "See: ${env.BUILD_URL}"
        emailext(body: emailBody, subject: emailSubject, to: "kata-dev@e2x.com", replyTo: "infra@e2x.co.uk")
      }
    }

    unstable {
      script {
        def emailSubject = "Build Unstable: ${env.JOB_NAME} #${env.BUILD_NUMBER}"
        def emailBody = "See: ${env.BUILD_URL}"
        emailext(body: emailBody, subject: emailSubject, to: "kata-dev@e2x.com", replyTo: "infra@e2x.co.uk")
      }
    }

    fixed {
      script {
        def emailSubject = "Build Fixed: ${env.JOB_NAME} #${env.BUILD_NUMBER}"
        def emailBody = "See: ${env.BUILD_URL}"
        emailext(body: emailBody, subject: emailSubject, to: "kata-dev@e2x.com", replyTo: "infra@e2x.co.uk")
      }
    }
  }
}

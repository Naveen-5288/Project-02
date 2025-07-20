pipeline {
  agent any
  environment {
    aws-access-key-id     = credentials('aws-access-key-id')
    aws-secret-access-key = credentials('aws-secret-access-key')
  }
  stages {
    stage('Terraform Init') {
      steps {
        bat 'terraform init'
      }
    }
    stage('Terraform Plan') {
      steps {
        bat 'terraform plan'
      }
    }
    stage('Terraform Apply') {
      steps {
        bat 'terraform apply -auto-approve'
      }
    }
  }
}

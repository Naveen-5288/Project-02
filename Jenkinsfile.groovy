pipeline {
  agent any
  environment {
    aws_access_key_id     = credentials('aws-access-key-id')
    aws_secret_access_key = credentials('aws-secret-access-key')
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

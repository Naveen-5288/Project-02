pipeline {
    agent any

    environment {
    aws_access_key_id     = credentials('aws-access-key-id')
    aws_secret_access_key = credentials('aws-secret-access-key')
        AWS_DEFAULT_REGION = 'ap-south-1'
    }

    stages {
        stage('Clone Terraform Code') {
            steps {
                git 'https://github.com/Naveen-5288/Project-02.git'
            }
        }

        stage('Terraform Init') {
            steps {
                sh 'terraform init'
            }
        }

        stage('Terraform Destroy') {
            steps {
                sh 'terraform destroy -auto-approve'
            }
        }
    }
}

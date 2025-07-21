output "jenkins_instance_id" {
  value = aws_instance.jenkins_server.id
}
output "jenkins_key_name" {
  value = aws_instance.jenkins_server.key_name
}

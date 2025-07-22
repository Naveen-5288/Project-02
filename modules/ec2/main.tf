resource "aws_instance" "jenkins_server" {
  ami           = "ami-0c768662cc797cd75" # Ubuntu 22.04 (Mumbai)
  instance_type = var.instance_type
  key_name      = "jenkins03" # optional
  user_data     = file("${path.module}/../../scripts/user_data.sh")

  tags = {
    Name = "Jenkins-EC2"
  }
}

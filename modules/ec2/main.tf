resource "aws_instance" "jenkins_server" {
  ami           = "ami-0f918f7e67a3323f0" # Ubuntu 22.04 (Mumbai)
  instance_type = var.instance_type
  key_name      = var.jenkins_key # optional
  user_data     = file("${path.module}/../../scripts/user_data.sh")

  tags = {
    Name = "Jenkins-EC2"
  }
}

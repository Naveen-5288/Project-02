variable "aws_access_key" {}
variable "aws_secret_key" {}
variable "instance_type" {
  default = "t2.micro"
}
variable "jenkins_key" {
description = "The name of the AWS key pair to use for SSH"
  type        = string
}

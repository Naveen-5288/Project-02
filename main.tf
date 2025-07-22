module "ec2" {
  source        = "./modules/ec2"
  instance_type = var.instance_type
  jenkins_key   = var.jenkins_key
}

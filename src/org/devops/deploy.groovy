package ory.devops

//saltstack
def SaltDeploy(host,hunc) {
  sh "salt \"${hosts}\"  ${func}"
}

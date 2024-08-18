package ory.devops

//saltstack
def SaltDeploy(host,hunc) {
  sh "salt -L \"${hosts}\"  ${func}"  // -L列表
}

package ory.devops

//saltstack
def SaltDeploy(host,hunc) {
  sh "salt -L \"${hosts}\"  ${func}"  // -L列表
}

//ansible
def AnsibleDeploy(hosts,func) {
  sh "ansible ${hosts} ${func}"
}

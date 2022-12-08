def git_clone(){
    git "https://github.com/MajbriOussema/DevOpsProject"
}
def run_unit_tests(){
    sh "mvn clean"
    sh "mvn test"
}
def sonarqube_scan(){
    sh "mvn sonar:sonar 
        -Dsonar.projectKey=devops-project
        -Dsonar.login=admin 
        -Dsonar.password=oussema"
}
def nexus_deploy(){
    sh "mv clean deploy"
}
return this
node {
    //def rootDir = pwd()
    
    checkout scm
    
    def example = load "${workspace}/Jenkinsfile.groovy"
    example.exampleMethod()
    example.otherExmpleMethod()
}

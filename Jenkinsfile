def modules = [:]
pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script{
                    modules.first = load "Jenkinsfile.groovy"
                    modules.second = load "Jenkins-Copy.groovy"
                    modules.second.init(modules.first)
                    modules.first.test1()
                    modules.second.test2()
                }
            }
        }
    }
}
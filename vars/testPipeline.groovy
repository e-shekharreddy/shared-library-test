def call (Map configMap){
    pipeline {
        agent{
            node{
                label 'roboshop'
            }
        }
    }
}
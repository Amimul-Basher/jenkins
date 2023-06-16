pipeline{
  agent any
  environment{
    CREDENTIALS = credentials("practice_credintial_id")
  }
  stages{
    stage("git"){
      steps{
        echo "Checking out............"
      }
    }
    stage("test"){
      when{
        expression{
          BRANCH_NAME == "dev"
        }
      }
      steps{
        bat "mvn test"
      }
    }
    stage("compile"){
      steps{
        bat "mvn clean compile"
      }
    }
    stage("deploy"){
      steps{
        echo "Deployment logics should be added here........."
        bat 'echo "Credential saved in Jenkins ${CREDENTIALS_USR and ${CREDENTIALS_PSW}}"'
      }
    }
  }
}

pipeline{
  agent any
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
      }
    }
  }
}

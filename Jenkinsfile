pipeline{
  agent any
  stages{
    stage("git"){
      steps{
        echo "Checking out from dev branch............"
      }
    }
    stage("test"){
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
        echo "Deployment logics should be added here for dev........."
      }
    }
  }
}

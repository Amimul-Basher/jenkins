pipeline{
  agent any
  environment{
    CREDENTIALS = credentials("practice_credintial_id")
  }
  parameters{
    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
    text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')
    booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')
    choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')
    password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
  }
  stages{
    stage("parameter test"){
      steps{
        echo "hello ${param.PERSON}"
        echo "Biographt ${params.BIOGRAPHY}"
        echo "Toggle ${params.TOGGLE}"
        echo "Choice ${params.CHOICE}"
        echo "Password ${PASSWORD}"
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
        bat 'echo "Credential saved in Jenkins $CREDENTIALS_USR and $CREDENTIALS_PSW"'
      }
    }
  }
}

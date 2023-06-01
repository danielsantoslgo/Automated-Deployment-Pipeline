pipeline {
  agent any
  
  stages {
    stage('Checkout') {
      steps {
        // Step 1: Clone the repository from Git
        git 'https://github.com/your-username/your-repository.git'
      }
    }
    
    stage('Build') {
      steps {
        // Step 2: Compile the code or perform any build tasks
        sh 'mvn clean install'
      }
    }
    
    stage('Test') {
      steps {
        // Step 3: Run unit tests
        sh 'mvn test'
      }
    }
    
    stage('Deploy') {
      steps {
        // Step 4: Deploy the application to a production environment
        sh 'kubectl apply -f deployment.yaml'
      }
    }
  }
}

# 🚀 Automated Deployment Pipeline

This repository contains a script for an automated deployment pipeline using Jenkins, a popular CI/CD tool. The pipeline consists of several stages to streamline the deployment process for your application.

## 📋 Prerequisites

- [Jenkins](https://jenkins.io) installed and configured.
- An agent available to execute the pipeline.
- A Git repository containing your application code.

## 🚀 Usage

1. Clone this repository to your local machine:

```shell
git clone https://github.com/danielsantoslgo/Automated-Deployment-Pipeline
```

2. Set up Jenkins and ensure you have an agent available to execute the pipeline.

3. Create a new Jenkins project and configure it as a "Pipeline" type.

4. In the pipeline configuration, select "Pipeline script from SCM" as the definition.

5. Set the repository URL to the cloned repository and specify the script path as "Jenkinsfile".

6. Save the configuration and run the pipeline.

## 🧪 Pipeline Stages

The pipeline is composed of the following stages:

1. 💻 **Checkout**: Clones the repository from Git.

2. 🏗️ **Build**: Compiles the code and performs any necessary build tasks using Maven.

3. 🧪 **Test**: Runs unit tests for your application.

4. 🚀 **Deploy**: Deploys the application to a production environment using Kubernetes.

Each stage performs a specific set of tasks to ensure a smooth and automated deployment process.

## ⚙️ Configuration

You may need to adjust the pipeline stages and their associated commands to fit your application's requirements. Modify the `Jenkinsfile` script accordingly.

## 🎉 Enjoy Automated Deployments!

With this automated deployment pipeline, you can save time and effort in deploying your applications. Jenkins will handle the necessary steps, from cloning the repository to deploying the application in a production environment.

Feel free to customize the pipeline and incorporate additional stages or steps as needed.

🌟 Happy deploying! 🌟

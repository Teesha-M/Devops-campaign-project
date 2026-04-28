#This is my jenkins file.
node {

    tool name: 'NodeJS', type: 'jenkins.plugins.nodejs.tools.NodeJSInstallation'
    env.PATH = "${tool 'NodeJS'}/bin:${env.PATH}"

    stage('Build') {
        echo 'Building project...'
        sh 'npm install'
        sh 'npm run build'
    }

    stage('Test') {
        echo 'Running tests...'
        sh 'npm test -- --watchAll=false --passWithNoTests'
    }

    echo 'Pipeline executed successfully'
}



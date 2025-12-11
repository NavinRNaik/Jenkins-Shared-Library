def call() {
    echo "Running Maven Build..."
    sh "mvn clean install -DskipTests"
}
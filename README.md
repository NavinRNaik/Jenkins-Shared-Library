<h1>A complete Jenkins Shared Library repository.</h1>

**Step-by-Step Jenkins Setup Guide**  
**This section assumes Ubuntu 22.04 or an EC2 Instance running Ubuntu**

**Step 1: Install Java**

Jenkins requires **Java 17 or higher**.

sudo apt update
sudo apt install fontconfig openjdk-17-jre -y
java -version

**Step 2: Install Jenkins**


curl -fsSL https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo tee \
  /usr/share/keyrings/jenkins-keyring.asc > /dev/null

echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] \
  https://pkg.jenkins.io/debian-stable binary/ | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null

sudo apt update  
sudo apt install jenkins -y  
sudo systemctl enable jenkins  
sudo systemctl start jenkins  


**Get the password:**

sudo cat /var/lib/jenkins/secrets/initialAdminPassword

**Step 3: Install Git**

sudo apt install git -y

**Step 4: Install Maven**

sudo apt install maven -y
mvn -version

**Step 5: Install Docker**

sudo apt install docker.io -y  
sudo systemctl start docker  
sudo systemctl enable docker  
 

**Allow Jenkins to run Docker:**

sudo usermod -aG docker jenkins  
sudo systemctl restart jenkins


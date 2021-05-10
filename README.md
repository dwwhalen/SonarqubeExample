# Some sample commands:

## Get started in 2 minutes with Sonarqube:
https://docs.sonarqube.org/latest/setup/get-started-2-minutes/

## Start Sonarqube in Docker container
docker run -d --name sonarqube -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest


mvn test jacoco:report -Dsonar.host.url=localhost:9000 -Dsonar.login=admin -Dsonar.password=pw

mvn clean install sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=admin -Dsonar.password=pw
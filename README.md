Some sample commands:

mvn test jacoco:report -Dsonar.host.url=localhost:9000 -Dsonar.login=admin -Dsonar.password=pw

mvn clean install sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=admin -Dsonar.password=pw
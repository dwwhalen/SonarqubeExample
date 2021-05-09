mvn clean compile sonar:sonar -Dsonar.login=admin -Dsonar.password=pw

mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=pw

mvn test jacoco:report -Dsonar.login=admin -Dsonar.password=pw
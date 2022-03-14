# zemogaTest
Zemoga test


## prerequisites

have JDK11 installed

have Maven 3.8.4 installed

## steps to run the application

1. open the terminal where the application is located.

2. execute the command "mvn clean install".

3. verify that the maven dependencies are resolved.

4. execute the command "mvn spring-boot:run".

5. open the html page of the project in the browser, example: file:///D:/Work/Zemoga/test/client/index.html

## test part 2

Service to get the information
	
	Get service
	localhost:9191/portfolio/{id} 

	example: localhost:9191/portfolio/8

service to update the information
	
	Put Service
	http://localhost:9191/portfolio
	
	Body
	{
		"id": 8,
		"experience":"Experience in execution of projects from the beginning, meaning, recollection info phase until the implementation and usage of it in production environments Moreover, I've worked in several programming languages such as JAVA 6 years HTML 4 years), JSP 1 year), PHP 3 years), PL/SQL 2 years) With Knowledge in Spring Boot, microservices, REST and SOAP APIs I've also managed databases such as phpMyAdmin, SQL Server and Oracle With experience in agile methodologies ::( as well as classic methodologies based on the PMBOOK with PMI standards",
		"imagePath":"../src/main/resources/image/user.jpg",
		"name":"Pablo Paez",
		"twitterUser":"ppTwitter",
		"email":"fake@zemoga.com",
		"address":"calle false 123",
		"phone":"399887766"
	}
	
## time to complete the test

Six Hours
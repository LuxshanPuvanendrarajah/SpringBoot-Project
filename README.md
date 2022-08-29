#### Coverage: 95.4%
# SpringBoot-Project
## SquadBuilder

A fullstack website designed to allow users to build a squad of their favourite Tottenham hotspur team. Users can add, remove, and update player details as well as creating and editing player profiles.The project utilises HTML,CSS, JavaScript, SpringBootand MySQL.

---
## Getting Started
### Pre-requisites
* MySQL local server
* SpringBoot / Eclipse with Sprint Boot
* Java JDK
* H2 database(for testing)
 
---
## Installing
Download the zipped file from the repo code and unarchive it in your eclipse or springboot workspace.
On the repository, click on the ( <> Code ) tab in the top left

```
<> Code
```

Then click on the ( Code ) buttom next to the green "Use template" button

```
Code
```
Then download this as a zip file to a location of your choosing

```
Download ZIP
```

Extract the .zip file. 

Open the project in SpringBoot and you should see all the packages and test classes, as well as two SQL files (testSchema.sql and testData.sql) and the frontend code. 
Should you wish to make any changes, this can be done directly in SpringBoot or you can use a text editor or another IDE (such as for editing the front end or SQL files).

To use the application prior to packaging, it can be run directly from SpringBoot using "run as SpringBoot application". From there, visit http://localhost:8080 in your browser and you should arrive at the landing page index.html should you wish to make any changes to the product. When testing, instead use "run as JUnit test" or "coverage as JUnit test". Changes to the frontend code, located at
```
src/main/resources/static
```
won't be live; either end the application and refresh it from the package manager after changes, or edit your front end in another IDE such as VSCode (with live server extension) and then move it to the SpringBoot project once you're happy with it.

<img src="https://raw.githubusercontent.com/LuxshanPuvanendrarajah/SpringBoot-Project/main/Documentation/FrontEnd.png">



---
## Running the Tests
To run your own tests, you would need to open the project inside an IDE, such as eclipse, and run the src/test/java package as a JUNIT Test

### Integration Test

The integration test is used to ensure each layer of the application communicates and functions as intended.
e.g Controllers -> Services -> Repos -> Services -> Repos
```
src/test/java/com/qa/main/controllers/SquadControllerIntegrationTest.java
```
<img src="https://github.com/LuxshanPuvanendrarajah/SpringBoot-Project/blob/main/Documentation/testing%20screenshots/example%20of%20integration%20test.png?raw=true">


### Unit Tests

These tests are done to ensure each individual method is acting as intended by mocking the connection to different parts of the API.
e.g in the SquadServiceUnitTest, the connection is mocked using Mockito; when service.create is invoked, a hard-coded entity is returned instead of calling the repo.
```
src/test/java/com/qa/main/services/SquadControllerUnitTest.java
```
<img src="https://github.com/LuxshanPuvanendrarajah/SpringBoot-Project/blob/main/Documentation/testing%20screenshots/example%20of%20unit%20test.png?raw=true">
Final test coverage is 95.4%

Additionally, you should find one with .jar and one with .jar.original - we will be executing the .jar file. You can execute the file by simply using: 
```
SpringBoot-Project/jar file/SquadBuilder-0.0.1-SNAPSHOT.jar
java -jar SquadBuilder-0.0.1-SNAPSHOT.jar
```

## Built with
* [Maven](https://maven.apache.org/) - Dependency management
* [SpringBoot](https://spring.io/projects/spring-boot) - API
* [BootStrap](http://www.getbootstrap.com) - CSS Styling


## Authors
* **Luxshan Puvanendrarajah** - *initial work* - [Luxshan-Puvanendrarajah](https://www.github.come/LuxshanPuvanendrarajah)

## Acknowledgements
Special thanks to my trainers at QA,
Special Mention to Anoush Lowton,
and also fellow team members for help in specific queries.

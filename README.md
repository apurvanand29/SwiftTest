# SwiftTest: Selenium + Cucumber Automation Project
This project is an automated testing solution using Selenium for browser automation and Cucumber for behavior-driven development (BDD). The tests are written in Java, and the framework is designed for automating web applications. It supports both local and Dockerized Selenium Grid execution.

## Prerequisites
Before running the tests, make sure you have the following installed on your machine:

- Java 17 or higher (JDK)
- Maven (for project build and dependencies management)
- Cucumber and Selenium WebDriver dependencies (managed by Maven)
- ChromeDriver (or any other WebDriver for your preferred browser)
- Docker & Docker Compose (for grid-based execution)

## Directory Structure
### Feature Files
Feature files describe the behavior of your application in a human-readable format using Gherkin syntax. You have two feature files:

**Login.feature** : Contains scenarios related to logging into the application.
**Register.feature** : Contains scenarios related to the registration process.

### Pages
_Page Object Model (POM)_ is a design pattern that promotes creating separate classes for different web pages in your application. Each class will contain locators and actions associated with the corresponding page.

**HomePage.java** : This class will contain elements and actions associated with the home page (e.g., logging out, navigating to different parts of the application).

**LandingPage.java** : This class will represent the landing page of the app (e.g., elements that appear when the user lands on the website).

**LoginPage.java** : This class will represent the login page of your application. It contains locators for login fields, buttons, and methods to interact with these elements (e.g., entering login credentials and submitting the form).

**RegistrationPage.java** : This class will contain locators for the registration form and methods to fill out the form (e.g., entering user details like name, email, password, etc.).

**RegistrationSuccessPage.java** : This page will contain elements that confirm the success of the registration, such as a success message or redirection.

### Step Definitions
Step Definitions are Java methods that connect the steps written in Gherkin to the code that performs the actual work.

**HomeDef.java** : Actions on the home page. For example, logging out or navigating to the home page.

**LandingDef.java** : Actions related to the landing page (e.g., navigating to the landing page, verifying elements on the landing page).

**LoginDef.java** : Step definitions related to logging in.

**RegistrationDef.java** : Actions for registering a user.

**RegistrationSuccessDef.java** : Step definitions related to verifying the success of the registration process.

## Test Plan
Find the link to [Test Plan](https://docs.google.com/document/d/15E2O3wQNZdPIkhb0909jZ4Nb5MdjKhhP/edit?usp=sharing&ouid=110988488652453296560&rtpof=true&sd=true) for this automating testing project 

## Test Execution Locally
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
BrowserDriver.driver = new ChromeDriver(options);

Then run with: **mvn clean test**

It is handled in the code, if we pass grid as True it will run in Docker else it will run locally.

## Dockerized Selenium Grid Execution
### 1. Set up the grid
Run tests via Dockerized Selenium Grid using:
**docker compose -f docker-compose.yml up --build**

To stop and clean up:
**docker compose -f docker-compose.yml down**

## Docker Configuration
### docker-compose.yml
Defines a Selenium Grid with two Chrome nodes and a test runner. You may define browser of your choice like firefox or edge.

### Dockerfile
Builds a Maven container and runs tests on the Selenium Grid.

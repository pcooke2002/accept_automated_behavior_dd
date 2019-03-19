
This is a very simple calculator web application designed as a starting point
to teach ATDD and BDD.

* AngularJS - UI framework
* Spring - Dependency injection
* Bootstrap - CSS styling
* Selenium - Control a web browser for UI testing
* Cucumber - Behavior Based Development
* JUnit - Unit testing

There is a single page in the application with one section that has implemented simple integer addition and allows
 teams of developers to learn test driven development collaboration by implementing subtraction, multiplication, and division.
 
 The team will be given a sprint of less than 1 day  (1,2,4,8 hours) or less.  The sprint starts off with sprint planning.  
 The team needs to decide: What is in scope for the duration  of the sprint?  From there the team will negotiate what behaviors, tests, and user acceptance criteria (cucumber scenario) is to be met by the end of the sprint, and what browsers automation testing needs to pass in.  
 
 At the end of the sprint the students will use maven site (spotbugs, and jacoco) to evaluate code quality and completeness of testing
 (Just because you are learning to develop in a team oriented collaborative way does not mean you get to write bad code)

Services are tested with unit tests (that end in Test).  
Controllers are tested with integration tests (that end in IT). 
Cucumber tests (end in .feature) are triggered by RunCucumberIT as an integration tests. It will read and 
execute the .feature files by locating the corresponding steps file (DemoSteps.java) and running the correct code for each step. 

The steps file will interact with a browser using the Page Object pattern.


------------- branching and tagging is important to good development----------

Use ```git clone https://github.com/pcooke2002/atddbdd```` to get the entire repository.  
The master branch latest implements integer addition.  
The rel_0.0.1 branch provides integer subtraction to master. 
The rel_0.0.4 branch provides integer multiplication master.
The rel_0.0.6 branch provides merges master with rel_0.0.2, rel_0.0.4.
The rel_0.0.8 branch provides integer division resulting in whole integer results rel_0.0.6
The rel_0.2.1 branch provides decimal addition to rel_0.0.8. 
The rel_0.2.2 branch provides decimal subtraction to rel_0.2.1. 
The rel_0.2.4 branch provides decimal multiplication to rel_0.2.1. 
The rel_0.2.6 branch merges rel_0.2.1, rel_0.2.2, rel_0.2.4.
The rel_0.2.8 branch provides decimal division resulting in decimal results to rel_0.2.6
the rel_0.3.1 branch provides imaginary number addition to rel_0.2.8. 
The rel_0.3.2 branch provides imaginary number to rel_0.3.1. 
The rel_0.3.4 branch provides imaginary number multiplication to rel_0.3.1. 
The rel_0.3.6 branch merges rel_0.3.1, rel_0.3.2, rel_0.3.4.
The rel_0.3.8 branch provides imaginary number division resulting in decimal results to rel_0.3.6

Division is not provided:  WHY
    Division is a complex business rule.  Complex business rules usually require infrastructure changes that impact previous changes.
    This is true for division.  In a full day class the students would probably write subtraction, then multiplication. Then they would 
    write division and learn the hardway that all the previous work has to be refactored. 
    
    Had they gone from the silver thread of addition to division they could have simply refactored all of the infrastructure plus ONLY the addtion test.  Subtraction and multipliction would not have to be rewritten


------------------------------------------------FYI----------------------------------------------------------
I am using git flow for git branching and tagging strategy. see: https://datasift.github.io/gitflow/IntroducingGitFlow.html and  https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow 

If you are going to use MicroSoft Windows 10.  I have had no success with IExplorer.  Follow the directions at
https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/ 
Download the driver for your release of windows to the src/test/resources/bin

In Linux I have not been able to Selenium to work with Selenium installed Firefox  I had to download Firefox for linux from Mozilla
and place that Firefox in the search path before /snap/bin/firefox
---------------------------------------------------------------------------------------------------------------


Some basics for getting the demo app up and running:
OPTIONS maven command
```-Dbrowser.name=XXXX```  choice currently only chrome, firefox are tested on linux
```-Dheadless=true|false``` only for chrome and firefox

On Linux firefox (FF) - there is a problem with FF installed with snap.  I had to download firefox from mozilla and override the search PATH variable with the path to FF

Run all the unit tests:
```mvn test```

Start the web app, run the tests and then shut it back down:
```mvn verify```

Start the web app using Maven on http://localhost:8080: 
```mvn spring-boot:run```

compile and test:
```mvn clean install````

run site
``` mvn site:run```

run spotbugs gui
```mvn spotbugs:gui```


Start the web app from inside an IDE:
Run the main method in DemoApplication.java

* * *

The main branch uses Angular 1.x. This is generally the simplest way to get 
started if you just want to see how BDD works and aren't interested in Angular.
There is an Angular 5 branch as well.

The UI tests will use Chrome, but you can switch to a different driver in 
TestConfig.java if you'd like to use something different like FireFox.

The port the web app runs on can be set in application.properties

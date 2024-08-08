package myRunner;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features/login.feature", //the path of the feature files
		glue={"stepDefination"}, //the path of the step definition files
		plugin= {"pretty","html:target/htmlreport.html", "json:target/cucumber.json"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		 //it will check if any step is not defined in step definition file
		dryRun = false, //to check the mapping is proper between feature file and step def file
		tags = "@Regression"
		)

public class TestRunner {

	
}

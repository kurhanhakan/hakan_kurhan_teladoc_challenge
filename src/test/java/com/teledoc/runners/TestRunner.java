package com.teledoc.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		// we can specify which feature/features to run
		features = "src/test/resources/features/Teledocproject.feature",

		// we can specify where the code for the above feature files is located
		glue = "com.teledoc.steps",

		// if true, it does not run the java classes. Only checks the feature files
		// if they are glued to some java code
		dryRun = false,

		
		monochrome = true, 

		plugin = {
				
				// prints the gherkin steps in pretty way :)
				"pretty",
				
				
				// This will create a basic html report in the target folder
				"html:target/cucumber-default-report.html",
				
				//This will create and share report in json format inside target folder
				"json:target/cucumber.json"
				
			

			}
		
		)

public class TestRunner {
	

}

package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Here  I have to implement for run the feature file from here in this class how to do this 
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resourceses/appFeatures"}, // this is for  where is my all feature files are available in this project
		glue= {"com/stepDefinition"}, // this is for where is my stepDefinition java file is available 
		//tags= "smoke" // by using this which tags will be associated with the scenarios that scenarios are to be executed 
	plugin= {"pretty"}// this is for generate good color formant in output console 
		
		)


// this class is use for running the above specific feature file only
public class UberTest { // this is TestRunner class for executing the feature file By the above specifies
//Presently I don't need to implement this class 
	// May be I will add some more functionalities later on 
	// I will update this class as per the requirement 
}

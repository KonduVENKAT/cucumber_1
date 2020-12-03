package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features= {"src/test/resourceses/appFeatures/Amezon.feature"}, // this is for  where is my all feature files are available in this project
		//glue= {"com/stepDefinition"} // this is for where is my stepDefinition java file is available 
		
		features= {"src/test/resourceses/appFeatures/Amezon.feature"},
		glue= {"com/stepDefinition"},
		plugin= {"pretty"}
		
		)

public class AmezonTest {
	

	

}

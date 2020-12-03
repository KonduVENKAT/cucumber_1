package com.runners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resourceses/appFeatures/AmezonSearch.feature"}, // this will execute only particular feature file only 
		glue= {"com/stepDefinition"}, // this will for where is my respective glue code java file location I have to specify
		tags= "@Sanity or @All or @Regression",
		plugin= {"pretty"} // this is for generating good output results 
		
		)

public class AmezonSearchTest {

}

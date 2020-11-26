package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/java/com/appFeatures"},// here we have to declare only package name inside number of feature file available 
		glue= {"com/stepDefinition"}, // this is for where exactly step definition are available 
		plugin= {"pretty"}	// for generate good colorful report.	
		
		)
public class GoogleTest {

}

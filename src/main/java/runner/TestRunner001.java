package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucuumberOptions;
import cucumber.apt.junit.cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( // in this where exactly my feature file and step definition file are available
		
		  // where exactly my feature file are  available and with folder name in this project
		feature="/home/venkat/eclipse-workspace/BDD_1/src/main/java/appFeatures"
		.glue= {"stepDefinition"} // glue mens where are my stepDefinition files are available 
		//format= {"pretty",html:test-output }
		
		)

public class TestRunner001 {

}

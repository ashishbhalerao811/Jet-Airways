package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import testBase.TestBase;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Ashish\\git\\Jet-Airways\\jetAirways\\src\\main\\java\\features\\jetAirwaysFile.feature",
				 glue="C:\\Users\\Ashish\\git\\Jet-Airways\\jetAirways\\src\\main\\java\\stepDefinition\\HomePageStepDefinition.java",
//				 format= {"pretty", "html:test-output"},
				 monochrome=true
//				 dryRun=false

		)
public class TestRunner extends TestBase{
	

}

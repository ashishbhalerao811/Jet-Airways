package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import testBase.TestBase;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Ashish\\eclipse-workspace\\jetAirways\\src\\main\\java\\features",
				 glue="C:\\Users\\Ashish\\eclipse-workspace\\jetAirways\\src\\main\\java\\stepDefinition",
				 format= {"pretty", "html:test-output"},
				 monochrome=true,
				 dryRun=false

		)
public class TestRunner extends TestBase{
	

}

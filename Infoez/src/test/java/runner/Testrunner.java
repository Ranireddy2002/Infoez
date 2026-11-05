package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/Features/Customer.feature",
		glue ={"step"},
		tags ="@Customerpanel",
				plugin = {
		                "pretty",
		                "html:target/cucumber-report.html",
		         
		                "json:target/cucumber.json" },
		        
		monochrome = true,
		        publish = true
		)


public class Testrunner {
	

}

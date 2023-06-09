package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = { ".//Features//LoginDDT.feature" }, 
		glue = "StepDefinition", 
		plugin = {
				"pretty", "html:reports/myreport.html",
				"json:reports/myreport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

		}

// , tags = ("@smoke or @regression")

)

public class TestRunner {

}

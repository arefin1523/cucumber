package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
//@CucumberOptions(features = "C:/Users/sumon/eclipse-workspace/CucumberSelenium/src/test/resources/Feature/GoogleSerch.feature",glue={"StepDefinitions"},
@CucumberOptions(features = "C:\\Users\\sumon\\eclipse-workspace\\CucumberSelenium\\src\\test\\resources\\Feature\\Login.feature",glue={"StepDefinitions"},

monochrome=true,

plugin = {"json:target/cucumber.json"}

//plugin = { "pretty", "html:target/htmlreports"}
//plugin = { "pretty", "json:target/reports/cucumber.json"},
//plugin = { "pretty",  "junit:target/reports/cucumber.xml"}

)
public class TestRunner {
	
	}

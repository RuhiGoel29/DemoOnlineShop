package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/bddReports/report.html",
				"html:target/cucumber-reports",
				"json:target/cucumber.json",
		},
		features = {"src/test/resources/features"},
		glue = {"stepDefinations"},
		tags = {"@TC_01"})

public class TestRunner {

}

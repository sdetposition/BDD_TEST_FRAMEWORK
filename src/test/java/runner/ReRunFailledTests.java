package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/failed_scenarios.txt",
	    glue = {"stepDefinations"},
	    plugin = {"pretty",
	    		"html:target/cucumber-rerun-report.html"},
	    monochrome = false
		)
public class ReRunFailledTests {

}

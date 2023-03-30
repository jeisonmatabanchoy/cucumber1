package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="stepsdefinitions",
		plugin= {
				"pretty",
				"json:target/CucumberReports/CucumberReport.json"
			}
		)
public class RunCucumberTest {

}

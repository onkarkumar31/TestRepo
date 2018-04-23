package mRunners;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
//import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefs"},
        tags = {"~@Ignore"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },
        dryRun=true,
        monochrome =true
        )

public class TestRunnerTC01 {
	
	public void f(){}

}
package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/main/java/features", glue = {"util","steps","pages"}, plugin = "json:target/cucumber-report.json")
public class testRunner extends AbstractTestNGCucumberTests{

 	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	
}

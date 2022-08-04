package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "Feature/Login.feature" }, 
        glue = { "StepDefination" },
        monochrome= true,
        dryRun= false
        )
public class TestRunner {

}

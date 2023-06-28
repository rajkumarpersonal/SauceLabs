package stepDefinition;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber-report/cucumber.html", "json:target/cucumber-report/cucumber.html"},
        features = "/src/main/resources/features",
        glue = "stepDefinition",
        dryRun = false,
        monochrome = true



)

public class RunnerClass {
}

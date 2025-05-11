package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/"},
glue = {"utility", "StepDefinition"},
plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"},
tags = "@login or @register",
monochrome = true)

public class TestRunner {
    static {
        System.out.println(">>> TestRunner loaded");
    }

}

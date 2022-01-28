package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Featuresfiles",
glue= {"Stepdefinations"},stepNotifications=true,monochrome=true,tags="@karts",plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cuko.xml"})

public class TestRunner {

}

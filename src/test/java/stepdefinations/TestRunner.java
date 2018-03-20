package stepdefinations;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


//In Edit configuration on top left second TestRunner Junit option then it will Run
@RunWith(Cucumber.class)
@CucumberOptions(strict = false, dryRun = false, features = "classpath:Features", glue = "classpath:stepdefinations", monochrome = true, format = { "pretty",
        "html:target/site/cucumber-pretty",
        "json:target/site/cucumber.json",

        "rerun:target/rerun.txt" }, tags = {"@navlogin"} )
public class TestRunner{


}

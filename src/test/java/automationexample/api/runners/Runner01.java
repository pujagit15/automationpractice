package automationexample.api.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},tags = {"@tc01"},
    glue = "automationexample.api.stepLib", features = "src/test/resources/features/api")
public class Runner01 extends AbstractTestNGCucumberTests {
}

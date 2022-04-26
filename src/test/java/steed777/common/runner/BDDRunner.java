package steed777.common.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {
                "pretty",

        },
        features = "src/test/resources/features/",
        // allure-results = "target",
        glue = "steed777.steps",
        publish = true)
public class BDDRunner extends AbstractTestNGCucumberTests {


    /*@AfterClass
    public void browserClose() {

        try {
            Thread.sleep(3000);
            Browser.getDriver().quit();
        } catch (Exception ex) {
            Application.error("Что то пошло не так", ex);
        }
    }*/
}

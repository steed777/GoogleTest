package com.github.steed777.common.runner;


import com.github.steed777.common.Application;
import com.github.steed777.common.Browser;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;


@CucumberOptions(
        plugin = {
                "pretty"

        },
        features = "src/test/resources/features/",
        // allure-results = "target",
        glue = "com.github.steed777.steps")
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

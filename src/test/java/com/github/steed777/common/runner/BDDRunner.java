package com.github.steed777.common.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


//@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty"
        },
        //     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        //monochrome = true,
        features = "src/test/resources/features/",
        glue = "com.github.steed777.steps")
public class BDDRunner extends AbstractTestNGCucumberTests {

    /*@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }*/

}

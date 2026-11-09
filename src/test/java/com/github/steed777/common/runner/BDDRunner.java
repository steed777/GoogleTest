package com.github.steed777.common.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


//@RunWith(Cucumber.class)
@CucumberOptions(
        /*plugin = {
        "ru.testit.listener.BaseCucumber5Listener"
},*/features = "src/test/resources/features/",
        plugin = "pretty",
        glue = "com.github.steed777.steps")
public class BDDRunner extends AbstractTestNGCucumberTests{

    /*@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }*/

}

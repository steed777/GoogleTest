package com.github.steed777.common.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin = "pretty",
        features = "src/test/resources/features/",
        glue = "com.github.steed777.steps")
public class BDDRunner extends AbstractTestNGCucumberTests {


}

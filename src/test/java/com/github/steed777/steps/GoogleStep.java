package com.github.steed777.steps;



import io.cucumber.java.en.When;
import com.github.steed777.flow.GoogleFlow;


public class GoogleStep {


    @When("Go to the testing page")
    public void pageAuthorization() {
        GoogleFlow.goGooglePage();

    }

    @When("Entering in the search field 'buy a bork c804 coffee machine' click find")
    public void authorizationUser() {
        GoogleFlow.enterNameMachine();
    }
}

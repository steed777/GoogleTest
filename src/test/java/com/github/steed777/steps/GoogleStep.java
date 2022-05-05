package com.github.steed777.steps;



import io.cucumber.java.en.When;
import com.github.steed777.flow.GoogleFlow;
import io.qameta.allure.Step;


public class GoogleStep {

    @Step("Go to the testing page")
    @When("Go to the testing page")

    public void pageAuthorization() {
        GoogleFlow.goGooglePage();

    }
    @Step("Entering in the search field 'buy a bork c804 coffee machine' click find")
    @When("Entering in the search field 'buy a bork c804 coffee machine' click find")
    public void authorizationUser() {
        GoogleFlow.enterNameMachine();
    }
}

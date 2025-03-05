package com.github.steed777.steps;



import io.cucumber.java.en.When;
import com.github.steed777.flow.GoogleFlow;
//import ru.testit.annotations.Step;


public class GoogleStep {


    // @Step("Go to the testing page")
  ///  @Step
    @When("Go to the testing page")
    public void pageAuthorization() {
        GoogleFlow.goGooglePage();

    }


    // @Step("Entering in the search field 'buy a bork c804 coffee machine' click find")
    // @Step("Entering in the search field 'buy a bork c804 coffee machine' click find")
   // @Step
    @When("Entering in the search field 'buy a bork c804 coffee machine' click find")
    public void authorizationUser() {
        GoogleFlow.enterNameMachine();
    }
}

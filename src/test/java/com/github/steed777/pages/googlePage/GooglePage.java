package com.github.steed777.pages.googlePage;



import com.github.steed777.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.github.steed777.common.Browser;


public class GooglePage extends MainPage {


    @FindBy(xpath = "//input[contains(@placeholder, 'Логин')]")
    private WebElement loginField;

    @FindBy(xpath = "//h3[contains(text(), 'BORK C804')]")
    private WebElement getEnsurePageLoadedElement;

    @FindBy(xpath = "//img[@alt = 'Google']")
    private WebElement ensurePageLoadedElement;

    @FindBy(xpath = "//textarea[@title = 'Поиск']")
    private WebElement submitButton;

    public void ensurePageLoaded() {
        waitWhileElemIsVisible(ensurePageLoadedElement);
    }

    //static WebDriver driver;

    public void openLoginPage() {
        Browser.getDriver().navigate().to(baseUrl());
        waitForLoad();
    }

//    public void sendKeysFieldClick() {
//        sendKeys(submitButton);
//        waitWhileElemIsVisible(getEnsurePageLoadedElement);
//    }

    public void setSourceField() {
        waitSeconds(1);
        waitWhileElemIsVisible(submitButton);
        typeSubmit(submitButton, "купить кофемашину bork c804");
        waitSeconds(1);
    }
}

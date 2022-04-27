package com.github.steed777.pages.navigationPages;


import com.github.steed777.pages.MainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainNavigationPage extends MainPage {

    @FindBy(xpath = "//div[text() = 'ИР Защищенное Хранилище Данных']")
    private WebElement ensurePageLoadedElement;

    @FindBy(xpath = "//a[@href = '/ui/cm_panel']")
    private WebElement chiefMetrologPanel;

    @FindBy(xpath = "//*[@id='add151dd6ad5621abbb824be0d9202f3']")
    private WebElement unity;

    @FindBy(xpath = "//a[@href = '/ui/event_log']")
    private WebElement journalEvens;


    public void ensurePageLoaded() {
        waitWhileElemIsVisible(ensurePageLoadedElement);
    }



    }





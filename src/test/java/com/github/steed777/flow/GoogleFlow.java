package com.github.steed777.flow;


import com.github.steed777.pages.googlePage.GooglePage;
import org.openqa.selenium.support.PageFactory;
import com.github.steed777.common.Browser;

public class GoogleFlow {

    private static GooglePage googlePage = PageFactory.initElements(
            Browser.getDriver(), GooglePage.class
    );

    //Переход на страницу Google
    public static void goGooglePage() {
        googlePage.openLoginPage();
        googlePage.ensurePageLoaded();
    }

    //Ввод В поле ввода название машинки
    public static void enterNameMachine() {
        //googlePage.sendKeysFild();
        googlePage.setSourceField();
        googlePage.sendKeysFieldClick();
    }

}

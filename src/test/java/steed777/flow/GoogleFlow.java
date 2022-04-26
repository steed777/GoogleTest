package steed777.flow;


import org.openqa.selenium.support.PageFactory;
import steed777.common.Browser;
import steed777.pages.googlePage.GooglePage;

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

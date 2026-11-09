package com.github.steed777.pages;


import com.github.steed777.common.ScreenShot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.steed777.common.Application;
import com.github.steed777.common.Browser;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class MainPage {

    private static final int periodLoadWait = Integer.parseInt(Application.getProperty("periodElementWait"));
    private static final int periodElementWait = Integer.parseInt(Application.getProperty("periodElementWait"));
    private static final int periodInvisibleWait = Integer.parseInt(Application.getProperty("periodElementWait"));


    public static void waitForLoad() {
        new WebDriverWait(Browser.getDriver(), Duration.ofSeconds(periodLoadWait)).until(wd ->
                ((JavascriptExecutor) Browser.getDriver()).executeScript("return document.readyState").equals("complete"));
    }


    public static void waitWhileElemIsVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Browser.getDriver(), Duration.ofSeconds(periodElementWait));
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        }catch (Exception e){
            wait.until(ExpectedConditions.visibilityOf(element));
        }
    }

    public static void waitSeconds(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            Application.error("Что то пошло не так", e);
        }
    }

    public static String baseUrl() {
        String baseUrl = System.getenv("bitBucket_BASE_URL");
        if (baseUrl == null) {
            baseUrl = Application.getProperty("GooglePage");
        }
        return baseUrl;
    }

    public static void clickAndMakeScreenshot(WebElement element, String message) {
        // waitWhileElemIsNotPresent(loaderElements);
        ScreenShot.makeScreenShot("До нажатия на элемент: " + message);
        Application.log(String.format("Кликаю на '%s'", message));
        element.click();
        //    waitWhileElemIsNotPresent(loaderElements);
    }

    public static void checkingVisibleDataDisplay(String message, WebElement element) {

        waitWhileElemIsVisible(element);
        Application.log(String.format("Элемент '%s'", message + "найден"));

    }

    public static void waitWhileElemIsNotPresent(List<WebElement> webElements) {
        int counter = 0, second = 1; // интервал проверки
        Browser.getDriver().manage().timeouts().implicitlyWait(periodInvisibleWait, TimeUnit.SECONDS);

        while (webElements.size() != 0) {
            waitSeconds(second);
            counter += second;
            System.out.println(counter);

            if (counter > periodElementWait)
                throw new RuntimeException("Элемент не исчез спустя (sec): " + periodElementWait);
        }

    }
    public static void sendKeys(WebElement webElement){
        webElement.sendKeys(Keys.ENTER);
    }

    public static void typeSubmit(WebElement element, String value) {
        element.sendKeys(value + Keys.ENTER);
       // waitWhileElemIsNotPresent(loaderElements);
    }

    public static void findBy(WebElement webElement){

    }
}

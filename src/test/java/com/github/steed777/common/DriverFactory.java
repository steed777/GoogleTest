package com.github.steed777.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
    public static WebDriver getWebDriver(){
    WebDriver webDriver = null;
    FirefoxOptions options = new FirefoxOptions();
    WebDriverManager.firefoxdriver().setup();
    webDriver = new FirefoxDriver(options);
    return webDriver;

}
}

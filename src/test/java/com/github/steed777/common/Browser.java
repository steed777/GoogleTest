package com.github.steed777.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public enum Browser {
    INSTANCE;
    private WebDriver driver;
    public final static int DEFAULT_TIMEOUT = 30;

    Browser() {
        try {
          //  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(options);
          //  driver = new FirefoxDriver();
            /*System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            FirefoxBinary firefoxBinary = new FirefoxBinary();
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary(firefoxBinary);*/
          //  options.setHeadless(true);  // <-- headless set here
         //   driver = new FirefoxDriver(options);

        } catch (Exception e) {
            Application.error("Дравер не найден", e);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }

    public static WebDriver getDriver() {
        return INSTANCE.driver;
    }
}

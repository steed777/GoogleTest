package com.github.steed777.common;

import io.qameta.allure.Allure;
import org.apache.log4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Application {

    public final static Logger logger = Logger.getLogger(Application.class);


    public static String getProperty(String key) {
        FileInputStream propFile =
                null;
        try {
            propFile = new FileInputStream("src/test/resources/" + "test" + ".properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties p =
                new Properties(System.getProperties());
        try {
            p.load(propFile);
        } catch (IOException e) {
            logger.error("Возозникает исключение", e);
        }

        System.setProperties(p);

        return System.getProperty(key);
    }

    public static void log(String message) {
        Allure.addAttachment(message, new ByteArrayInputStream(message.getBytes()));
        logger.info(message);
    }

    public static void error(String message, Exception e) {
        Allure.addAttachment(message, new ByteArrayInputStream(message.getBytes()));
        logger.error(message, e);
    }
}

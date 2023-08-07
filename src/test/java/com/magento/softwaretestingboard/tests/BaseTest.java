package com.youtube.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

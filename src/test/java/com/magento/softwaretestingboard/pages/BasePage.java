package com.youtube.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    public static String BASE_URL = "https://magento.softwaretestingboard.com/ ";

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

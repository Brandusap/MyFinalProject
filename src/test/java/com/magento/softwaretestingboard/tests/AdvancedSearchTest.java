package com.magento.softwaretestingboard.tests;

import com.magento.softwaretestingboard.pages.AdvancedSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.magento.softwaretestingboard.pages.AdvancedSearchPage.ADVSEARCH_URL;

public class AdvancedSearchTest extends BaseTest{

    @Test
    public void SearchByProductNameTest(){
        driver.get(ADVSEARCH_URL);
        driver.manage().window().maximize();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.enterProductName("Breathe-Easy Tank");
        advancedSearchPage.clickSearchButton();
        waitForNumberOfSeconds(3);
        Assert.assertTrue(advancedSearchPage.getAlertText().contains("1 item"));
        Assert.assertTrue(advancedSearchPage.isTheSameItemName());
    }

    @Test
    public void SearchBySKUTest(){
        driver.get(ADVSEARCH_URL);
        driver.manage().window().maximize();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.enterSKU("WT08");
        advancedSearchPage.clickSearchButton();
        waitForNumberOfSeconds(3);
        Assert.assertTrue(advancedSearchPage.getAlertText().contains("1 item"));
        Assert.assertTrue(advancedSearchPage.getText().contains("Antonia Racer Tank"));
    }

    @Test
    public void SearchByDescriptionTest(){
        driver.get(ADVSEARCH_URL);
        driver.manage().window().maximize();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.enterDescription("Natural Cocona® technology");
        advancedSearchPage.clickSearchButton();
        waitForNumberOfSeconds(3);
        Assert.assertTrue(advancedSearchPage.getAlertText().contains("1 item"));
        advancedSearchPage.clickProductButton();
        Assert.assertTrue(advancedSearchPage.getDescriptionText().contains("Natural Cocona® technology"));
    }

    @Test
    public void SearchByShortDescriptionNegativeTest(){
        driver.get(ADVSEARCH_URL);
        driver.manage().window().maximize();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.enterShortDescription("gg");
        advancedSearchPage.clickSearchButton();
        waitForNumberOfSeconds(3);
        Assert.assertTrue(advancedSearchPage.getErrorAlertText().contains("We can't find any items matching these search criteria. Modify your search."));
    }

    @Test
    public void SearchByPriceTest(){
        driver.get(ADVSEARCH_URL);
        driver.manage().window().maximize();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        advancedSearchPage.enterFromPrice("34");
        advancedSearchPage.enterToPrice("34");
        advancedSearchPage.clickSearchButton();
        waitForNumberOfSeconds(3);
        advancedSearchPage.sortByOption("price");
        Assert.assertTrue(advancedSearchPage.checkIfItIsSelectedPrice());
        Assert.assertTrue(advancedSearchPage.getText2().contains("34"));
    }



}

package com.magento.softwaretestingboard.tests;

import com.magento.softwaretestingboard.pages.CreateAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.magento.softwaretestingboard.pages.CreateAccountPage.CREATEACCOUNT_URL;

public class CreateAccountTest extends BaseTest{
    @Test
    public void createAccountTest(){
        driver.get(CREATEACCOUNT_URL);
        driver.manage().window().maximize();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.enterFirstName("Brandusa");
        createAccountPage.enterLastName("Postolache");
        createAccountPage.enterEmail("postolache13@gmail.com");
        createAccountPage.enterPassword("Br.p131313");
        createAccountPage.enterConfirmPassword("Br.p131313");
        createAccountPage.clickCreateButton();
        waitForNumberOfSeconds(3);
        Assert.assertTrue(createAccountPage.getAlertText().contains("Thank you for registering with Main Website Store."));
    }
}

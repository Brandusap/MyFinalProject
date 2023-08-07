package com.magento.softwaretestingboard.tests;

import com.magento.softwaretestingboard.pages.CreateAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.magento.softwaretestingboard.pages.CreateAccountPage.CREATEACCOUNT_URL;

public class CreateAccountNegativeTest extends BaseTest{
    @Test
    public void createSameAccountTest(){
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
        Assert.assertTrue(createAccountPage.getAlertText2().contains("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account."));
    }

    @Test
    public void PasswordsTest(){
        driver.get(CREATEACCOUNT_URL);
        driver.manage().window().maximize();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.enterFirstName("Brandusa");
        createAccountPage.enterLastName("Postolache");
        createAccountPage.enterEmail("postolache13@gmail.com");
        createAccountPage.enterPassword("Br.p131313");
        createAccountPage.enterConfirmPassword("Br.p131317");
        if (createAccountPage.checkPasswords()) {
            createAccountPage.clickCreateButton();
            waitForNumberOfSeconds(3);
            Assert.assertTrue(createAccountPage.getAlertText().contains("Thank you for registering with Main Website Store."));
        }
        else {
            createAccountPage.clickCreateButton();
            Assert.assertTrue(createAccountPage.getAlertText3().contains("Please enter the same value again."));
        }

    }
}

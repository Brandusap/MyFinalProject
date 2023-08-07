package com.magento.softwaretestingboard.tests;

import com.magento.softwaretestingboard.pages.CustomerReviewsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.magento.softwaretestingboard.pages.CustomerReviewsPage.PRODUCT_URL;

public class CustomerReviewsTest extends BaseTest{
    @Test
    public void CustomerReviewsTest(){
        driver.get(PRODUCT_URL);
        driver.manage().window().maximize();
        CustomerReviewsPage customerReviewsPage = new CustomerReviewsPage(driver);
        customerReviewsPage.clickStar1();
        waitForNumberOfSeconds(2);
        customerReviewsPage.enterNickname("Emm");
        customerReviewsPage.enterSummary("Perfect!");
        customerReviewsPage.enterReview("It is perfect for a day at the gym doing cardio. After the session, it keeps me dry!");
        customerReviewsPage.clickSubmitButton();
        waitForNumberOfSeconds(3);
        Assert.assertTrue(customerReviewsPage.getAlertText().contains("You submitted your review for moderation."));
    }

    @Test
    public void CustomerReviewsNegativeTest(){
        driver.get(PRODUCT_URL);
        driver.manage().window().maximize();
        CustomerReviewsPage customerReviewsPage = new CustomerReviewsPage(driver);
        waitForNumberOfSeconds(2);
        customerReviewsPage.enterNickname("Emm");
        customerReviewsPage.enterSummary("Perfect!");
        customerReviewsPage.enterReview("It is perfect for a day at the gym doing cardio. After the session, it keeps me dry!");
        customerReviewsPage.clickSubmitButton();
        waitForNumberOfSeconds(3);
        Assert.assertTrue(customerReviewsPage.getErrorText().contains("Please select one of each of the ratings above."));
    }
}

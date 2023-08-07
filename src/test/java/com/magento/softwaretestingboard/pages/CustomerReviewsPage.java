package com.magento.softwaretestingboard.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class CustomerReviewsPage extends BasePage{
    public static String PRODUCT_URL = BASE_URL +"radiant-tee.html#reviews";
    public CustomerReviewsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"Rating_1_label\"]") private WebElement Star1;
    @FindBy(xpath = "//*[@id=\"Rating_2_label\"]") private WebElement Star2;
    @FindBy(xpath = "//*[@id=\"Rating_3_label\"]") private WebElement Star3;
    @FindBy(xpath = "//*[@id=\"Rating_4_label\"]") private WebElement Star4;
    @FindBy(xpath = "//*[@id=\"Rating_5_label\"]") private WebElement Star5;
    @FindBy(xpath = "//*[@id=\"Rating_3\"]") private WebElement allStars;
    @FindBy(id = "nickname_field") private WebElement nicknameInput;
    @FindBy(id = "summary_field") private WebElement summaryInput;
    @FindBy(id = "review_field") private WebElement reviewInput;
    @FindBy(xpath = "//*[@id=\"ratings[4]-error\"]") private WebElement errorRating;
    @FindBy(xpath = "//*[@id=\"review-form\"]/div/div/button") private WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div") private WebElement successAlert;

    public void clickStar1(){
        Star1.click();
    }
    public void enterNickname(String nickname){
        nicknameInput.sendKeys(nickname);
    }
    public void enterSummary(String summary){
        summaryInput.sendKeys(summary);
    }
    public void enterReview(String review){
        reviewInput.sendKeys(review);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
    public String getAlertText(){
        return successAlert.getText();
    }

    public String getErrorText(){
        return errorRating.getText();
    }




}

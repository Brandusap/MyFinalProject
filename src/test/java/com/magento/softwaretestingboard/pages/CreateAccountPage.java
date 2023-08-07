package com.magento.softwaretestingboard.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{
    public static String CREATEACCOUNT_URL = BASE_URL+"customer/account/create/";
    public CreateAccountPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"firstname\"]") private WebElement firstNameInput;
    @FindBy(id = "lastname") private WebElement lastNameInput;
    @FindBy(id = "email_address") private WebElement emailInput;
    @FindBy(id = "password") private WebElement passwordInput;
    @FindBy(id = "password-confirmation") private WebElement confirmPasswordInput;
    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button") private WebElement createButton;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div") private WebElement successAlert;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div") private WebElement errorAlert;
    @FindBy(id = "password-confirmation-error") private WebElement errorPasswordAlert;

    public void enterFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        lastNameInput.sendKeys(lastName);
    }
    public void enterEmail(String email){
        emailInput.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void enterConfirmPassword(String confirmPassword){
        confirmPasswordInput.sendKeys(confirmPassword);
    }
    public void clickCreateButton(){
        createButton.click();
    }
    public String getAlertText(){
        return successAlert.getText();
    }
    public String getAlertText2(){
        return errorAlert.getText();
    }
    public String getAlertText3(){
        return errorPasswordAlert.getText();
    }
    public boolean checkPasswords(){
        String password = passwordInput.getAttribute("value");
        String confirmPassword = confirmPasswordInput.getAttribute("value");
        return password.equals(confirmPassword);
    }
}

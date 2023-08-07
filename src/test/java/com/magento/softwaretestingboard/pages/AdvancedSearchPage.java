package com.magento.softwaretestingboard.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdvancedSearchPage extends BasePage{

    public static String ADVSEARCH_URL = BASE_URL + "catalogsearch/advanced/";
    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "name") private WebElement productNameInput;
    @FindBy(id = "sku") private WebElement SKUInput;
    @FindBy(id = "description") private WebElement descriptionInput;
    @FindBy(id = "short_description") private WebElement shortDescriptionInput;
    @FindBy(id = "price") private WebElement fromPriceInput;
    @FindBy(id = "price_to") private WebElement toPriceInput;
    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div/button") private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"description\"]") private WebElement descriptionProduct;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[5]/div[2]/ol/li[2]/div/div/strong/a") private WebElement productbutton;
    @FindBy(id = "sorter") private WebElement sortByDropDown;
    @FindBy(xpath = "//*[@id=\"sorter\"]/option[2]") private WebElement priceOption;
    @FindBy(xpath = "//*[@id=\"product-price-1\"]/span") private WebElement randomPrice;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]") private WebElement itemsFoundAlert;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]") private WebElement errorAlert;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[5]/div[2]/ol/li/div/div/strong/a") private WebElement itemFoundName;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ul/li") private WebElement searchCriteria;

    public void enterProductName(String productName){
        productNameInput.sendKeys(productName);
    }
    public void enterSKU (String SKU){
        SKUInput.sendKeys(SKU);
    }
    public void enterDescription (String description){
        descriptionInput.sendKeys(description);
    }
    public void enterShortDescription (String shortDescription){
        shortDescriptionInput.sendKeys(shortDescription);
    }
    public void enterFromPrice (String fromPrice){
        fromPriceInput.sendKeys(fromPrice);
    }
    public void enterToPrice (String toPrice){
        toPriceInput.sendKeys(toPrice);
    }
    public void clickSearchButton (){
        searchButton.click();
    }
    public void clickProductButton(){
        productbutton.click();
    }

    public void sortByOption(String option){
        Select dropdownElement = new Select(sortByDropDown);
        dropdownElement.selectByValue(option);
    }
    public boolean checkIfItIsSelectedPrice(){
        sortByOption("price");
        return priceOption.isSelected();
    }
    public String getDescriptionText() {
        return descriptionProduct.getText();
    }
    public String getAlertText() {
        return itemsFoundAlert.getText();
    }
    public String getErrorAlertText() {
        return errorAlert.getText();
    }
    public String getText(){
        return itemFoundName.getText();
    }
    public String getText2(){
        return randomPrice.getText();
    }
    public boolean isTheSameItemName(){
        return searchCriteria.getText().contains(itemFoundName.getText());
    }




}

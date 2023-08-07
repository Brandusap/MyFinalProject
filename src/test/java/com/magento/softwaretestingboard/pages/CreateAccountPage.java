package com.magento.softwaretestingboard.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoPlayerPage extends BasePage{
    public static String VIDEO_URL = BASE_URL+"watch?v=6AIa3kdKFhg&ab_channel=7clouds";
    public VideoPlayerPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[32]/div[2]/div[1]/button") private WebElement playButton;
    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[32]/div[2]/div[1]/a[2]") private WebElement nextButton;
    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[32]/div[2]/div[1]/span/button") private WebElement muteButton;
    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[32]/div[2]/div[1]/span/div/div") private WebElement volumeSlider;
    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[32]/div[2]/div[2]/button[2]/div/div") private WebElement autoplayButton;
    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[32]/div[2]/div[2]/button[4]") private WebElement settingsButton;
    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[32]/div[2]/div[2]/button[6]") private WebElement miniplayerButton;
    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[35]/div[2]/div[2]/button[8]") private WebElement TheaterMode;
    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[32]/div[2]/div[2]/button[10]") private WebElement fullscreenButton;
    @FindBy(xpath = "/*[@id=\"segmented-like-button\"]/ytd-toggle-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]") private WebElement likeButton;
    @FindBy(xpath = "//*[@id=\"segmented-dislike-button\"]/ytd-toggle-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]") private WebElement dislikeButton;

}

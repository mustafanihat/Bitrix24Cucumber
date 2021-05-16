package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePage {

    public YoutubePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@id='search-icon-legacy']")
    public WebElement searchButton;

    @FindBy(xpath = "(//paper-button[@id='button'])[7]")
    public WebElement dismissButton;

    @FindBy(xpath = "//div[@id='introAgreeButton']")
    public WebElement agreeButton;

    public void writeTextToTheSearchBox(String message){
        Driver.get().findElement(By.xpath("//input[@id='search']")).sendKeys(message);
    }

    public void clickYoutubeChannel(String string){
        Driver.get().findElement(By.xpath("(//*[.='"+string+"'])[1]")).click();
    }


}

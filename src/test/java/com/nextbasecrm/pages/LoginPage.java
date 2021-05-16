package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class LoginPage {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    String password = ConfigurationReader.get("password");
    Random r;

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    //same with driver.findElement(By.id("prependedInput"));
    @FindBy(name = "USER_LOGIN")  public WebElement usernameInput;
    @FindBy(name = "USER_PASSWORD")  public WebElement passwordInput;
    @FindBy(className = "login-btn")  public WebElement loginBtn;

    public void login(String usernameStr,String passwordStr){

        usernameInput.clear();
        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();
 //       activityStreamPage.navigateTo("Activity Stream");

    }
    public void loginAsMarketing(){
        usernameInput.clear();
        usernameInput.sendKeys(ConfigurationReader.get("marketing1_username"));
        passwordInput.sendKeys(password);

        loginBtn.click();
        activityStreamPage.navigateTo("Activity Stream");

    }
    public void loginAsHelpDesk(){

        usernameInput.clear();
        usernameInput.sendKeys(ConfigurationReader.get("helpdesk1_username"));
        passwordInput.sendKeys(password);
        loginBtn.click();
        activityStreamPage.navigateTo("Activity Stream");

    }
    public void loginAsHr(){
        usernameInput.clear();
        usernameInput.sendKeys(ConfigurationReader.get("hr1_username"));
        passwordInput.sendKeys(password);
        loginBtn.click();
        activityStreamPage.navigateTo("Activity Stream");

        //extentLogger.info("enter HR email and password ");
    }
    public void randomlyLogin(){
        r = new Random();
        String[] user =new String[6];
        user[0] = ConfigurationReader.get("helpdesk1_username");
        user[1] = ConfigurationReader.get("helpdesk2_username");
        user[2] = ConfigurationReader.get("marketing1_username");
        user[3] = ConfigurationReader.get("marketing2_username");
        user[4] = ConfigurationReader.get("hr1_username");
        user[5] = ConfigurationReader.get("hr1_username");
        String userName = user[r.nextInt(6)];

        usernameInput.clear();
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginBtn.click();
        activityStreamPage.navigateTo("Activity Stream");
    }



}
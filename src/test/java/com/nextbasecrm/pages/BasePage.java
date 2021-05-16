package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
//    @FindBy(id = "sitemap-menu")
//    public WebElement siteMapMenu;
//
//    @FindBy(id = "logo_24_text")
//    public WebElement logo;
//
//    @FindBy(id = "search-textbox-input")
//    public WebElement searchBox;
//
//    @FindBy(className = "header-search-icon header-search-icon-title")
//    public WebElement searchIcon;

    /**This web element clickable after sendkeys to searchBox web element
     */
    @FindBy(className = "search-title-top-delete")
    public WebElement searchBoxCancelIcon;

    @FindBy(id = "timeman-background")
    public WebElement timeMan;

    /** User name web elements (profile, editProfile, themes, configureNotifications, logOutLink)
     * When we clicked the userName web element,
     * the other web elements will be clickable
     */
    @FindBy(css = "[class='user-name']")
    public WebElement userName;

    @FindBy(linkText = "My Profile")
    public WebElement profile;

    @FindBy(linkText = "Edit Profile Settings")
    public WebElement editProfile;

    @FindBy(linkText = "Themes")
    public WebElement themes;

    @FindBy(linkText = "Configure Notifications")
    public WebElement configureNotifications;

    @FindBy(linkText = "Log out")
    public WebElement logOutLink;

    @FindBy(id = "bx-help-block")
    public WebElement helpButton;

    @FindBy(id = "bx-im-bar-notify")
    public WebElement notifyBar;

    @FindBy(id = "bx-im-bar-search")
    public WebElement searchBar;

    @FindBy(id = "bx-im-external-recent-list")
    public WebElement contactsBar;

    @FindBy(id = "pagetitle")
    public WebElement pageTitle;





    public String getPageTitle() {
        return pageTitle.getText();
    }

    public String getUserName(){
        BrowserUtils.waitForVisibility(userName, 3);
        return userName.getText();
    }

    public void logOut(){
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
        BrowserUtils.waitFor(1);
    }

    public void goToMyUser(){
        BrowserUtils.waitForClickablility(userName, 3).click();
        BrowserUtils.waitForClickablility(profile, 3).click();

    }


    public void navigateTo(String module) {
        if(module.equals("Applications")||module.equals("Workflows")){
            Driver.get().findElement(By.id("left-menu-more-btn")).click();
            Driver.get().findElement(By.cssSelector("[title='"+module+"']")).click();
        }else{
            Driver.get().findElement(By.cssSelector("[title='"+module+"']")).click();
        }
    }
}

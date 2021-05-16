package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Announcement extends com.nextbasecrm.pages.BasePage {

    private Actions actions = new Actions(Driver.get());
    // USER STORY7 TestCase1
    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreButton;
    @FindBy(xpath = "//span[.='Announcement']")
    public WebElement announcement;
    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesClick;
    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement sendFileDesktop;

    // USER STORY7 TestCase2
    @FindBy(xpath = "//span[.='All employees']")
    public WebElement addMore;
    @FindBy(className = "bx-editor-iframe")
    public WebElement textIframe;
    @FindBy(xpath = "(//a[@hidefocus=\"true\"])[42]")
    public WebElement departmanAndEmployee;
    @FindBy(id = "feed-add-post-destination-container")
    public WebElement toSendMail;
    @FindBy(id = "feed-add-post-destination-input")
    public WebElement sendEmail;


    // USER STORY7 TestCase3
    @FindBy(id = "destination8404275_last_UA")
    public WebElement allEmployees;
    @FindBy(xpath = "//a[.='My Groups']")
    public WebElement employeesAndDepartments;
    @FindBy(xpath = "//div[.='marketing15@cybertekschool.com']")
    public WebElement sendMailAdres;
    @FindBy(xpath = "//span[@title=\"Link\"]")
    public WebElement linkButton;
    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement sendLinkText;
    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement sendLinkUrl;
    @FindBy(id = "undefined")
    public WebElement saveButton;
    @FindBy(id = "blog-submit-button-save")
    public WebElement bluesendButton;

    // USER STORY7 TestCase4
    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement videoButton;
    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoLinkOpen;


    // USER STORY7 TestCase5
    @FindBy(xpath = "//span[@data-bx-action=\"quote\"]")
    public WebElement comma;
    @FindBy(className = "bxhtmled-quote")
    public WebElement messageIframe;
    @FindBy(id = "blog-submit-button-save")
    public WebElement sendMessageFromIframe;
    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionButton;

    // USER STORY7 TestCase6
    @FindBy(xpath = "//div/div[.='marketing20@cybertekschool.com']")
    public WebElement chooseMailAdress;
    // USER STORY7 TestCase7
    @FindBy(id = "lhe_button_editor_blogPostForm")
    public WebElement visialEditorButton;
    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement visualVisible;

    // USER STORY7 TestCase8
    @FindBy(id = "lhe_button_title_blogPostForm")
    public WebElement topicIcon;
    @FindBy(id = "POST_TITLE")
    public WebElement topicBox;

    // USER STORY7 TestCase9
    @FindBy(xpath = "//span[@onclick=\"BX.VideoRecorder.start('blogPostForm', 'post');\"]")
    public WebElement vidoButtonClick;
    @FindBy(xpath = "//span[.='Allow']")
    public WebElement popupAllow;


  public void loginAnnouncement (){

        new com.nextbasecrm.pages.LoginPage().randomlyLogin();
        moreButton.click();
        announcement.click();
        BrowserUtils.waitFor(2);

  }
}
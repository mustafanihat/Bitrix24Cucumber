package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends com.nextbasecrm.pages.BasePage {

    private Actions actions = new Actions(Driver.get());

    // USER STORY7 TestCase1
    @FindBy(id = "feed-add-post-form-link-text")        public WebElement moreButton;
    @FindBy(xpath = "//span[.='Announcement']")         public WebElement announcement;
    @FindBy(id = "bx-b-uploadfile-blogPostForm")        public WebElement uploadFilesClick;
    @FindBy(xpath = "//input[@name='bxu_files[]']")     public WebElement sendFileDesktop;

    // USER STORY7 TestCase2
    @FindBy(xpath = "//span[.='All employees']")        public WebElement addMore;
    @FindBy(className = "bx-editor-iframe")             public WebElement textIframe;
    @FindBy(xpath = "//a[.='Employees and departments']")public WebElement departmanAndEmployee;
    @FindBy(id = "feed-add-post-destination-input")      public WebElement sendEmail;
    // USER STORY7 TestCase3
    @FindBy(id = "destination8404275_last_UA")          public WebElement allEmployees;
    @FindBy(xpath = "//a[.='My Groups']")               public WebElement employeesAndDepartments;
    @FindBy(xpath = "//div[.='marketing15@cybertekschool.com']")public WebElement sendMailAdres;
    @FindBy(xpath = "//span[@title=\"Link\"]")                  public WebElement linkButton;
    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")         public WebElement sendLinkText;
    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")     public WebElement sendLinkUrl;
    @FindBy(id = "undefined")                            public WebElement saveButton;

    // USER STORY7 TestCase4
    @FindBy(xpath = "//span[@title='Insert video']")        public WebElement videoButton;
    @FindBy(id = "video_idPostFormLHE_blogPostForm-source") public WebElement videoLinkOpen;
    @FindBy(xpath = "//label[.=\"Video size:\"]") public WebElement videoSize;
    @FindBy(id = "undefined") public WebElement videoSaveButton;


    // USER STORY7 TestCase5
    @FindBy(xpath = "//span[@data-bx-action=\"quote\"]")        public WebElement comma;
    @FindBy(className = "bxhtmled-quote")                      public  WebElement messageIframe;
    @FindBy(id = "blog-submit-button-save")                     public WebElement sendMessageFromIframe;






    @FindBy(className = "feed-add-post-micro-title")
    public WebElement shareBox;

    @FindBy(xpath = "//span[*='Message']")
    public WebElement Message;


    @FindBy(xpath = "(//a[@class='feed-post-user-name'])[1]")
    public WebElement LastMessage;


    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement lastMessageText;

    @FindBy(xpath= "//a[.='Amazon Link']")
    public WebElement amazonLink;

    //<More> named drop down menu
    @FindBy(id = "feed-add-post-form-link-text")                //>>>>> [More] <<<<<
    public WebElement MoreDropDown;

    //<File> button under <More> named drop down menu
    @FindBy(xpath = "//span[contains(@class,'form-file')]")     //>>>>> [More] --> [File] <<<<<
    public WebElement FileButtonUnderMoreDropDownMenu;

    //<UploadFileAndImage> button after <File> button has been clicked
    @FindBy(name = "bxu_files[]")                               //>>>>> [More] --> [File] --> [UploadFileAndImage] <<<<<
    public WebElement uploadFileAndImage;

    //<Send> button after a file or an image has been uploaded
    @FindBy(id = "blog-submit-button-save")                     //>>>>> [More] --> [File] --> [UploadFileAndImage] --> [Send] <<<<<
    public WebElement SendButton;


    public WebElement getTag(String tagName){
        return Driver.get().findElement(By.xpath("//span[*='"+tagName+"']"));
    }
    public void share(String text){ actions.moveToElement(uploadFileAndImage).click().pause(2000).sendKeys(text).perform();
    }

    //Uploading a file directly from PC (String parameter ---> relativePath of the file
    public String fileFromPCForUpload(String relativePath){
        return System.getProperty("user.dir") + "/" + relativePath;
    }



}

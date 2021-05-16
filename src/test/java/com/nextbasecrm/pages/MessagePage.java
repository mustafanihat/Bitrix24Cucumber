package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage extends ActivityStreamPage{

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFileBtn;


    @FindBy(name = "bxu_files[]")
    public WebElement UploadFilesAndImagesBtn;

    @FindBy(xpath = "//span[*='Select document from Bitrix24']/..")

    public WebElement SelectDocumentFromBitrix24Btn;

    @FindBy(xpath = "//div[@id='bx-file-dialog-content-DiskFileDialog']/div/div[3]/div")
    public WebElement lastfile;

    @FindBy(xpath = "//div[@class='popup-window-buttons']//span[contains(text(),'Select document')]")
    public WebElement SelectDocumentBtn;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(id = "bx-destination-tag")
    public WebElement AddMoreBtn;

    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement employeesAndDepartmentsBtn;

    @FindBy(xpath = "//div[@id='bx-lm-category-relation-129']/a[1]")
    public WebElement firstMailfromEmployees;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement toText;
    @FindBy(className = "popup-window-close-icon")
    public WebElement closeAddMorePageBtn;

    @FindBy(className = "bx-editor-iframe")
    public WebElement textIframe;

    @FindBy(css = "[contenteditable='true']")
    public WebElement textInputBox;

    public WebElement getIcon(String Icontext){
        return Driver.get().findElement(By.xpath("//span[@title='"+Icontext+"']"));
    }
    // link text after clicking link icon
    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;         // first click link icon

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURL;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceUrlText;

    @FindBy(className = "bxhtmled-quote")
    public WebElement quoteTextBox;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionIcon;

    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement editorTextBar;

    @FindBy(id = "lhe_button_editor_blogPostForm")
    public WebElement visualEditorIcon;

    @FindBy(id = "POST_TITLE")
    public WebElement topicTextBox;

    @FindBy(xpath = "(//span[.='Record Video'])[1]")
    public WebElement recordVideoButton;

    @FindBy(id = "popup-window-content-bx-popup-videomessage-popup")
    public WebElement popupVideoMessage;

    @FindBy(id = "TAGS_blogPostForm67abSn")
    public WebElement addTagInputBox;

    @FindBy(xpath = "//div[.='birthdays']")
    public WebElement birthdaysTag;

    @FindBy(css = "[class='popup-window-button']")
    public WebElement addTagButton;

    @FindBy(xpath = "(//div[@id='post-tags-container-blogPostForm']//span)[1]")
    public WebElement firstAddedTag;

}

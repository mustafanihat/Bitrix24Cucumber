package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage extends com.nextbasecrm.pages.BasePage {

    public TaskPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheckbox;

    @FindBy(id = "lhe_button_editor_task-form-lifefeed_task_form")
    public WebElement visualEditorSymbol;

    @FindBy(id = "bx-html-editor-tlbr-lifefeed_task_form")
    public WebElement visualEditorTextBar;

    @FindBy(id = "bx-b-uploadfile-task-form-lifefeed_task_form")
    public WebElement uploadFileButton;

    @FindBy(xpath = "(//span[@data-bx-action=\"quote\"])[2]")
    public WebElement quoteButton;

    @FindBy(tagName = "blockquote")
    public WebElement quoteBlock;

    @FindBy(xpath = "//div[@id=\"bx-html-editor-iframe-cnt-lifefeed_task_form\"]/iframe[@class=\"bx-editor-iframe\"]")
    public WebElement quoteFrame;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFileButton2;

    @FindBy(id = "bx-b-mention-task-form-lifefeed_task_form")
    public WebElement addMentionButton;

    @FindBy(xpath = "//a[starts-with(@id, 'destDepartmentTab_mention')]")
    public WebElement empAndDepBtn;

    @FindBy(xpath = "//div[.=\"marketing20@cybertekschool.com\"]")
    public WebElement employeeMail;

    @FindBy(xpath = "//div[@id=\"bx-html-editor-iframe-cnt-lifefeed_task_form\"]//iframe")
    public WebElement IframeTaskForm;

    @FindBy(xpath = "//body")
    public WebElement TaskFormContent;








}

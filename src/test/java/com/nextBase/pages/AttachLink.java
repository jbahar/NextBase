package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttachLink {
    public AttachLink (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@id='feed-add-post-form-tab-message']/span")
    public WebElement messageButton;

    @FindBy (xpath = "//span[@title='Link']/i")
    public WebElement linkAttachButton;

    @FindBy (xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkTextBox;

    @FindBy (xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkUrlBox;

    @FindBy (xpath = "//input[@id='undefined']")
    public WebElement   linkSaveButton;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendMessageButton;

    @FindBy (xpath = "//a[.='Metro Carpet - Test']")
    public WebElement linkInMessageBody;

    @FindBy (xpath = "//a[.='Metro Carpet - Test']")
    public WebElement linkConfirmation;


}

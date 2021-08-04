package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id = 'feed-add-post-form-tab-message']")
    public WebElement messageButton;

    @FindBy(xpath = "//button[@id = 'blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//button[@id = 'blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[@title = 'Link']")
    public WebElement linkButton;


}

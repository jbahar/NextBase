package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollPage {
     public PollPage () {
         PageFactory.initElements(Driver.getDriver(), this);

     }

     @FindBy (xpath = "(//span[.='Poll'])[2]")
    public WebElement pollElement ;

     @FindBy (xpath = "//input[@id='question_0']")
    public WebElement questionBox;

     @FindBy (xpath = "//input[@id='answer_0__0_']")
    public WebElement answerBox;

}



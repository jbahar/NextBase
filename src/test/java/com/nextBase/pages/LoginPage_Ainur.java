package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Ainur {

    public LoginPage_Ainur () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username1;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password1;

    @FindBy(xpath = "//input[@*='Log In']")
    public WebElement login1;

    @FindBy(xpath = "//a[@title='Home']")
    public WebElement title1;

    @FindBy(xpath ="//input[@type='checkbox']")
    public WebElement rememberMe1;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPassword1;

    @FindBy(xpath = "//div[. ='Get Password']")
    public WebElement getPassword1;

    @FindBy(xpath = "//div[.='A code to reset your password and your registration information has just been sent to your e-mail address. Please check your e-mail. Note that the reset code is re-generated on each request.']")
    public WebElement message1;

    @FindBy (xpath = "//button[@class='login-btn']")
    public WebElement resetSettings1;

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement logOut1;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOutButton1;
}

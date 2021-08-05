package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Zalina {
    public LoginPage_Zalina() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@*='USER_LOGIN']")
    public WebElement username;

    @FindBy(xpath = "//input[@*='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@*='Log In']")
    public WebElement login;

    @FindBy(xpath = "//a[@title='Home']")
    public WebElement title;

    @FindBy(xpath ="//input[@type='checkbox']")
    public WebElement rememberMe;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//div[. ='Get Password']")
    public WebElement getPassword;

    @FindBy(xpath = "//div[.='A code to reset your password and your registration information has just been sent to your e-mail address. Please check your e-mail. Note that the reset code is re-generated on each request.']")
    public WebElement message;

    @FindBy (xpath = "//button[@class='login-btn']")
    public WebElement reset;

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement logOut;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOutButton;

    }


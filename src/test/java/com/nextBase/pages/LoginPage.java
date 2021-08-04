package com.nextBase.pages;

import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends HomePage{
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//input[@name = 'USER_LOGIN']")
    public WebElement username;

    @FindBy (xpath = "//input[@name = 'USER_PASSWORD']")
    public WebElement password;

    @FindBy (xpath = "//input[@value = 'Log In']")
    public WebElement loginButton;

    @FindBy (xpath = "//input[@id = 'USER_REMEMBER']")
    public WebElement rememberMeButton;

    @FindBy (xpath = "//a[. = 'Forgot your password?']")
    public WebElement forgetPassword;

    @FindBy (xpath = "//*[.= 'Reset password']")
    public WebElement resetPasswordButton;

    @FindBy (xpath = "//div[@class ='notetext']")
    public WebElement resetPasswordMessage;

    @FindBy(xpath = "//div[. ='Get Password']")
    public WebElement getPasswordTitle;



    public LoginPage login(String user, String pass) {
        user = ConfigurationReader.getProperty("username");
       username.sendKeys(user);

       pass =ConfigurationReader.getProperty("password");
       password.sendKeys(pass);
        return this;
    }


}

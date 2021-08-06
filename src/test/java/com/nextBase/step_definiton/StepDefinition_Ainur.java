package com.nextBase.step_definiton;

import com.nextBase.pages.LoginPage_Ainur;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinition_Ainur {

    LoginPage_Ainur loginPage_ainur = new LoginPage_Ainur();

    @Given("User on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("https://login2.nextbasecrm.com");

    }
    @When("User click on the FORGOT YOUR PASSWORD? link")
    public void user_click_on_the_forgot_your_password_link()  {
        loginPage_ainur.forgotPassword1.click();

    }
    @When("User enters the username {string}")
    public void user_enters_the_username(String username) {
        loginPage_ainur.username1.sendKeys(username);

    }
    @When("User able to reset password button")
    public void user_able_to_reset_password_button() {
        loginPage_ainur.getPassword1.isDisplayed();

    }
    @When("User click on the reset password button")
    public void user_click_on_the_reset_password_button() {
        loginPage_ainur.resetSettings1.click();
    }

    @Then("Confirmation message about reset password should be displayed")
    public void confirmation_message_about_reset_password_should_be_displayed() {
        BrowserUtils.sleep(2);
        String actualMessage = loginPage_ainur.message1.getText();
        String expectedMessage = "A code to reset your password and your registration information has just been sent to your e-mail address. Please check your e-mail. Note that the reset code is re-generated on each request.";
        Assert.assertEquals(expectedMessage,actualMessage);
        System.out.println(actualMessage);
        System.out.println(expectedMessage);
    }
}

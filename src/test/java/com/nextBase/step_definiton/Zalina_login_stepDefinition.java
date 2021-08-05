package com.nextBase.step_definiton;

import com.nextBase.pages.LoginPage_Zalina;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Zalina_login_stepDefinition {

    LoginPage_Zalina loginPage = new LoginPage_Zalina();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://login2.nextbasecrm.com");

    }

    @When("user enters the username {string}")
    public void userEntersTheUsername(String un) {
        loginPage.username.sendKeys(un);
    }
    @And("user enters the password {string}")
    public void userEntersThePassword(String pass) {
        loginPage.password.sendKeys(pass);

    }
    @When("user click on the login button")
    public void user_click_on_the_login_button() {
      loginPage.login.click();

    }
    @Then("user can see homepage")
    public void user_can_see_homepage() {
        loginPage.title.isDisplayed();

        loginPage.logOut.click();

        loginPage.logOutButton.click();



    }

    @When("user click on the {string}")
    public void userClickOnThe(String arg0) {
        loginPage.rememberMe.click();
    }

    @Then("{string} will be selected")
    public void willBeSelected(String arg0) {
        loginPage.rememberMe.isSelected();
    }

    @When("user click on the {string} link")
    public void userClickOnTheLink(String arg0) {
        loginPage.forgotPassword.click();

        loginPage.username.sendKeys("helpdesk39@cybertekschool.com");

    }

    @Then("user is able to reset the password")
    public void userIsAbleToResetThePassword() {
        loginPage.getPassword.isDisplayed();
    }

        @And("user click on the reset password")
        public void userClickOnTheResetPassword() {
        loginPage.reset.click();

    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String expectedMessage) {

        BrowserUtils.sleep(2);
        String actualMessage = loginPage.message.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        System.out.println(actualMessage);
        System.out.println(expectedMessage);

    }



}

package com.nextBase.step_definiton;

import com.nextBase.pages.LoginPage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("user is in the login page")
    public void user_is_in_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }
    @When("user enter {string} and {string}")
    public void user_enter_and(String username, String password) {
        loginPage.login(username, password);
    }
    @When("user click login")
    public void user_click_login() {
        loginPage.loginButton.click();
    }
    @Then("user should be able to navigate to {string} page")
    public void user_should_be_able_to_navigate_to_page(String expectedPage) {
        String actualPage = Driver.getDriver().findElement(By.xpath("//span[. ='CRM']")).getText();
        System.out.println("actualPage = " + actualPage);
        System.out.println("expectedPage = " + expectedPage);
         Assert.assertTrue(expectedPage.contains(actualPage));

    }

    @Then("user should be able to click on {string}")
    public void userShouldBeAbleToClickOn(String rememberMe) {
        loginPage.rememberMeButton.click();
        loginPage.rememberMeButton.isSelected();
    }

    @When("user click on {string} button")
    public void userClickOnButton(String forgetPassword) {
        loginPage.forgetPassword.click();
    }

    @Then("user should see {string} on the title")
    public void userShouldSeeOnTheTitle(String expectedTitle) {
        String actualTitle = loginPage.getPasswordTitle.getText();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}

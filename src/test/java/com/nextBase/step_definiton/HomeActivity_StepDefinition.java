package com.nextBase.step_definiton;

import com.nextBase.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class HomeActivity_StepDefinition {
    LoginPage loginPage = new LoginPage();

    @And("user is in home page and click on message button")
    public void userIsInHomePageAndClickOnMessageButton() {
        loginPage.messageButton.click();
    }

    @Then("button should be clickable")
    public void button_should_be_clickable() {
        loginPage.messageButton.isSelected();
    }


    @Then("user can cancel the message")
    public void userCanCancelTheMessage() {
        loginPage.cancelButton.click();
        loginPage.cancelButton.isSelected();

    }

    @Then("user can be clink on the link icon")
    public void userCanBeClinkOnTheIcon() {
        loginPage.linkButton.isSelected();
        loginPage.linkButton.isSelected();

    }
}

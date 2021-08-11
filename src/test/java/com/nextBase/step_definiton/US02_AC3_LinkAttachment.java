package com.nextBase.step_definiton;

import com.nextBase.pages.AttachLink;
import com.nextBase.pages.LoginPage;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;

public class US02_AC3_LinkAttachment {
    LoginPage loginPage = new LoginPage();
    AttachLink attachLink = new AttachLink();
/*
    @Given("user is in home page and click on message button")
    public void userIsInHomePageAndClickOnMessageButton() {
        //loginPage.messageButton.click();
        attachLink.messageButton.click();
    }
*/
    @When("user click Message link")
    public void user_click_message_link() {
        attachLink.messageButton.click();
    }
    @When("user click link icon in the Message body")
    public void user_click_link_icon_in_the_message_body() {
        attachLink.linkAttachButton.click();
    }
    @When("user enter {string} and {string} in the designated areas")
    public void user_enter_and_in_the_designated_areas(String string, String string2) {
        attachLink.linkTextBox.sendKeys(string);
        attachLink.linkUrlBox.sendKeys(string2);
    }
    @When("user click Save button")
    public void user_click_save_button() throws InterruptedException {
        attachLink.linkSaveButton.click();
        Thread.sleep(3000);
    }
    @When("user click Send button")
    public void user_click_send_button() {
        attachLink.sendMessageButton.click();
    }
    @And("user can see message {string} text and the link {string}")
    public void userCanSeeMessageTextAndTheLink(String text, String link) {
        String actualText = attachLink.linkConfirmation.getText();
        Assert.assertEquals(actualText,text);
    }

    @Then("user click the link {string} in the message ad title is: {string}")
    public void userClickTheLinkInTheMessageAdTitleIs(String link, String title) throws InterruptedException {
        //attachLink.linkInMessageBody.click();
        Thread.sleep(2000);
        //Get Current Page
        String currentPageHandle = Driver.getDriver().getWindowHandle();
        attachLink.linkInMessageBody.click();

//Add Logic to Wait till Page Load

// Get all Open Tabs
        ArrayList<String> tabHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());

        String pageTitle = "ThePageTitleIhaveToCheckFor";
        boolean myNewTabFound = false;

        for(String eachHandle : tabHandles)
        {
            Driver.getDriver().switchTo().window(eachHandle);
            // Check Your Page Title
            if(Driver.getDriver().getTitle().equalsIgnoreCase(pageTitle))
            {
                // Report ur new tab is found with appropriate title

                //Close the current tab
                Driver.getDriver().close(); // Note driver.quit() will close all tabs

                //Swithc focus to Old tab
                Driver.getDriver().switchTo().window(currentPageHandle);
                myNewTabFound = true;
            }
        }

        if(myNewTabFound)
        {
            // Report page not opened as expected
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(title));
    }
}

package com.nextBase.step_definiton;

import com.nextBase.pages.PollPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Poll_US4_AC1_StepDefinition {

    PollPage pollPage = new PollPage();

    @When("user can click on the poll bottom on the homapage")
    public void user_can_click_on_the_poll_bottom_on_the_homapage() {

        pollPage.pollElement.click();

    }
    @Then("user should be able to see {string} and {string} title")
    public void user_should_be_able_to_see_and_title(String expectedQuestion, String expectedAnswer) {

        String acttualQustionTitle = pollPage.questionBox.getText();
        String acttualAnswerTitle = pollPage.answerBox.getText();

        Assert.assertTrue(expectedQuestion.contains(acttualQustionTitle));
        Assert.assertTrue(expectedAnswer.contains(acttualAnswerTitle));

    }

}

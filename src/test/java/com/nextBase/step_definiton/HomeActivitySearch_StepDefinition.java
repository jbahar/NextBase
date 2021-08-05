package com.nextBase.step_definiton;

import com.nextBase.pages.LoginPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeActivitySearch_StepDefinition {
    LoginPage page = new LoginPage();

    @When("User type in the search box {string}")
    public void user_type_in_the_search_box(String searchWord) {
        page.searchBox.sendKeys(searchWord);
        BrowserUtils.sleep(2);
    }

    /*
    In next test we will check if any possible suggestion (ANY String from List<String> possible) will show up while we typing in the search box
    If Something will be shown - test passed, If not - failed after loop
     */

    @Then("User should see suggested modules")
    public void user_should_see_suggested_modules(List<String> possible) {
        BrowserUtils.sleep(2);
        List<WebElement> actual = page.searchSuggestedModules;
        List<String> actualSuggestions = BrowserUtils.getElementsText(actual);

        System.out.println(actualSuggestions);
        System.out.println(possible);

        for (String each :actualSuggestions) {
            if (possible.contains(each)) {
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.fail();
    }

}

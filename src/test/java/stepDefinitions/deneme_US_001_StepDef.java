package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.Driver;

public class deneme_US_001_StepDef {

    @When("User verifies url {string}")
    public void user_verifies_url(String expectedUrl) {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Not Equals URL",  actualUrl, expectedUrl);
    }
    @Then("User verifies title and Homepage")
    public void user_verifies_title_and_homepage() {
        String  expectedTitle= "Get Your Locally Sourced Veggies&Fruits from neighbors | Urbanic Farm";
        String  actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}

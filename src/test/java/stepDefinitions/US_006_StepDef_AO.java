package stepDefinitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_006_StepDef_AO {
    HomePage homePage = new HomePage();

    @When("user clicks on contact us link")
    public void userClicksOnContactUsLink() {

        Assert.assertTrue(homePage.link_contactUs.isDisplayed());
        Assert.assertTrue(homePage.link_contactUs.isEnabled());
        homePage.link_contactUs.click();

    }

    @Then("user verifies that relevant page is {string}")
    public void userVerifiesThatRelevantPageIs(String expectedUrl) {

        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println("Current Title: " + Driver.getDriver().getTitle());
        System.out.println("Current Url : " + Driver.getDriver().getCurrentUrl());

        Assert.assertEquals("They are not equal",expectedUrl,actualUrl);
        BrowserUtilities.waitFor(3);

        Driver.closeDriver();


    }

}

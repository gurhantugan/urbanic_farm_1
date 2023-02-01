package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_008_StepDef_SG {

    HomePage homePage = new HomePage();

    @Given("User is on home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        BrowserUtilities.waitFor(3);

    }

    @When("User checks the register button is clickable")
    public void user_checks_the_register_button_is_clickable() {
        homePage.registerButton.isEnabled();
    }

    @Then("User clicks the register button")
    public void user_clicks_the_register_button() {
        homePage.registerButton.click();
        BrowserUtilities.waitFor(3);
    }

    @Then("Relevant page opens")
    public void relevant_page_opens() {
        String actualUrl = "https://test.urbanicfarm.com/auth/register";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

}

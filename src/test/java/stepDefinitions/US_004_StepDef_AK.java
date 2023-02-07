package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_004_StepDef_AK {

    HomePage homePage = new HomePage();

    @Given("user goes to url")
    public void userGoesToUrl() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver().manage().window().maximize();

    }

    @When("user clicks the discover button")
    public void userClicksTheDiscoverButton() {
        homePage.button_explore.click();
    }

    @Then("user verifies that the {string} is visible")
    public void userVerifiesThatTheIsVisible(String arg0) {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(arg0));
        Driver.closeDriver();

    }
}

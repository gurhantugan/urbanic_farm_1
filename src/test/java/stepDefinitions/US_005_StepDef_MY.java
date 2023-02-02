package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_005_StepDef_MY {
    HomePage homePage= new HomePage();

    @Given("User is on the Urbanic_Farm page")
    public void user_is_on_the_urbanic_farm_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver().manage().window().maximize();
    }
    @When("The user clicks on About us")
    public void theUserClicksOnAboutUs() throws InterruptedException {
        BrowserUtilities.waitFor(3);
         homePage.link_aboutUs.click();


    }


    @Then("User should go to relevant page")
    public void user_should_go_to_relevant_page() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://test.urbanicfarm.com/about";
        Assert.assertEquals(expectedUrl,currentUrl);


    }



}

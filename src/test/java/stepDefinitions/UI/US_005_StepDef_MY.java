package stepDefinitions.UI;

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

    @Given("user is on the Urbanic_Farm page")
    public void user_is_on_the_urbanic_farm_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
      //  Driver.getDriver().manage().window().maximize();

    }



    @When("The user clicks on About us")
    public void theUserClicksOnAboutUs() throws InterruptedException {
        BrowserUtilities.waitFor(3);
         homePage.link_aboutUs.click();
    }

    @Then("user should go to relevant page with {string}")
    public void userShouldGoToRelevantPageWith(String expectedUrl) {
        String currentUrl;
        currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,currentUrl);
    BrowserUtilities.waitFor(5);
    Driver.closeDriver();
    }
}

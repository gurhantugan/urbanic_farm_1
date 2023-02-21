package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_010_StepDef_ED {
    HomePage homePage = new HomePage();

    @Given("User is on the Urbanic_Farm page")
    public void user_is_on_the_urbanic_farm_page() {
        Driver.getDriver( "https://test.urbanicfarm.com/" ).get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver( "https://test.urbanicfarm.com/" ).manage().window().maximize();
    }


    @And("User clickable the sell your produce button")
    public void userClickableTheSellYourProduceButton() throws InterruptedException{
        BrowserUtilities.waitFor(3);
        homePage.button_shellYourProduct.click();



    }

    @Then("user verifies that relevant page contains {string}")
    public void userVerifiesThatRelevantPageContains(String expectedUrl) {

        String currentUrl = Driver.getDriver( "https://test.urbanicfarm.com/" ).getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(expectedUrl));
        BrowserUtilities.waitFor(5);
        Driver.closeDriver();
    }
}
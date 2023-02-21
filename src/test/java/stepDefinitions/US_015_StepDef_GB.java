package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.JSUtils;

public class US_015_StepDef_GB {
    HomePage homePage = new HomePage();

    @When("The user clicks on button wefunder")
    public void theUserClicksOnButtonWefunder() {
        BrowserUtilities.waitFor(3);
        JSUtils.clickElementByJS(homePage.button_wefunder);
        BrowserUtilities.waitFor(3);
    }

    @Then("user should go to relevant page in the new window {string}")
    public void userShouldGoToRelevantPageInTheNewWindow(String expectedUrl) {
        BrowserUtilities.switchToWindowWithIndex(1);
        String currentUrl = Driver.getDriver( "https://test.urbanicfarm.com/" ).getCurrentUrl();
        Assert.assertEquals(expectedUrl,currentUrl);
        BrowserUtilities.waitFor(5);
        Driver.closeDriver();
    }
}
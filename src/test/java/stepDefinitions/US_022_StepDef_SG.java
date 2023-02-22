package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_022_StepDef_SG {

    HomePage homePage = new HomePage();

    @When("User scrolls down on the home page")
    public void user_scrolls_down_on_the_home_page() {
         BrowserUtilities.scrollToElement(homePage.link_privacyPoliciy);
         BrowserUtilities.waitFor(3);
    }
    @Then("User clicks the privacy policy")
    public void user_clicks_the_privacy_policy() {
        homePage.link_privacyPoliciy.click();
        BrowserUtilities.waitFor(3);
         
    }
    @Then("Privacy policy page opens")
    public void privacy_policy_page_opens() {
        String actualUrl = "https://test.urbanicfarm.com/privacy-policy";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
         
    }

}

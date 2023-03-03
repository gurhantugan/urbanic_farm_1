package stepDefinitions.UI;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_028_StepDef_SG {

    HomePage homePage = new HomePage();

    @Then("User checks the LinkedIn button is clickable")
    public void user_checks_the_linked_in_button_is_clickable() {
        homePage.button_linkedin.isEnabled();
          
    }
    @Then("User clicks the LinkedIn button")
    public void user_clicks_the_linked_in_button() {
        homePage.button_linkedin.click();
        BrowserUtilities.waitFor(3);
          
    }
    @Then("LinkedIn page opens")
    public void linked_in_page_opens() {
        String actualUrl = "https://www.linkedin.com/company/urbanicfarm/";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
          
    }

}

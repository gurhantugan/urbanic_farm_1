package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class US_041_StepDef_SK {

    LoginPage lp = new LoginPage();
    @When("User clicks the Scheduled delivery button")
    public void user_clicks_the_scheduled_delivery_button() {
        lp.linkScheduledDelivery.click();
        Assert.assertTrue(lp.linkScheduledDelivery.isDisplayed());
        Assert.assertTrue(lp.linkScheduledDelivery.isEnabled());
    }
    @Then("user should go to relevant page  {string}")
    public void user_should_go_to_relevant_page(String expectedUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("-------" + expectedUrl);
        System.out.println("---------" + actualUrl);
        Assert.assertEquals(expectedUrl , actualUrl);
        Driver.getDriver().close();
    }
}

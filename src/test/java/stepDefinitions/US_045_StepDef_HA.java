package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SelfShareTradePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;

public class US_045_StepDef_HA {
    SelfShareTradePage selfShareTradePage = new SelfShareTradePage();
    @When("user clicks on notifications")
    public void user_clicks_on_notifications() {
        selfShareTradePage.icon_notifications.click();
    }
    @Then("user verifies that the notications header")
    public void user_verifies_that_the_notications_header() {
        String actualText = selfShareTradePage.icon_notificationsHeader.getText();
        Assert.assertEquals(actualText, "Notifications");
    }
}

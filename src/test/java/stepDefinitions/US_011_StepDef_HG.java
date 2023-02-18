package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_011_StepDef_HG {
    HomePage hp = new HomePage();
    @Then("user verifies \\(Backyard gardeners and farmers join the Movement For Free!) that register now button is clickable")
    public void user_verifies_backyard_gardeners_and_farmers_join_the_movement_for_free_that_register_now_button_is_clickable() {
        BrowserUtilities.scrollToElement(hp.buttonRegisterNow);
       // hp.buttonRegisterNow.click();
        BrowserUtilities.clickWithJS(hp.buttonRegisterNow);
    }
    @Then("user verifies that page is {string}")
    public void user_verifies_that_page_is(String expectedUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Driver.getDriver().close();
    }
}

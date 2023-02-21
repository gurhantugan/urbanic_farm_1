package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class US_039_StepDef_MO {

    LoginPage lp=new LoginPage();

    @Then("User clicks the About us button")
    public void user_clicks_the_about_us_button() {
        lp.loginAboutLink.click();
        Assert.assertTrue(lp.loginAboutLink.isDisplayed());
        Assert.assertTrue(lp.loginAboutLink.isEnabled());
    }

    @Then("User is on relevant page")
    public void user_is_on_relevant_page() {
        String expectedUrl = "https://test.urbanicfarm.com/about";
        String actualUrl = Driver.getDriver( "https://test.urbanicfarm.com/" ).getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver( "https://test.urbanicfarm.com/" ).close();
    }
}

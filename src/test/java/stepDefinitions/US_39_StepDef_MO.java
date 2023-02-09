package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class US_39_StepDef_MO {

    LoginPage lp=new LoginPage();

    @Then("User clicks the About us button")
    public void user_clicks_the_about_us_button() {
        lp.loginAbout.click();
        Assert.assertTrue(lp.loginAbout.isDisplayed());
        Assert.assertTrue(lp.loginAbout.isEnabled());

    }

    @Then("User is on relevant page")
    public void user_is_on_relevant_page() {
        String expectedUrl = "https://test.urbanicfarm.com/about";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("expectedUrl="+expectedUrl);
        System.out.println("actualUrl="+actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);




    }

}

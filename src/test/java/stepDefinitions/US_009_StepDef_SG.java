package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;

public class US_009_StepDef_SG {

    HomePage homePage = new HomePage();

    @Then("User checks the Get Fresh Produce button is clickable")
    public void user_checks_the_get_fresh_produce_button_is_clickable() {
        Assert.assertTrue(homePage.button_getFreshProduce.isEnabled());
        
    }
    @Then("User clicks the Get Fresh Produce button")
    public void user_clicks_the_get_fresh_produce_button() {
        homePage.button_getFreshProduce.click();

    }
    @Then("User asserts relevant page is open")
    public void user_asserts_relevant_page_is_open() {
        String actulaUrl = "https://test.urbanicfarm.com/explore";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actulaUrl,expectedUrl);

    }

}

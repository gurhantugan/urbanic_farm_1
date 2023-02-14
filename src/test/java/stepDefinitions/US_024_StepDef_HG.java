package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;

public class US_024_StepDef_HG {
    HomePage hp = new HomePage();
    @Then("user should  {string}")
    public void user_should(String expectedAddress) {
        String actualAddress = hp.buttonAddress.getText();
        Assert.assertEquals(expectedAddress,actualAddress);
    }
}

package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;

public class US_67_StepDef_MY_ED {
    @Given("user goes to {string} page after login as buyer")
    public void userGoesToPageAfterLoginAsBuyer(String endpoint) {
        BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenBuyerUrl"),endpoint);
        BrowserUtilities.waitFor(2);

    }
}

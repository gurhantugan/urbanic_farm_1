package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;

public class US_055_StepDef_GB {
    @Given("user goes to welcome page after login")
    public void userGoesToWelcomePageAfterLogin() {
        BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenBuyerUrl"));
    }
}
   /* @Given("user goes to {string} page after login")
    public void userGoesToPageAfterLogin(String endPoint) {
        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenSellerUrl"),endPoint);
        BrowserUtilities.waitFor(2);*/
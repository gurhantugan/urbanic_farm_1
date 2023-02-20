package stepDefinitions;

import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.JSUtils;

public class US_027_StepDef_GB {
    HomePage homePage = new HomePage();
    @When("The user clicks on Facebook button")
    public void theUserClicksOnFacebookButton() {
        JSUtils.scrollDownByJS();
        BrowserUtilities.waitFor(3);
        homePage.btn_facebook.click();
        BrowserUtilities.waitFor(3);
    }
}

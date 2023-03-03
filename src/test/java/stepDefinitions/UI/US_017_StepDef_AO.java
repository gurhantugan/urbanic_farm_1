package stepDefinitions.UI;

import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.JSUtils;

public class US_017_StepDef_AO {

    HomePage homePage = new HomePage();
    @When("user clicks on Discover Local Sellers link")
    public void userClicksOnDiscoverLocalSellersLink() {
        JSUtils.scrollDownByJS();
        BrowserUtilities.waitFor(2);
        homePage.link_discoverLocalSellers.click();
    }
}

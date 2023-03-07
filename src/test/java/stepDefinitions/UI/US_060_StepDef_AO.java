package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.YourProductsServicesPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_060_StepDef_AO {
    HomePage homePage = new HomePage();
YourProductsServicesPage ypsp = new YourProductsServicesPage();


    @And("user clicks on cristian button")
    public void userClicksOnCristianButton() {

        homePage.button_account.click();
    }

    @And("user clicks on Your products and services button")
    public void userClicksOnYourProductsAndServicesButton() {

        homePage.yourProductServices_button.click();
    }

    @Given("user is on Your products and services page")
    public void userIsOnYourProductsAndServicesPage() {
        Assert.assertTrue(homePage.ADD_button.isDisplayed());
    }

    @And("user clicks on each products and verifies go back button is functional")
    public void userClicksOnEachProductsAndVerifiesGoBackButtonIsFunctional() {
        for (int i = 0; i < ypsp.links_allProducts.size(); i++) {
            BrowserUtilities.masterClick(ypsp.links_allProducts.get(i));
            BrowserUtilities.waitFor(2);
            Assert.assertTrue(ypsp.button_goBack.isDisplayed());
            Assert.assertTrue(ypsp.button_goBack.isEnabled());
            ypsp.button_goBack.click();
            BrowserUtilities.waitFor(1);

            String expectedUrl = "https://test.urbanicfarm.com/account/hub";
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(expectedUrl,actualUrl);

        }
    }
}

package stepDefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import pages.OrdersPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;

public class US_061_StepDef_ED extends CommonPage {


    OrdersPage ordersPage=new OrdersPage();

    @Given("user goes to {string} page after the login")
    public void userGoesToPageAfterTheLogin(String endPoint) {

        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenBuyerUrl"),endPoint);
        BrowserUtilities.waitFor(2);
    }

    @Then("user clicks rate the product icon")
    public void userClicksRateTheProductIcon(String message) {
        Assert.assertEquals(message,ordersPage.rateTheProduct.getText());

    }

    @Then("user clicks rate the seller button")
    public void userClicksRateTheSellerButton() {
        ordersPage.rateTheProduct_submitButton.click();

    }
}


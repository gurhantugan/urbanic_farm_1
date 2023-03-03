package stepDefinitions.UI;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.JSUtils;

import java.util.List;

public class US_012_StepDef_GT {
    HomePage homePage = new HomePage();

    @Then("user verifies that SELL, SHARE, TRADE buttons are clickable in the Sell Your Products area")
    public void userVerifiesThatSELLSHARETRADEButtonsAreClickableInTheSellYourProductsArea() {
        JSUtils.scrollIntoViewJS(homePage.links_sell_share_trade.get(0));
        BrowserUtilities.waitFor(1);
        for (int i = 0; i < homePage.links_sell_share_trade.size(); i++) {

            Assert.assertTrue(homePage.links_sell_share_trade.get(i).isDisplayed());
            Assert.assertTrue(homePage.links_sell_share_trade.get(i).isEnabled());
            BrowserUtilities.waitFor(1);

        }
    }

    @When("user clicks on SELL, SHARE, TRADE buttons then verifies that relevant pages are opened")
    public void userClicksOnSELLSHARETRADEButtonsThenVerifiesThatRelevantPagesAreOpened(DataTable dataTable) {
        List<String> expectedData = dataTable.column(1);

        for (int i = 0; i < dataTable.column(0).size(); i++) {
            JSUtils.clickElementByJS(homePage.links_sell_share_trade.get(i));
            Assert.assertEquals(expectedData.get(i), Driver.getDriver().getCurrentUrl());
            BrowserUtilities.waitFor(1);
            Driver.getDriver().navigate().back();
            BrowserUtilities.waitFor(1);
        }
        BrowserUtilities.waitFor(15);
        Driver.closeDriver();

    }


}

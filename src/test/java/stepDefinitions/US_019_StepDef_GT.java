package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.JSUtils;

public class US_019_StepDef_GT {
    HomePage homePage=new HomePage();
    @Then("user verifies that sell-share-trade button is clickable at the footer part")
    public void userVerifiesThatSellShareTradeButtonIsClickableAtTheFooterPart() {
        JSUtils.scrollDownByJS();
        BrowserUtilities.waitFor(1);
        Assert.assertTrue(homePage.link_sellShareTrade.isDisplayed());
        Assert.assertTrue(homePage.link_sellShareTrade.isEnabled());
    }

    @When("user clicks on sell-share-trade button then verifies that relevant page opened")
    public void userClicksOnSellShareTradeButtonThenVerifiesThatRelevantPageOpened() {
        BrowserUtilities.masterClick(homePage.link_sellShareTrade);
        BrowserUtilities.waitFor(2);
        String expectedUrl="https://test.urbanicfarm.com/explore";
        Assert.assertTrue(Driver.getDriver( "https://test.urbanicfarm.com/" ).getCurrentUrl().contains(expectedUrl));

    }
}

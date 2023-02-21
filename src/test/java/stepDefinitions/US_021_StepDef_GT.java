package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.JSUtils;

public class US_021_StepDef_GT {
    HomePage homePage=new HomePage();
    @Then("user verifies that Contact Us link is clickable at the footer part")
    public void userVerifiesThatContactUsLinkIsClickableAtTheFooterPart() {
        JSUtils.scrollDownByJS();
        BrowserUtilities.waitFor(1);
        Assert.assertTrue(homePage.link_contactUsFooter.isDisplayed());
        Assert.assertTrue(homePage.link_contactUsFooter.isEnabled());

    }

    @When("user clicks on Contact Us link then verifies that relevant page opened")
    public void userClicksOnContactUsLinkThenVerifiesThatRelevantPageOpened() {
        BrowserUtilities.masterClick(homePage.link_contactUsFooter);
        BrowserUtilities.waitFor(2);
        String expectedUrl="https://test.urbanicfarm.com/contact-us";
        Assert.assertTrue(Driver.getDriver( "https://test.urbanicfarm.com/" ).getCurrentUrl().contains(expectedUrl));
    }
}

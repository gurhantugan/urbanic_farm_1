package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;

public class US_002_StepDef_AsK {

    HomePage homePage = new HomePage();

    @Then("{string} logo should be visible on the web site")
    public void logoShouldBeVisibleOnTheWebSite(String arg0) {
        Assert.assertTrue(homePage.logo_urbanicFarm.isDisplayed());
    }


    @When("Homepage should contain the following links")
    public void homepageShouldContainTheFollowingLinks() {
        Assert.assertTrue( homePage.link_aboutUs.isDisplayed());
        Assert.assertTrue( homePage.link_contactUs.isDisplayed());
        Assert.assertTrue( homePage.button_login.isDisplayed());
        Assert.assertTrue( homePage.button_register.isDisplayed());
        Assert.assertTrue( homePage.link_SupportTheLocalFoodMovement.isDisplayed());
        Assert.assertTrue( homePage.link_blog.isDisplayed());
        Assert.assertTrue( homePage.link_explore.isDisplayed());
    }
}

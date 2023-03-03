package stepDefinitions.UI;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

import static utilities.BrowserUtilities.clickWithJS;

public class US_016_StepDef_AK<String> {
    HomePage homePage = new HomePage();

    @When("user clicks the blog button")
    public void userClicksTheBlogButton() {
        BrowserUtilities.scrollToElement(homePage.buttonFooterBlog);
              clickWithJS(homePage.buttonFooterBlog);
        //homePage.buttonFooterBlog.click();
    }
    @Then("user verifies that the urbanicfarm.com blog is visible.")
    public void userVerifiesThatTheHttpsUrbanicfarmComBlogIsVisible() {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
        Driver.closeDriver();
    }

    //@Then("user verifies that the {string} is visible.")
    //public void userVerifiesThatTheIsVisible(String url) {
    //    BrowserUtilities.waitFor(3);
    //    Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(url));
    //    Driver.closeDriver();

}

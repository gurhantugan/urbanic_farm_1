package stepDefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;


public class US_003_StepDef_GB {
    HomePage homePage = new HomePage();

       @When("The user clicks on Blog button")
    public void theUserClicksOnBlogButton() {
        BrowserUtilities.waitFor(3);
        homePage.button_blog.click();
        BrowserUtilities.switchToWindowWithIndex(1);
    }
}
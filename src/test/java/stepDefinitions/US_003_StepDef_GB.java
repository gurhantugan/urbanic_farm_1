package stepDefinitions;

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
    public void the_user_clicks_on_blog_button() throws InterruptedException {
        BrowserUtilities.waitFor(3);
        homePage.button_blog.click();

    }
}
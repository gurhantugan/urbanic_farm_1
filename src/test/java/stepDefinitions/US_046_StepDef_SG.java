package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_046_StepDef_SG {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @When("User clicks the login link")
    public void user_clicks_the_login_link() {
        homePage.button_login.click();
        
    }

    @Then("User enters valid email address")
    public void user_enters_valid_email_address() {
        loginPage.textbox_email.sendKeys(ConfigurationReader.getProperty("buyerEmail"));
    }

    @Then("User enters valid password")
    public void user_enters_valid_password() {
        loginPage.textbox_password.sendKeys((ConfigurationReader.getProperty("buyerPassword")));
    }

    @Then("User clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.button_login.click();
        BrowserUtilities.waitFor(3);
        
    }

    @Then("User checks the cart button is clickable")
    public void user_checks_the_cart_button_is_clickable() {
        loginPage.button_cart.isEnabled();
        
    }

    @Then("User clicks the cart button")
    public void user_clicks_the_cart_button() {
        loginPage.button_cart.click();
        
    }

    @Then("Cart page opens")
    public void cart_page_opens() {
        String actualUrl = "https://test.urbanicfarm.com/basket";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        
    }

}

package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;

public class US_043_StepDef_HA {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user enters {string} in Email field on Login Page")
    public void userEntersInEmailFieldOnLoginPage(String arg0) {
        loginPage.button_emailOnLoginPage.sendKeys("huseyinaka01@gmail.com");
    }

    @And("user enters {string} in Password field on login Page")
    public void userEntersInPasswordFieldOnLoginPage(String arg0) {
        loginPage.button_passwordOnLoginPage.sendKeys("Apply1453#");
    }

    @Given("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.button_login.click();
    }

    @When("user clicks on sale-share-trade button")
    public void user_clicks_on_sale_share_trade_button() {
        BrowserUtilities.waitFor(3);
        homePage.link_sellShareTrade.click();
        BrowserUtilities.waitFor(3);
    }
}

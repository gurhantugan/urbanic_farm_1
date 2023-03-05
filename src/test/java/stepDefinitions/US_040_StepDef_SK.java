package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_040_StepDef_SK extends HomePage {

    @Given("user is on the Sale Pay Trade Page")
    public void user_is_on_the_sale_pay_trade_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        LoginPage lg=new LoginPage();
        loginButton.click();
        box_email.sendKeys(ConfigurationReader.getProperty("sellerEmail2"));
        box_password.sendKeys(ConfigurationReader.getProperty("sellerPassword2"));



        //buttonn_login.click();

        //  https://test.urbanicfarm.com/contact-us

    }
    @Then("user should be able to click Contact Us button")
    public void user_should_be_able_to_click_contact_us_button() {
        button_ContactUs.click();

    }
    @Then("relevant page should be seen")
    public void relevant_page_should_be_seen() {
        Assert.assertEquals("https://test.urbanicfarm.com/contact-us",Driver.getDriver().getCurrentUrl());

    }

}

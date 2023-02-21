package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US_036_StepDef_AK {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Then("User verifies that the mail text box is clickable")
    public void userVerifiesThatTheMailTextBoxIsClickable() {
        assertTrue(loginPage.textbox_email.isEnabled());
    }
    @Given("User enters values {string} in the email text box and {string} in the password text box")
    public void userEntersValuesInTheEmailTextBoxAndInThePasswordTextBox(String invalidEmail, String invalidPassword) {
        loginPage.textbox_email.sendKeys(invalidEmail);
        loginPage.textbox_password.sendKeys(invalidPassword);
    }
    @Then("User verifies unable to login with {string}")
    public void userVerifiesUnableToLoginWith(String expectedValue) {
        BrowserUtilities.waitFor(2);
        loginPage.button_forgotPassword.click();
        BrowserUtilities.waitFor(2);
        assertTrue(loginPage.message_pleaseVerifyYourEmail.isDisplayed());
        BrowserUtilities.waitFor(10);
        Driver.closeDriver();
    }
    @Then("Verifies that the user password text box is clickable")
    public void verifiesThatTheUserPasswordTextBoxIsClickable() {
        assertTrue(loginPage.button_passwordOnLoginPage.isEnabled());
    }

}




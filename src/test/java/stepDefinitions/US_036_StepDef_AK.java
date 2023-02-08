package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import pages.LoginPage;
import utilities.BrowserUtilities;

public class US_036_StepDef_AK {
    LoginPage loginPage = new LoginPage();

    @When("user clicks login button")
    public void userClicksLoginButton() {
        BrowserUtilities.waitForVisibility(loginPage.buttonLogin,20);
        BrowserUtilities.clickWithJS(loginPage.buttonLogin);

    }

    @Then("User verifies that the mail text box is clickable")
    public void userVerifiesThatTheMailTextBoxIsClickable() {
        assertTrue(loginPage.emailBox.isEnabled());
    }

    @Then("Verifies that the user password text box is clickable")
    public void verifiesThatTheUserPasswordTextBoxIsClickable() {
        assertTrue(loginPage.passwordBox.isEnabled());
    }

    @Given("User enters values {string} in the email text box and {string} in the password text box")
    public void userEntersValuesInTheEmailTextBoxAndInThePasswordTextBox(String invalidEmail, String invaildPassword) {
        loginPage.emailBox.sendKeys(invalidEmail);
        loginPage.passwordBox.sendKeys(invaildPassword);
    }
    @Then("User verifies unable to login with {string}")
    public void userVerifiesUnableToLoginWith(String expectedValue) {
        BrowserUtilities.waitFor(2);
        loginPage.forgotPasswordText.click();
        BrowserUtilities.waitFor(2);
        assertTrue(loginPage.pleaseText.isDisplayed());
    }
}

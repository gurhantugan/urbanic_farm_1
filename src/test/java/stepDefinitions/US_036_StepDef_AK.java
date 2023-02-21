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

    @When("user clicks login button")
    public void userClicksLoginButton() {
        BrowserUtilities.waitForVisibility(homePage.button_login,5);
        BrowserUtilities.clickWithJS(homePage.button_login);

 LoginPage loginPage = new LoginPage();
/*
     @Then("Verifies that the user password text box is clickable")
    public void verifiesThatTheUserPasswordTextBoxIsClickable() {

        assertTrue(loginPage.textbox_password.isEnabled());
    }

    @Given("User enters values {string} in the email text box and {string} in the password text box")
    public void userEntersValuesInTheEmailTextBoxAndInThePasswordTextBox(String invalidEmail, String invaildPassword) {
        loginPage.textbox_email.sendKeys(invalidEmail);

        loginPage.textbox_password.sendKeys(invaildPassword);
    }

        loginPage.button_passwordOnLoginPage.sendKeys(invaildPassword);
   }
   
    @Then("User verifies unable to login with {string}")
    public void userVerifiesUnableToLoginWith(String expectedValue) {
        BrowserUtilities.waitFor(2);
        loginPage.button_forgotPassword.click();
        BrowserUtilities.waitFor(2);

        assertTrue(loginPage.message_pleaseVerifyYourEmail.isDisplayed());
        Driver.closeDriver();
        */
    }

}

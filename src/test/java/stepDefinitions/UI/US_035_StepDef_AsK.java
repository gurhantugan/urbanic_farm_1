package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;

public class US_035_StepDef_AsK {

    LoginPage loginPage= new LoginPage();
    HomePage homePage = new HomePage();
    @Then("user verifies email address button is visible")
    public void userVerifiesEmailAddressButtonIsVisible() {

        loginPage.textbox_email.isDisplayed();
    }

    @And("user verifies password button is visible")
    public void userVerifiesPasswordButtonIsVisible() {

        loginPage.textbox_password.isDisplayed();
    }

    @When("user enter valid email and password")
    public void userEnterValidEmailAndPassword() {

        loginPage.textbox_email.sendKeys( "yusufberber@gmail.com");
        loginPage.textbox_password.sendKeys( "1619Yusufberber" );
        BrowserUtilities.waitFor( 2 );
    }


    @Then("user clicks login button")
    public void userClicksLoginButton() {

        homePage.button_login.click();

        BrowserUtilities.waitFor( 2);
    }

    @And("user should be able to verify to login successfully")
    public void userShouldBeAbleToVerifyToLoginSuccessfully() {

        loginPage.button_beFirst.isDisplayed();


    }
}

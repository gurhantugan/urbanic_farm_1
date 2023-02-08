package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;

import static utilities.BrowserUtilities.*;

import utilities.Driver;

import static utilities.BrowserUtilities.clickWithJS;

public class US_025_StepDepf_AK {
    HomePage homePage = new HomePage();

    @Then("user verifies that the f button is visible.")
    public void userVerifiesThatTheFButtonIsVisible() {
        java.lang.String expectedPhoneNumber = "+1 (669) 696-5906";
        java.lang.String actualPhoneNumber = homePage.phoneNumber.getText();
        System.out.println("actualPhoneNumber = " + actualPhoneNumber + "-------" + expectedPhoneNumber);
        assertEquals(actualPhoneNumber, expectedPhoneNumber);

        Driver.closeDriver();
    }
}

package stepDefinitions.UI;

import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

import pages.HomePage;

import utilities.Driver;

public class US_025_StepDef_AK {
    HomePage homePage = new HomePage();

    @Then("user verifies that the f button is visible.")
    public void userVerifiesThatTheFButtonIsVisible() {
        String expectedPhoneNumber = "+1 (669) 696-5906";
        String actualPhoneNumber = homePage.phoneNumber.getText();
        System.out.println("actualPhoneNumber = " + actualPhoneNumber + "-------" + expectedPhoneNumber);
        assertEquals(actualPhoneNumber, expectedPhoneNumber);

        Driver.closeDriver();
    }
}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;

public class US_060_StepDef_AO {
    HomePage homePage = new HomePage();

    @And("user clicks on cristian button")
    public void userClicksOnCristianButton() {
        homePage.cristian_button.click();
    }

    @And("user clicks on Your products and services button")
    public void userClicksOnYourProductsAndServicesButton() {
        homePage.yourProductServices_button.click();
    }

    @Given("user is on Your products and services page")
    public void userIsOnYourProductsAndServicesPage() {
        Assert.assertTrue(homePage.ADD_button.isDisplayed());
        homePage.ADD_button.click();
    }

    @Then("Go back button should be clickable")
    public void goBackButtonShouldBeClickable() {
    Assert.assertTrue(homePage.goBack_button.isDisplayed());
        BrowserUtilities.waitFor(2);
    }

    @When("user clicks on go back button")
    public void userClicksOnGoBackButton() {
        homePage.button_logout.click();
    }

    @Then("user should be on the previous page")
    public void userShouldBeOnThePreviousPage() {
        Assert.assertTrue(homePage.ADD_button.isDisplayed());
    }

}

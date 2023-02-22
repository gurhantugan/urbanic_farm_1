package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeliveryPickUpSettingsPage;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;


public class US_054_StepDef_AsK{

    HomePage homePage = new HomePage();
    DeliveryPickUpSettingsPage deliveryPickUpSettingsPage=new DeliveryPickUpSettingsPage();


    @And("user click buyer name button and click")
    public void userClickBuyerNameButtonAndClick() {

        homePage.button_account.click();
    }

    @And("user click delivery and pick up setting")
    public void userClickDeliveryAndPickUpSetting() {

        deliveryPickUpSettingsPage.button_deliveryAndPickUp.click();
    }

    @Then("user picks up on the vine checkbox should be clickable")
    public void user_picks_up_on_the_vine_checkbox_should_be_clickable() {
        Assert.assertTrue(deliveryPickUpSettingsPage.button_buyerPickUpOnTheVine.isSelected());

    }

    @When("user while clicking picks up on the vine checkbox should show {string} menu functional and visible")
    public void user_while_clicking_picks_up_on_the_vine_checkbox_should_show_menu_functional_and_visible(String string) {

        Assert.assertTrue(deliveryPickUpSettingsPage.button_yourAvailableHours.isEnabled());
        Assert.assertTrue(deliveryPickUpSettingsPage.button_yourAvailableHours.isDisplayed());

        deliveryPickUpSettingsPage.button_yourAvailableHours.isEnabled();
        deliveryPickUpSettingsPage.button_yourAvailableHours.isEnabled();

    }


    @When("user chose same hours and click update button")
    public void userChoseSameHoursAndClickUpdateButton() {
        deliveryPickUpSettingsPage.startTime.sendKeys( "17:00" );
        deliveryPickUpSettingsPage.endTime.sendKeys( "17:00" );
        deliveryPickUpSettingsPage.button_update.click();

    }

    @Then("{string} alert massage should be visible")
    public void alertMassageShouldBeVisible(String expectedMessage) {

        BrowserUtilities.waitFor( 3 );
        String actualMessage = deliveryPickUpSettingsPage.validationMessage.getText();
        Assert.assertEquals( expectedMessage,actualMessage );




    }

    @When("Your available hours is selected and click update button")
    public void yourAvailableHoursIsSelectedAndClickUpdateButton() {
        BrowserUtilities.waitFor( 2 );
        deliveryPickUpSettingsPage.startTime.sendKeys( "12:00" );
        deliveryPickUpSettingsPage.endTime.sendKeys( "17:00" );
        deliveryPickUpSettingsPage.button_update.click();

    }

    @Then("{string} alert message should be visible")
    public void alertMessageShouldBeVisible(String expectedAlert) {

        String actualAlert= deliveryPickUpSettingsPage.validationAlert.getText();
        Assert.assertEquals( expectedAlert,actualAlert );

    }

    @When("user navigates to homepage")
    public void userNavigatesToHomepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
    }
}

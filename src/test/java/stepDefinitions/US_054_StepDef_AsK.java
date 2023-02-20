package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeliveryPickUpSettingsPage;
import pages.HomePage;

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
        deliveryPickUpSettingsPage.button_buyerPickUpOnTheVine.isSelected();

    }

    @When("user while clicking picks up on the vine checkbox should show {string} menu functional and visible")
    public void user_while_clicking_picks_up_on_the_vine_checkbox_should_show_menu_functional_and_visible(String string) {
        deliveryPickUpSettingsPage.button_yourAvailableHours.isEnabled();
        deliveryPickUpSettingsPage.button_yourAvailableHours.isDisplayed();
    }


    @When("user chose same hours and click update button")
    public void userChoseSameHoursAndClickUpdateButton() {
    }

    @Then("{string} alert massage should be visible")
    public void alertMassageShouldBeVisible(String arg0) {
    }

    @When("Your available hours is selected and click update button")
    public void yourAvailableHoursIsSelectedAndClickUpdateButton() {
    }

    @Then("{string} alert message should be visible")
    public void alertMessageShouldBeVisible(String arg0) {
    }
}

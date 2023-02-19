package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeliveryPickUpSettingsPage;
import pages.HomePage;

public class US_054_StepDef_AsK{
    HomePage homePage = new HomePage();
DeliveryPickUpSettingsPage deliveryPickUpSettingsPage=new DeliveryPickUpSettingsPage();


    @And("user click {string} button and click")
    public void userClickButtonAndClick(String Mustafa) {
        homePage.button_account.click();
    }


//    @When("user picks up on the vine")
//    public void user_picks_up_on_the_vine() {
//       //deliveryPickUpSettingsPage.button_deliveryAndPickUp.submit();
//
//    }

    @Then("user picks up on the vine checkbox should be clickable")
    public void user_picks_up_on_the_vine_checkbox_should_be_clickable() {
        deliveryPickUpSettingsPage.button_buyerPickUpOnTheVine.isSelected();

    }

    @When("user while clicking picks up on the vine checkbox should show {string} menu functional and visible")
    public void user_while_clicking_picks_up_on_the_vine_checkbox_should_show_menu_functional_and_visible(String string) {

    }

    @When("user chose same hours \"Start time cannot be greater than end time at the Buyer picks up on the vine field.\"massage")
    public void user_chose_same_hours_start_time_cannot_be_greater_than_end_time_at_the_buyer_picks_up_on_the_vine_field_massage() {

    }

    @Then("Your available hours is clicked, suitable hours should be selected from the menu")
    public void your_available_hours_is_clicked_suitable_hours_should_be_selected_from_the_menu() {

    }


    @When("user chose same hours and click update button, {string}massage")
    public void userChoseSameHoursAndClickUpdateButtonMassage(String arg0) {
    }

    @Then("Your available hours is clicked and update button, suitable hours should be selected from the menu")
    public void yourAvailableHoursIsClickedAndUpdateButtonSuitableHoursShouldBeSelectedFromTheMenu() {
    }

    @Then("Your available hours is clicked and update button, {string} alert should be selected from the menu")
    public void yourAvailableHoursIsClickedAndUpdateButtonAlertShouldBeSelectedFromTheMenu(String arg0) {
    }
}

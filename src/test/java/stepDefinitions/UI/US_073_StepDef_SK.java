package stepDefinitions.UI;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyEventsPage;
import utilities.BrowserUtilities;

public class US_073_StepDef_SK extends MyEventsPage {


    @When("user should able to add an address by clicking add button on create event page")
    public void userShouldAbleToAddAnAddressByClickingAddButtonOnCreateEventPage() {

        BrowserUtilities.clickWithJS(button_Create_newEvents);


    }

    @Then("user should provide Title for the event")
    public void userShouldProvideTitleForTheEvent() {

        BrowserUtilities.clearAndSend(box_Title,"Blabla");

    }

    @Then("user should provide address for the event")
    public void userShouldProvideAddressForTheEvent() {

        BrowserUtilities.clickWithJS(button_addAddress);
    }

    @Then("user should type or select the city for the event")
    public void userShouldTypeOrSelectTheCityForTheEvent() {
    }

    @Then("user should type or select the state for the event")
    public void userShouldTypeOrSelectTheStateForTheEvent() {
    }

    @Then("user should provide Zip code for the event")
    public void userShouldProvideZipCodeForTheEvent() {
    }

    @Then("user should able to add an address by clicking {string} button and see successful message {string}")
    public void userShouldAbleToAddAnAddressByClickingButtonAndSeeSuccessfulMessage(String arg0, String arg1) {
    }
}
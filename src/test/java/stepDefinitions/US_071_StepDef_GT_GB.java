package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import pages.MyEventsPage;
import utilities.BrowserUtilities;

public class US_071_StepDef_GT_GB {

    MyEventsPage myEventsPage = new MyEventsPage();

    Faker faker = new Faker();
    String eventTitle;
    String addressTitle;
    String newAddress;

    @Test
    public void test(){
        eventTitle = faker.food().fruit();
        System.out.println("eventTitle = " + eventTitle);
        newAddress = faker.address().zipCodeByState(faker.address().stateAbbr());
        System.out.println("newAddress = " + newAddress);
    }

    @And("user adds a title for the event")
    public void userAddsATitleForTheEvent() {
        eventTitle = faker.food().fruit();
        System.out.println("eventTitle = " + eventTitle);
    myEventsPage.textBox_title.sendKeys(eventTitle);
    }


    @And("user adds an address for the event")
    public void userAddsAnAddressForTheEvent() {
    myEventsPage.button_addAddress.click();
        BrowserUtilities.waitFor(2);
    }

    @And("user enters new address for the event")
    public void userEntersNewAddressForTheEvent() {
    }

    @And("user enters valid event date")
    public void userEntersValidEventDate() {
    }

    @And("user enters a time for the event")
    public void userEntersATimeForTheEvent() {
    }

    @And("user enters fee for the event")
    public void userEntersFeeForTheEvent() {
    }

    @And("user enters duration of event")
    public void userEntersDurationOfEvent() {
    }

    @And("user enters attendee limit for the event")
    public void userEntersAttendeeLimitForTheEvent() {
    }

    @And("user optionally enters schedule for the event")
    public void userOptionallyEntersScheduleForTheEvent() {
    }

    @And("user optionally enters description for the event")
    public void userOptionallyEntersDescriptionForTheEvent() {
    }

    @And("user enters terms and conditions for the event")
    public void userEntersTermsAndConditionsForTheEvent() {
    }

    @When("user clicks {string} button event")
    public void userClicksButtonEvent(String arg0) {
    }

    @Then("user verifies {string} success message")
    public void userVerifiesSuccessMessage(String arg0) {
    }

    @When("user user click on events link")
    public void userUserClickOnEventsLink() {
    }

    @Then("user verifies created event with sign of NEW text is listed on events page")
    public void userVerifiesCreatedEventWithSignOfNEWTextIsListedOnEventsPage() {
    }


}

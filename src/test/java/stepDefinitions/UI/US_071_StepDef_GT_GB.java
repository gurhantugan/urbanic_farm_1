package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import pages.MyEventsPage;
import utilities.BrowserUtilities;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.postalCode;

public class US_071_StepDef_GT_GB {

    MyEventsPage myEventsPage = new MyEventsPage();

    Faker faker = new Faker();
    String eventTitle;
    String addressTitle;
    String newAddress;

    String postalCode;
    @Test
    public void test(){
        eventTitle = faker.food().fruit();
        System.out.println("eventTitle = " + eventTitle);
        newAddress = faker.address().zipCode();
        System.out.println("newAddress = " + newAddress);
        String time = BrowserUtilities.createTime(-6,1)+"AM";
        System.out.println("time = " + time);
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
        myEventsPage.textBox_addressTitle.sendKeys("Home");
        newAddress = faker.address().streetAddress();
        myEventsPage.textBox_address.sendKeys(newAddress);
        String states = faker.address().state();
        myEventsPage.dropDown_states.sendKeys(states);
        BrowserUtilities.waitFor(2);
        String city = faker.address().city();
        myEventsPage.dropDown_cities.sendKeys(city);
        BrowserUtilities.waitFor(2);
        postalCode= faker.address().zipCode();
        myEventsPage.textBox_postal.sendKeys(postalCode);
        myEventsPage.button_addressSubmit.click();
        BrowserUtilities.waitFor(3);
    }

    @And("user enters valid event date")
    public void userEntersValidEventDate() {
        String validDate = BrowserUtilities.createDate2(00,15,0);
        System.out.println("validDate = " + validDate);
        myEventsPage.textBox_date.sendKeys(validDate);
        BrowserUtilities.waitFor(3);
    }

    @And("user enters a time for the event")
    public void userEntersATimeForTheEvent() {
        String time = BrowserUtilities.createTime(12,1)+"PM";
        System.out.println("time = " + time);
        myEventsPage.textBox_time.sendKeys(time);
        BrowserUtilities.waitFor(3);
    }

    @And("user enters fee for the event")
    public void userEntersFeeForTheEvent() {
        String eventFee = String.valueOf(faker.number().numberBetween(1,1000));
        myEventsPage.textBox_fee.sendKeys(eventFee);
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

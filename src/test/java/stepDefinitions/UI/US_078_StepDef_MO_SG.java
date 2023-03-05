package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MyEventsPage;
import utilities.BrowserUtilities;

public class US_078_StepDef_MO_SG {


    MyEventsPage myEventsPage = new MyEventsPage();

    @When("user click on cancel and yes button")
    public void user_click_on_cancel_and_yes_button() {
        BrowserUtilities.wait(3);
        myEventsPage.button_cancel.click();
        BrowserUtilities.waitFor(3);
        myEventsPage.button_Yes_cancel.click();



    }

    @When("user should be able to sees {string} message")
    public void user_should_be_able_to_sees_message(String string) {

        myEventsPage.message_event_canceled.isDisplayed();


    }

    @When("user click on Mark as completed button")
    public void user_click_on_mark_as_completed_button() {
        BrowserUtilities.waitFor(3);
        myEventsPage.button_mark_as_completed.click();
    }

    @When("user should be able to see {string} message")
    public void user_should_be_able_to_see_message(String string) {
        myEventsPage.message_event_completed.isDisplayed();
    }

    @When("user click on copy link  button")
    public void user_click_on_copy_link_button() {
       BrowserUtilities.waitFor(5);
        myEventsPage.button_copy_link.click();
    }



    @And("user should be able to seeing  {string} message")
    public void userShouldBeAbleToSeeingMessage(String string) {
        myEventsPage.message_event_copied.isDisplayed();

    }

    @And("user verify the event has been cancelled")
    public void userVerifyTheEventHasBeenCancelled() {
        myEventsPage.message_canceled.isDisplayed();

    }

    @And("user verify the event has been completed")
    public void userVerifyTheEventHasBeenCompleted() {
        myEventsPage.message_completed.isDisplayed();

    }


    @And("user click on My Completed Events button")
    public void userClickOnMyCompletedEventsButton() {
        myEventsPage.button_completed_events.click();
    }
}


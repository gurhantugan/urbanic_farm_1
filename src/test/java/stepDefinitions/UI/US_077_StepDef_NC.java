package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.MyEventsPage;
import utilities.BrowserUtilities;

public class US_077_StepDef_NC {

    MyEventsPage myEventsPage = new MyEventsPage();
    @When("user click on delete and yes button")
    public void userClickOnDeleteAndYesButton() {
        BrowserUtilities.wait(3);
        myEventsPage.button_delete.click();
        BrowserUtilities.wait(3);
        myEventsPage.button_Yes_cancel.click();
    }


    @And("user should be able to seesing {string} message")
    public void userShouldBeAbleToSeesingMessage(String str) {
        myEventsPage.message_event_deleted.isDisplayed();
    }
}

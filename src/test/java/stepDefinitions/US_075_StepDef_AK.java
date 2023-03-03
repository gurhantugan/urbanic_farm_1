package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.EventsPage;

public class US_075_StepDef_AK {

    EventsPage eventsPage = new EventsPage();
    @When("user clicks Events the checkbox")
    public void userClicksEventsTheCheckbox() {
        eventsPage.button_events.click();

    }

    @And("user participates in any of the events")
    public void userParticipatesInAnyOfTheEvents() {
        for (int i = 0; i <16 ; i++) {
            eventsPage.button_register.get(i).click();

            if(eventsPage.)

        }

    }
}

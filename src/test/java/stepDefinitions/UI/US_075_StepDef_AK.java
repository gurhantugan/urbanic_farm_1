package stepDefinitions.UI;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;

import pages.EventsPage;
import utilities.BrowserUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static stepDefinitions.UI.Hooks.driver;

public class US_075_StepDef_AK {

    EventsPage eventsPage = new EventsPage();

    @When("user participates in any of the events")
    public void userParticipatesInAnyOfTheEvents() {
       //List<WebElement> eleman = new ArrayList<>(eventsPage.button_register);
        Random rand = new Random();
        List<WebElement> eleman = eventsPage.button_register;
        int sek = rand.nextInt(eleman.size());
        System.out.println("sek = " + sek);
        WebElement sEleman = eleman.remove(sek);
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(eleman.get(sek));

    }
    @And("A user fills in the {string} of participants")
    public void aUserFillsInTheOfParticipants(String number) {
        eventsPage.box_number.clear();
        eventsPage.box_number.sendKeys(number);
    }

    @And("the user checks the terms and conditions box")
    public void theUserChecksTheTermsAndConditionsBox() {
        eventsPage.box_terms.click();
    }

    @And("user clicks confirmation button")
    public void userClicksConfirmationButton() {
        eventsPage.button_approve.click();
    }
}


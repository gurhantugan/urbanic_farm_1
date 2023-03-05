package stepDefinitions.UI;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;

import pages.EventsPage;
import utilities.BrowserUtilities;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;



public class US_075_StepDef_AK {

    EventsPage eventsPage = new EventsPage();
    Random rand = new Random();
    int sek;

    @When("user participates in any of the events")
    public void userParticipatesInAnyOfTheEvents() {

        List<WebElement> eleman = new ArrayList<>(eventsPage.button_register);
        //List<Integer> index = new ArrayList<>();

       sek = rand.nextInt(eleman.size());
      BrowserUtilities.clickWithJS(eleman.get(sek));

//
//
//        BrowserUtilities.clickWithJS(eleman.get(sek + 1));

        // List<WebElement> eleman = eventsPage.button_register;


        /*
        int[] sek = new int[eleman.size()];

        for (int i = 0; i < sek.length; i++) {

            do {

                sek[i] = rand.nextInt(eleman.size());
            } while (sek.equals(sek[i]));
        }
        for (int i = 0; i < sek.length; i++) {
            System.out.println("sek = " + sek[i]);
        }
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(eleman.get(sek));


         */

        /*
        List<WebElement> eleman = eventsPage.button_register;
int[] sek = new int[eleman.size()];
for (int i = 0; i < sek.length; i++) {
    do {
        sek[i] = rand.nextInt(eleman.size());
    } while (Arrays.asList(sek).subList(0, i).contains(sek[i]));
}
for (int i = 0; i < sek.length; i++) {
    System.out.println("sek[" + i + "] = " + sek[i]);
}
BrowserUtilities.waitFor(3);
BrowserUtilities.clickWithJS(eleman.get(sek[0]));
         */

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


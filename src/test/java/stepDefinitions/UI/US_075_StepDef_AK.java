package stepDefinitions.UI;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.EventsPage;
import pages.MyEventsPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

import static org.openqa.selenium.devtools.v103.runtime.model.ConsoleAPICalled.Type.TABLE;

public class US_075_StepDef_AK {

    EventsPage eventsPage = new EventsPage();
    MyEventsPage myEventsPage = new MyEventsPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user goes to {string} page after login.")
    public void userGoesToPageAfterLogin(String endPoint) {
        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenMyEven"), endPoint);
        BrowserUtilities.waitFor(2);
    }

    @And("user writes the required data to the boxes with followings")
    public void userWritesTheRequiredDataToTheBoxesWithFollowings(DataTable dataTable) {

        BrowserUtilities.clearAndSend(myEventsPage.box_title,dataTable.column(0).get(1));
        Select select = new Select(myEventsPage.box_Address);
        select.selectByIndex(Integer.parseInt(dataTable.column(1).get(1)));
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clearAndSend(myEventsPage.box_Date,dataTable.column(2).get(1));
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clearAndSend(myEventsPage.box_time,dataTable.column(3).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_duration,dataTable.column(4).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_attendeeLimit,dataTable.column(5).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_TermsAndConditions,dataTable.column(6).get(1));
        BrowserUtilities.waitFor(2);
        JSUtils.clickElementByJS(myEventsPage.button_Submit);
        BrowserUtilities.waitFor(3);
    }
//    @And("user creates the event by filling in the required fields to create the event")
//    public void userCreatesTheEventByFillingInTheRequiredFieldsToCreateTheEvent() {
//        myEventsPage.box_title.sendKeys("mahsul");
//        BrowserUtilities.waitFor(3);
//
//       actions.moveToElement(myEventsPage.box_Address).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
//                .sendKeys("30").sendKeys(Keys.TAB).sendKeys("12").sendKeys(Keys.TAB).sendKeys("2023")
//                .sendKeys(Keys.TAB).sendKeys("17").sendKeys(Keys.TAB).sendKeys("00").sendKeys(Keys.TAB)
//                .sendKeys(Keys.TAB).sendKeys("120").sendKeys(Keys.TAB).sendKeys("40").sendKeys(Keys.TAB)
//                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("misir , bugday").sendKeys(Keys.TAB)
//                .sendKeys(Keys.TAB).perform();
//        myEventsPage.button_submit.click();
//    }
    @Given("user goes to {string} pageafter login")
    public void userGoesToPageafterLogin(String endPoint) {
        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenEven"), endPoint);
        BrowserUtilities.waitFor(2);
        BrowserUtilities.waitForVisibility(eventsPage.button_regesterMhsl,20);
        eventsPage.button_regesterMhsl.click();

    }
    @And("A user fills in the {string} of participants")
    public void aUserFillsInTheOfParticipants(String number) {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clearText(eventsPage.box_number);
        eventsPage.box_number.sendKeys(number);
    }

    @And("the user checks the terms and conditions box")
    public void theUserChecksTheTermsAndConditionsBox() {
        BrowserUtilities.waitFor(2);
        eventsPage.box_terms.click();
    }

    @And("user clicks confirmation button")
    public void userClicksConfirmationButton() {
        BrowserUtilities.waitFor(2);
        eventsPage.button_approve.click();
    }

    @Then("Verifies that the user confirmation button is clickable")
    public void verifiesThatTheUserConfirmationButtonIsClickable() {
        BrowserUtilities.waitForVisibility(eventsPage.button_approve, 20);
        Assert.assertTrue(eventsPage.button_approve.isEnabled());
    }

    @Then("user confirms activity is registered")
    public void userConfirmsActivityIsRegistered() {
        String expectedMesage = "You've already registered to this event";
        String actualMesage = eventsPage.approve_mesage.getText();

        Assert.assertEquals("mesaj eslesmedi" + actualMesage, expectedMesage);
    }

    @Given("The user deletes the record he entered.")
    public void theUserDeletesTheRecordHeEntered() {
        BrowserUtilities.waitFor(1);
        eventsPage.button_delete.click();
        BrowserUtilities.waitFor(1);
        eventsPage.button_yes.click();

    }

    @Given("user goes to {string} pageafterlogin.")
    public void userGoesToPageafterlogin(String endPoint) {
        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenMyEven"), endPoint);
        BrowserUtilities.waitFor(2);
    }




    //    @When("user participates in any of the events")
//    public void userParticipatesInAnyOfTheEvents() {
//        List<WebElement> eleman = new ArrayList<>(eventsPage.button_register);
//       sek = rand.nextInt(eleman.size());
//      BrowserUtilities.clickWithJS(eleman.get(sek));
//}


}
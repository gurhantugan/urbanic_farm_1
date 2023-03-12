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

import java.util.Objects;
import java.util.Random;

import static org.openqa.selenium.devtools.v103.runtime.model.ConsoleAPICalled.Type.TABLE;

public class US_075_StepDef_AK {

    EventsPage eventsPage = new EventsPage();
    MyEventsPage myEventsPage = new MyEventsPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user goes to {string} page after login.")
    public void userGoesToPageAfterLogin(String endPoint) {
        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenMyEven"), endPoint);
        BrowserUtilities.waitFor(1);
    }

    @And("user writes the required data to the boxes with followings")
    public void userWritesTheRequiredDataToTheBoxesWithFollowings(DataTable dataTable) {
        BrowserUtilities.waitForVisibility(myEventsPage.box_Title, 20);
        BrowserUtilities.clearAndSend(myEventsPage.box_title, dataTable.column(0).get(1));
        Select select = new Select(myEventsPage.box_Address);
        select.selectByIndex(Integer.parseInt(dataTable.column(1).get(1)));
        BrowserUtilities.clearAndSend(myEventsPage.box_Date, dataTable.column(2).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_time, dataTable.column(3).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_duration, dataTable.column(4).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_attendeeLimit, dataTable.column(5).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_TermsAndConditions, dataTable.column(6).get(1));
        BrowserUtilities.waitFor(2);
//        myEventsPage.box_Date.sendKeys("08.12.2023");
//        BrowserUtilities.waitFor(2);
        JSUtils.clickElementByJS(myEventsPage.button_Submit);
        BrowserUtilities.waitFor(1);
    }

    @Given("user goes to {string} pageafter login")
    public void userGoesToPageafterLogin(String endPoint) {
        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenEven"), endPoint);

        for (int i = 0; i < eventsPage.button_text.size(); i++) {

            if (eventsPage.button_text.get(i).getText().equals("mahsul")) {
                BrowserUtilities.waitFor(1);
                BrowserUtilities.clickWithJS(eventsPage.button_register.get(i));
                break;
            }

        }

    }

    @And("A user fills in the {string} of participants")
    public void aUserFillsInTheOfParticipants(String number) {
        BrowserUtilities.waitFor(1);
        BrowserUtilities.clearText(eventsPage.box_number);
        eventsPage.box_number.sendKeys(number);
    }

    @And("the user checks the terms and conditions box")
    public void theUserChecksTheTermsAndConditionsBox() {
        BrowserUtilities.waitFor(1);
        eventsPage.box_terms.click();
    }

    @And("user clicks confirmation button")
    public void userClicksConfirmationButton() {
        BrowserUtilities.clickWithJS(eventsPage.button_approve);
        BrowserUtilities.waitFor(1);
    }

    @Then("user confirms activity is registered")
    public void userConfirmsActivityIsRegistered() {
        String expectedMesage = "You have now registered to this event";
        String actualMesage = eventsPage.approve_mesage.getText();
        BrowserUtilities.waitForVisibility(eventsPage.approve_mesage, 20);
        Assert.assertEquals(expectedMesage, actualMesage);
    }


    @Given("After logging in, the user visits the {string} page.")
    public void afterLoggingInTheUserVisitsThePage(String endPoint) {

        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenEven1"), endPoint);
        BrowserUtilities.waitFor(2);

        for (int i = 0; i < eventsPage.button_text.size(); i++) {

            if (eventsPage.button_text.get(i).getText().equals("mahsul")) {
                BrowserUtilities.waitFor(1);
                BrowserUtilities.clickWithJS(eventsPage.button_register.get(i));
                break;
            }

        }

    }


    @And("A user enters {string} as the number of participants.")
    public void aUserEntersAsTheNumberOfParticipants(String number) {
        BrowserUtilities.waitForVisibility(eventsPage.box_number, 20);
        BrowserUtilities.clearText(eventsPage.box_number);
        eventsPage.box_number.sendKeys(number);
    }

    @And("The user clicks the I agree button.")
    public void theUserClicksTheIAgreeButton() {

        BrowserUtilities.waitFor(1);
        eventsPage.box_terms.click();
    }

    @And("The user then presses the confirmation button.")
    public void theUserThenPressesTheConfirmationButton() {
        BrowserUtilities.clickWithJS(eventsPage.button_approve);
        BrowserUtilities.waitFor(1);
    }

    @And("User then confirms that the activity was registered.")
    public void userThenConfirmsThatTheActivityWasRegistered() {
        String expectedMesage = "You have now registered to this event";
        String actualMesage = eventsPage.approve_mesage.getText();
        BrowserUtilities.waitForVisibility(eventsPage.approve_mesage, 20);
        Assert.assertEquals( expectedMesage, actualMesage);
    }

    @Given("user goes to {string} pageafterlogin.")
    public void userGoesToPageafterlogin(String endPoint) {
        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenMyEven"), endPoint);
        BrowserUtilities.waitFor(2);
    }

    @Given("The user deletes the record he entered.")
    public void theUserDeletesTheRecordHeEntered() {
        BrowserUtilities.waitFor(1);
        eventsPage.button_delete.click();
        BrowserUtilities.waitFor(1);
        eventsPage.button_yes.click();
    }
}
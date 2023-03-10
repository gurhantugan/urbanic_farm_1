package stepDefinitions.UI;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MyEventsPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_073_StepDef_SK extends MyEventsPage {


    @When("user should able to add an address by clicking add button on create event page")
    public void userShouldAbleToAddAnAddressByClickingAddButtonOnCreateEventPage() {

        BrowserUtilities.clickWithJS(button_Create_newEvents);


    }

    @Then("user should provide Title for the event")
    public void userShouldProvideTitleForTheEvent() {

        BrowserUtilities.clearAndSend(box_Title,"Blabla");

        Select select=new Select(box_AdressFirst);
        select.selectByIndex(1);

        BrowserUtilities.clickWithJS(button_Add);

    }

    @Then("user should provide address for the event")
    public void userShouldProvideAddressForTheEvent() {
        BrowserUtilities.clearAndSend(box_addressTitle,"Seko");
        BrowserUtilities.clearAndSend(box_addressSecond,"Upper Bavaria");

        BrowserUtilities.clickWithJS(button_addAddress);
    }

    @Then("user should type or select the city for the event")
    public void userShouldTypeOrSelectTheCityForTheEvent() {
        BrowserUtilities.waitFor(2);
        //WebElement state=Driver.getDriver().findElement(By.xpath("//option[@value='Louisiana']"));
        BrowserUtilities.clearAndSend(box_states,"Louisiana");
        BrowserUtilities.clickWithJS(box_cities);

    }

    @Then("user should type or select the state for the event")
    public void userShouldTypeOrSelectTheStateForTheEvent() {
        BrowserUtilities.waitFor(2);

        //WebElement city=Driver.getDriver().findElement(By.xpath("//input[@value='Arabi']"));

        BrowserUtilities.clearAndSend(box_cities,"Arabi");





    }

    @Then("user should provide Zip code for the event")
    public void userShouldProvideZipCodeForTheEvent() {
        BrowserUtilities.clearAndSend(box_postal,"82395");
    }

    @Then("user should able to add an address by clicking button and see successful message")
    public void userShouldAbleToAddAnAddressByClickingButtonAndSeeSuccessfulMessage() {

        String alert="Address successfully added.";

        BrowserUtilities.clickWithJS(button_submit);
        BrowserUtilities.toastMessageAssertion("Address successfully added.");
    }
}
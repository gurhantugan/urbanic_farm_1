package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.MyEventsPage;
import utilities.BrowserUtilities;

import java.nio.charset.StandardCharsets;

public class US_074_StepDef_AsK extends MyEventsPage {
    @And("user should provide Title for the event and title should be at least two character")
    public void userShouldProvideTitleForTheEventAndTitleShouldBeAtLeastTwoCharacter() {
        Faker faker = new Faker();
        String title = faker.file().fileName().toUpperCase();
        BrowserUtilities.clearAndSend(box_Title,title);
        Select select=new Select(box_AdressFirst);
        select.selectByIndex(1);
        BrowserUtilities.clickWithJS(button_Add);
    }

    @And("user should provide address for the event and address should be at least ten character")
    public void userShouldProvideAddressForTheEventAndAddressShouldBeAtLeastTenCharacter() {
        BrowserUtilities.waitFor(5);
        BrowserUtilities.clearAndSend(box_addressTitle,"AA");
        BrowserUtilities.clearAndSend(box_addressSecond,"AAAAAAAAAA");
        BrowserUtilities.clickWithJS(button_addAddress);
    }

    @And("user should type or select the city for the event and city should be at least two character")
    public void userShouldTypeOrSelectTheCityForTheEventAndCityShouldBeAtLeastTwoCharacter() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clearAndSend(box_states,"AA");
        BrowserUtilities.clickWithJS(box_cities);
    }

    @And("user should type or select the state for the event and state should be at least two character")
    public void userShouldTypeOrSelectTheStateForTheEventAndStateShouldBeAtLeastTwoCharacter() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clearAndSend(box_cities,"Arabi");
    }

    @And("user should provide Zip code for the event and zip code should be five digits only")
    public void userShouldProvideZipCodeForTheEventAndZipCodeShouldBeFiveDigitsOnly() {
        BrowserUtilities.clearAndSend(box_postal,"82395");
    }

    @Then("user should able to cancel adding address by clicking Cancel button")
    public void userShouldAbleToCancelAddingAddressByClickingCancelButton() {
        BrowserUtilities.waitFor( 2 );
        BrowserUtilities.clickWithJS(button_cancel);
    }
}

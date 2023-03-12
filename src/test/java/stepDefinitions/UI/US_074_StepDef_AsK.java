package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.MyEventsPage;
import utilities.BrowserUtilities;

public class US_074_StepDef_AsK extends MyEventsPage {
    @And("user should provide Title for the event and title should be at least two character")
    public void userShouldProvideTitleForTheEventAndTitleShouldBeAtLeastTwoCharacter() {
        BrowserUtilities.clearAndSend(box_Title,"AA");
        Select select=new Select(box_AdressFirst);
        select.selectByIndex(1);
        BrowserUtilities.clickWithJS(button_Add);
    }

    @And("user should provide address for the event and address should be at least ten character")
    public void userShouldProvideAddressForTheEventAndAddressShouldBeAtLeastTenCharacter() {
        BrowserUtilities.clearAndSend(box_addressTitle,"Seko");
        BrowserUtilities.clearAndSend(box_addressSecond,"Upper Bavaria");

        BrowserUtilities.clickWithJS(button_addAddress);
    }

    @And("user should type or select the city for the event and city should be at least two character")
    public void userShouldTypeOrSelectTheCityForTheEventAndCityShouldBeAtLeastTwoCharacter() {
    }

    @And("user should type or select the state for the event and state should be at least two character")
    public void userShouldTypeOrSelectTheStateForTheEventAndStateShouldBeAtLeastTwoCharacter() {
    }

    @And("user should provide Zip code for the event and zip code should be five digits only")
    public void userShouldProvideZipCodeForTheEventAndZipCodeShouldBeFiveDigitsOnly() {
    }

    @Then("user should able to cancel adding address by clicking Cancel button")
    public void userShouldAbleToCancelAddingAddressByClickingCancelButton() {
    }
}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;

public class US_074_StepDef_AsK {
    @When("user should able to create an event by clicking {string} button on Event page")
    public void userShouldAbleToCreateAnEventByClickingButtonOnEventPage(String Events) {

    }

    @When("title should be at least two character and can not be blank if so user will see warning message {string}")
    public void titleShouldBeAtLeastTwoCharacterAndCanNotBeBlankIfSoUserWillSeeWarningMessage(String arg0) {
    }

    @And("address should be at least ten character and can not be blank if so user will see warning message {string}")
    public void addressShouldBeAtLeastTenCharacterAndCanNotBeBlankIfSoUserWillSeeWarningMessage(String arg0) {
    }

    @And("city should be at least two character or select from dropdown and can not be blank if so user will see warning message {string}")
    public void cityShouldBeAtLeastTwoCharacterOrSelectFromDropdownAndCanNotBeBlankIfSoUserWillSeeWarningMessage(String arg0) {
    }

    @Then("state should be at least two character or select from dropdown and can not be blank if so user will see warning message {string}")
    public void stateShouldBeAtLeastTwoCharacterOrSelectFromDropdownAndCanNotBeBlankIfSoUserWillSeeWarningMessage(String arg0) {
    }

    @And("zip code should be five digits only and can not be blank if so user will see warning message {string}")
    public void zipCodeShouldBeFiveDigitsOnlyAndCanNotBeBlankIfSoUserWillSeeWarningMessage(String arg0) {
    }

    @Then("user should able to cancel adding address by clicking Cancel button")
    public void userShouldAbleToCancelAddingAddressByClickingCancelButton() {
    }
}

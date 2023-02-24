package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DeliveryPickUpSettingsPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;

public class US_055_StepDef_GB {
  DeliveryPickUpSettingsPage deliveryPickUpSettingsPage= new DeliveryPickUpSettingsPage();
    @Then("user verifies all checkboxes are clickable")
    public void userVerifiesAllCheckboxesAreClickable() {
        BrowserUtilities.waitFor(3);
      for (int i = 0; i < deliveryPickUpSettingsPage.checkbox_all.size() ; i++) {
        deliveryPickUpSettingsPage.checkbox_all.get(i).click();
        BrowserUtilities.waitFor(1);
        deliveryPickUpSettingsPage.checkbox_all.get(i).click();
        BrowserUtilities.waitFor(1);
      }

    }
}
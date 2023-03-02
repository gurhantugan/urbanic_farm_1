package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DeliveryPickUpSettingsPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US_055_StepDef_GB {

    DeliveryPickUpSettingsPage deliveryPickUpSettingsPage = new DeliveryPickUpSettingsPage();

    @Then("user verifies all checkboxes are clickable")
    public void userVerifiesAllCheckboxesAreClickable() {
        BrowserUtilities.waitFor(3);
        List<String>CheckBoxList = new ArrayList<>();
        CheckBoxList.add("#BUYER_PICKUP_FROM_BRANCH");
        CheckBoxList.add("#BUYER_PICKUP");
        CheckBoxList.add("#SELLER_DELIVERY");
        CheckBoxList.add("#SELLER_FLEXIBLE");

        for (String abc:CheckBoxList) {
            WebElement element = Driver.getDriver().findElement(By.cssSelector(abc));
            BrowserUtilities.verifyElementClickable(element);
            element.click();
            BrowserUtilities.waitFor(1);
        }
    BrowserUtilities.waitFor(3);
    Driver.closeDriver();






    }
}
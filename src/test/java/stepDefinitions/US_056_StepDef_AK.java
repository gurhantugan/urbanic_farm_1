package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import pages.DeliveryPickUpSettingsPage;
import utilities.BrowserUtilities;

import java.util.ArrayList;
import java.util.List;


public class US_056_StepDef_AK {
//    DeliveryPickUpSettingsPage deliveryPickUpSettingsPage = new DeliveryPickUpSettingsPage();
//
//    @When("user clicks Seller delivers the products checkbox")
//    public void userClicksSellerDeliversTheProductsCheckbox() {
//        deliveryPickUpSettingsPage.checkbox_Seller_Flexible.click();
//
//    }
//
//    @And("user enters valid or invalid credentials to {string} \\(mile) textbox")
//    public void userEntersValidOrInvalidCredentialsToMileTextboxd(String mile) {
//        BrowserUtilities.waitForVisibility(deliveryPickUpSettingsPage.textbox_FreeDeliveryRange, 30);
//        deliveryPickUpSettingsPage.textbox_FreeDeliveryRange.clear();
//        deliveryPickUpSettingsPage.textbox_FreeDeliveryRange.sendKeys(mile);
//    }
//
//    @And("user enters valid or invalid credentials to {string} textbox")
//    public void userEntersValidOrInvalidCredentialsToTextbox(String dollar) {
//        deliveryPickUpSettingsPage.textbox_MinFreeDeliveryOrder.clear();
//        deliveryPickUpSettingsPage.textbox_MinFreeDeliveryOrder.sendKeys(dollar);
//
//    }
//
//    @And("user enters valid or invalid credentials to {string} $ textbox")
//    public void userEntersValidOrInvalidCredentialsTo$Textbox(String dollar) {
//        deliveryPickUpSettingsPage.textbox_PerMileCost.clear();
//        deliveryPickUpSettingsPage.textbox_PerMileCost.sendKeys(dollar);

//    }
//
//    @And("user enters valid or invalid credentials to {string} mile textboxx")
//    public void userEntersValidOrInvalidCredentialsToMileTextboxx(String mile) {
//        deliveryPickUpSettingsPage.textbox_MaxDeliveryRange.clear();
//        deliveryPickUpSettingsPage.textbox_MaxDeliveryRange.sendKeys(mile);
//    }
//
//    @And("user enters valid or invalid credentials to {string} menu")
//    public void userEntersValidOrInvalidCredentialsToMenu(String time) {
//        deliveryPickUpSettingsPage.textbox_EstimatedDeliveryTime.sendKeys(time);
//
//    }
//
//    @And("user enters valid or invalid credentials to {string} \\(mile) menu")
//    public void userEntersValidOrInvalidCredentialsToMileMenu(String num) {
//        deliveryPickUpSettingsPage.textbox_UpTo.clear();
//        deliveryPickUpSettingsPage.textbox_UpTo.sendKeys(num);
//    }
//
//    @And("user clicks plus button and enters valid credentials to Estimated Delivery Time menu and Up to \\(mile) menu")
//    public void userClicksPlusButtonAndEntersValidCredentialsToEstimatedDeliveryTimeMenuAndUpToMileMenu() {
//        List<String> timeList = new ArrayList<>();
//        timeList.add("1 hour");
//        timeList.add("2 hours");
//        timeList.add("3 hours");
//        timeList.add("5 hours");
//        timeList.add("3 day");
//
//        List<Integer> mileList = new ArrayList<>();
//        mileList.add(5);
//        mileList.add(20);
//        mileList.add(35);
//        mileList.add(98);
//        mileList.add(500);
//
//        for (int i = 0; i < 4; i++) {
//            deliveryPickUpSettingsPage.button_Plus.click();
//            BrowserUtilities.waitFor(1);
//            deliveryPickUpSettingsPage.textbox_EstimatedTimeList.get(i).sendKeys(timeList.get(i));
//            BrowserUtilities.waitFor(1);
//            deliveryPickUpSettingsPage.textbox_DistanceList.get(i + 1).sendKeys(mileList.get(i).toString());
//        }
//    }
//
//    @Then("user clicks update button and verifies to update succesfully")
//    public void userClicksUpdateButtonAndVerifiesToUpdateSuccesfully() {
//        deliveryPickUpSettingsPage.button_Update.click();
//        BrowserUtilities.waitForVisibility(deliveryPickUpSettingsPage.allert_Message, 20);
//        String expectedAllert = "Your delivery settings have been successfully updated";
//        String actualAllert = deliveryPickUpSettingsPage.allert_Message.getText();
//        System.out.println("actualAllert = " + actualAllert);
//        assertEquals(actualAllert, expectedAllert);
//    }
//
//    @Then("user clicks update button and verifies {string} error message")
//    public void userClicksUpdateButtonAndVerifiesErrorMessage(String errorMessage) {
//        deliveryPickUpSettingsPage.button_Update.click();
//
//        BrowserUtilities.waitFor(2);
//
//        String actualMessage1 = deliveryPickUpSettingsPage.textbox_FreeDeliveryRange.getDomProperty("validationMessage");
//        String actualMessage2 = deliveryPickUpSettingsPage.textbox_MinFreeDeliveryOrder.getDomProperty("validationMessage");
//        String actualMessage3 = deliveryPickUpSettingsPage.textbox_PerMileCost.getDomProperty("validationMessage");
//        String actualMessage4 = deliveryPickUpSettingsPage.textbox_EstimatedDeliveryTime.getDomProperty("validationMessage");
//        String actualMessage5 = deliveryPickUpSettingsPage.textbox_UpTo.getDomProperty("validationMessage");
//        if (errorMessage.contains(actualMessage1) || errorMessage.equals(actualMessage2) || errorMessage.equals(actualMessage3)
//                || errorMessage.equals(actualMessage4) || errorMessage.equals(actualMessage5)) {
//            System.out.println("hata mesaji goruldu");
//        }
//
//
//    }


}


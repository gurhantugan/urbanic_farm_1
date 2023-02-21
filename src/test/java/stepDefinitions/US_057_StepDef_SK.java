package stepDefinitions;

import com.sun.source.tree.DoWhileLoopTree;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import pages.DeliveryandPickupPage;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US_057_StepDef_SK extends DeliveryandPickupPage {
    Select select;

    @Given("User Login as Seller")
    public void user_login_as_seller() {
        String web = "account/delivery";

        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenSellerUrl"), web);
    }

    @When("user clicks on user name")
    public void user_clicks_on_user_name() {
        user.isEnabled();
        user.click();

    }

    @When("user clicks on delivery and pickup settings")
    public void user_clicks_on_delivery_and_pickup_settings() {
       // BrowserUtilities.waitFor(1);
        delivery_section.click();


    }

    @And("user clicks on seller flexible")
    public void userClicksOnSellerFlexible() {

        box_SellerFlexDel.isSelected();


    }

    @Then("user verifies following ids are visible")
    public void user_verifies_following_ids_are_visible(DataTable dataTable) {


        List<String> mds = new ArrayList<>();
        mds.add("freeFlexibleDeliveryRange");
        mds.add("minFreeFlexibleDeliveryOrder");
        mds.add("perMileCostFlex");
        mds.add("maxFlexibleDeliveryRange");
        mds.add("_deliveryBeginDay");
        mds.add("_deliveryBeginTime");
        mds.add("_deliveryEndDay");
        mds.add("_deliveryEndTime");
        mds.add("_orderByDay");
        mds.add("_orderByTime");


        for (String md : mds) {
            WebElement element1 = Driver.getDriver().findElement(By.cssSelector("#" + md));
            //BrowserUtilities.waitFor(2);

        }
        List<String> ids = dataTable.column(0);

        for (String id : ids) {
            WebElement element = Driver.getDriver().findElement(By.cssSelector("#" + id));

            Assert.assertTrue(element.isDisplayed());

        }


    }

    @Then("user verifies following ids are clickable")
    public void user_verifies_following_ids_are_clickable(DataTable dataTable) {
        List<String> ids = dataTable.column(0);
        for (int i = 0; i < ids.size(); i++) {
            WebElement element = Driver.getDriver().findElement(By.cssSelector("#" + ids.get(i)));
            BrowserUtilities.cleanTextInBox(element);


        }
    }

    @Then("user should have page that only selected box SellerFlexible")
    public void userShouldHavePageThatOnlySelectedBoxSellerFlexible(DataTable dataTable) {
        List<String> ids = dataTable.column(0);
        for (int i = 0; i < ids.size(); i++) {
            WebElement element = Driver.getDriver().findElement(By.cssSelector(ids.get(i)));

            BrowserUtilities.clickWithJS(element);
        }
    }

    @Then("user verifies on the page that if enter out of boundry alert should be seen")
    public void userVerifiesOnThePageThatIfEnterOutOfBoundryAlertShouldBeSeen(DataTable dataTable) {
        List<String> boxes = dataTable.column(2);

        for (int i = 0; i < boxes.size(); i++) {
            WebElement element = Driver.getDriver().findElement(By.cssSelector(boxes.get(i)));

            BrowserUtilities.clearAndSend(element, dataTable.cell(i, 0));
            String expectedcolor = dataTable.cell(i, 3);
            String actualcolor = element.getCssValue("border-color");


            Assert.assertNotEquals(expectedcolor, actualcolor);

            BrowserUtilities.cleanTextInBox(element);

        }
    }

    @Then("user verifies that menu should work with the suitable date and time")
    public void userVerifiesThatMenuShouldWorkWithTheSuitableDateAndTime(DataTable dataTable) {
        List<String> boxes = dataTable.column(1);

        for (int i = 0; i < boxes.size(); i++) {
            WebElement element = Driver.getDriver().findElement(By.cssSelector(boxes.get(i)));
            element.sendKeys("1");

        }
    }

    @When("user selects {string} for orderBegin")
    public void userSelectsForOrderBegin(String day) {
        select = new Select(toolbar_deliveryBeginDay);
        select.selectByValue(day);
    }


    @And("user enters input to order begin {string}")
    public void userEntersInputToOrderBegin(String time) {
        box_deliveryBeginTime.sendKeys(time);
    }

    @When("user selects {string} for orderEnd")
    public void userSelectsForOrderEnd(String day) {
        select = new Select(toolbar_deliveryEndDay);
        select.selectByValue(day);
    }

    @And("user enters input to order end {string}")
    public void userEntersInputToOrderEnd(String time) {
        box_deliveryEndTime.sendKeys(time);
    }

    @When("user selects {string} for deliveryBy")
    public void userSelectsForDeliveryBy(String day) {
        select = new Select(toolbar_orderByDay);
        select.selectByValue(day);
    }

    @And("user enters input to deliver by {string}")
    public void userEntersInputToDeliverBy(String time) {
        box_orderByTime.sendKeys(time);
    }

    @And("user clicks on update button")
    public void userClicksOnUpdateButton() {
        BrowserUtilities.clickWithJS(button_update);
    }

    // @Then("user verifies toast message is {string}")
    // public void userVerifiesToastMessageIs(String toastmessage) {


}



package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.DeliveryandPickupPage;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class US_057_StepDef_SK extends DeliveryandPickupPage {
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
        BrowserUtilities.waitFor(3);
        delivery_section.isEnabled();
        delivery_section.click();
    }

    @When("user clicks on seller flexible")
    public void user_clicks_on_seller_flexible() {
        box_SellerFlexDel.isEnabled();
        // BrowserUtilities.clickWithJS(box_SellerFlexDel);
        box_SellerFlexDel.click();
    }

    @Then("user verifies following ids are visible")
    public void user_verifies_following_ids_are_visible(DataTable dataTable) {
        BrowserUtilities.waitFor(3);
        List<String> ids = dataTable.column(0);
        for (int i = 0; i < ids.size(); i++) {
            WebElement element = Driver.getDriver().findElement(By.cssSelector("#" + ids.get(i)));
            System.out.println(element.toString());

            Assert.assertTrue(box_SellerFlexDel.isDisplayed());

             }

            //  box_freeFlexDel.click();

        }

        @Then("user verifies following ids are clickable")
        public void user_verifies_following_ids_are_clickable (DataTable dataTable){
            List<String> ids = dataTable.column(0);
            for (int i = 0; i < ids.size(); i++) {
                WebElement element = Driver.getDriver().findElement(By.cssSelector("#" + ids.get(i)));
                System.out.println(element.toString());
                Assert.assertTrue(element.isEnabled());


            }
            //BrowserUtilities.clearLocalSessionCookies();
        }
    }

package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import pages.AddressPage;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_051_StepDef51 {

    AddressPage addresspage = new AddressPage();




    @When("user clicks on Delivery Address button")
    public void user_clicks_on_delivery_address_button() {
        addresspage.delivery_button.click();
        BrowserUtilities.waitFor(2);
    }

    @Then("user should see address edit and remove button on the Address page")
    public void user_should_see_address_edit_and_remove_button_on_the_address_page() {
        String expectedUrl = "https://test.urbanicfarm.com/account/address";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("user clicks on AddressTitle button")
    public void userClicksOnAddressTitleButton() {
        addresspage.address_title.click();
        BrowserUtilities.waitFor(2);
    }


    @Then("user enter valid address")
    public void userEnterValidAddress() {
        addresspage.address_title.sendKeys("Delivery");

    }
}

















package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AddressPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;


public class US_052_StepDefs_MY {
    AddressPage addressPage= new AddressPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("user goes to {string} page after login")
    public void userGoesToPageAfterLogin(String endPoint) {
        BrowserUtilities.loginWithToken(ConfigurationReader.getProperty("tokenUrl"),endPoint);
        BrowserUtilities.waitFor(2);
        //System.out.println(Driver.getDriver().findElement(By.xpath("//p[@class='card-text']")).getText());
    }



    @And("user clicks on My Sales Adress")
    public void userClicksOnMySalesAdress() {
        addressPage.button_salesAddress.click();
BrowserUtilities.waitFor(2);
    }

    @When("user clicks to edit button")
    public void userClicksToEditButton() {
     actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
             .build().perform();
        BrowserUtilities.waitFor(2);
     addressPage.button_edit.click();

    }
    @When("user is able to click Submit button and gets the message")
    public void userIsAbleToClickSubmitButtonAndGetsTheMessage() {
        addressPage.button_submit.click();
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(addressPage.message_update.isDisplayed());
    }
    @Then("user clicks the checkbox Mark as a sales address")
    public void userClicksTheCheckboxMarkAsASalesAddress() {
        addressPage.checkbox_sales_address.click();
    }



    @Then("user clicks on Cancel button to see nothing was editted")
    public void userClicksOnCancelButtonToSeeNothingWasEditted() {
    }





    }


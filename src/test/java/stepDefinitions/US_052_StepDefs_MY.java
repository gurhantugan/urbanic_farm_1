package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AddressPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;


public class US_052_StepDefs_MY {
    AddressPage addressPage= new AddressPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("user goes to {string} page after login")
    public void userGoesToPageAfterLogin(String endPoint) {
        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("tokenSellerUrl"),endPoint);
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

    @Then("user sees the {string}")
    public void userSeesThe(String message_no_address) {
        String actualMessage = addressPage.message_address_notset.getText();
        String expectedMessage = message_no_address;
        Assert.assertEquals("no message",expectedMessage,actualMessage);
        BrowserUtilities.waitFor(5);
       Driver.getDriver().navigate().refresh();


        //JSUtils.scrollIntoViewJS(addressPage.button_deliveryAddress);
        actions.sendKeys(Keys.PAGE_UP).perform();
        BrowserUtilities.waitFor(3);
        actions.moveToElement(addressPage.button_deliveryAddress).perform();
        addressPage.button_deliveryAddress.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        if(addressPage.title_delivery_address.isEnabled()){

       //BrowserUtilities.waitFor(2);

     BrowserUtilities.waitFor(2);
        actions.moveToElement(addressPage.button_Edit).perform();
       addressPage.button_Edit.click();
       BrowserUtilities.waitFor(2);
       addressPage.checkbox_sales_address.click();
       addressPage.button_submit.click();}
       else if(addressPage.message_address_notset.isDisplayed()) {
           actions.sendKeys(Keys.PAGE_UP).perform();
          BrowserUtilities.waitFor(2);
          addressPage.button_NonSelectedAddress.click();
          actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
         addressPage.button_edit.click();
         addressPage.checkbox_sales_address.click();
         BrowserUtilities.waitFor(3);
         addressPage.checkBox_deliveryAddress.click();
         addressPage.button_submit.click();
        }

    }

    @Then("user clicks on Cancel button to see nothing was editted")
    public void userClicksOnCancelButtonToSeeNothingWasEditted() {
    }





    }


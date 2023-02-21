package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_050_StepDef_AO {

    AddressPage addressPage = new AddressPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.getDriver( "https://test.urbanicfarm.com/" ));

    @Given("user goes to Home Page")
    public void userGoesToRegisterPage() {
        Driver.getDriver( "https://test.urbanicfarm.com/" ).get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver( "https://test.urbanicfarm.com/" ).manage().window().maximize();
    }

    @When("user clicks on login button header")
    public void userClicksOnLoginButtonHeader() {
        homePage.loginButton_header.click();

    }

    @And("user enters valid email address")
    public void userEntersValidEmailAddress() {
        loginPage.box_email.sendKeys(ConfigurationReader.getProperty("buyerEmail"));

    }

    @And("user enters valid password")
    public void userEntersValidPassword() {
        loginPage.box_password.sendKeys(ConfigurationReader.getProperty("buyerPassword"));
    }

    @And("user clicks on login button footer")
    public void userClicksOnLoginButtonFooter() {
        loginPage.loginButton_footer.click();
        BrowserUtilities.waitFor(4);
    }

    @Then("user should be on the Home page")
    public void userShouldBeOnTheHomePage() {
//        String expectedUrl = "https://test.urbanicfarm.com/home";
//        String actualUrl = Driver.getDriver().getCurrentUrl();
//        Assert.assertEquals(expectedUrl,actualUrl);
        Assert.assertTrue(homePage.button_logout.isDisplayed());
    }

//    @When("user clicks on Delivery Address link")
//    public void userClicksOnDeliveryAddressLink() {
//        homePage.deliveryAddress_button.click();
//        BrowserUtilities.waitFor(2);
//
//    }

    @Then("user should be able to on the Address page")
    public void userShouldBeAbleToOnTheAddressPage() {
        String expectedUrl = "https://test.urbanicfarm.com/account/address";
        String actualUrl = Driver.getDriver( "https://test.urbanicfarm.com/" ).getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @When("user clicks on Add New Address button")
    public void userClicksOnAddNewAddressButton() {
        addressPage.addNewAddress_button.click();

    }

    @And("user enters Search Places valid address")
    public void userEntersSearchPlacesValidAddress() {
        addressPage.searchPlace.sendKeys("55 Oxford Ave, Washington NE37 1AB, UK");
        addressPage.dropDownMenu.click();

    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        BrowserUtilities.waitFor(5);
        addressPage.button_submit.click();
    }

    @Then("the message should be seen{string}")
    public void theMessageShouldBeSeen(String message) {
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(addressPage.warningMessage_successfullyAdded.isDisplayed());
    }

    @Given("user on the Address page")
    public void user_on_the_address_page() {
        Assert.assertTrue(addressPage.button_remove.isDisplayed());


    }

    @When("user clicks on My Sales Address button")
    public void user_clicks_on_my_sales_address_button() {
        addressPage.button_MySalesAddress.click();

    }

    @Then("user should see warning message {string}")
    public void user_should_see_warning_message(String string) {
        String expectedText = "My delivery address";
        String actualText = addressPage.text_Mydeliveryaddress.getText();
        Assert.assertTrue(actualText.contains((expectedText)));

    }

    @When("user clicks on Non Selected Address button")
    public void user_clicks_on_non_selected_address_button() {
        addressPage.button_NonSelectedAddress.click();

    }

    @Then("Edit button should be clickable")
    public void edit_button_should_be_clickable() {
        addressPage.button_Edit.isDisplayed();

    }

    @Then("Remove button should be clickable")
    public void remove_button_should_be_clickable() {
        addressPage.button_remove.isDisplayed();


    }

    @When("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        addressPage.button_Edit.click();

    }

    @When("user edits the house number")
    public void user_edits_the_house_number() {
        addressPage.box_address.clear();
        BrowserUtilities.waitFor(2);
        addressPage.box_address.sendKeys("57 Oxford Ave, Washington NE37 1AB, UK");

    }

    @When("user clicks on Submit button")
    public void user_clicks_on_submit_button() {
        BrowserUtilities.waitFor(3);
        addressPage.button_submit2.click();

    }

    @Then("user should be able to see warning message\"Your Address successfully updated\"")
    public void user_should_be_able_to_see_warning_message_your_address_successfully_updated() {
        BrowserUtilities.waitFor(2);
        //Assert.assertTrue(addressPage.warningMessage_successfullyAdded.isDisplayed());
        String expectedWarningMessage = "Your Address successfully updated";
        String actualWarningMessage = addressPage.warningMessage_yourAddressSuccessfullyUpdated.getText();
        Assert.assertTrue(actualWarningMessage.contains((expectedWarningMessage)));

    }

    @When("user clicks on Remove button")
    public void user_clicks_on_remove_button() {
        BrowserUtilities.clickWithJS(addressPage.button_remove2);

    }

    @Then("pop up should be seen\"Are you sure to delete the address?\"")
    public void pop_up_should_be_seen_are_you_sure_to_delete_the_address() {
        BrowserUtilities.waitFor(2);
        String expectedText = "Are you sure to delete the address?";
        String actualText = addressPage.box_textDelete.getText();
        Assert.assertTrue(actualText.contains((expectedText)));

    }

    @When("user clicks on No button")
    public void user_clicks_on_no_button() {
        BrowserUtilities.waitFor(5);
        //addressPage.button_No.click();
        //BrowserUtilities.masterClick(addressPage.button_No);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        BrowserUtilities.waitFor(1);

    }

    @Then("user should be go back to Address page")
    public void user_should_be_go_back_to_address_page() {
        Assert.assertTrue(addressPage.button_remove.isDisplayed());

    }

    @When("user clicks on Yes button")
    public void user_clicks_on_yes_button() {
        BrowserUtilities.waitFor(1);
        Driver.getDriver( "https://test.urbanicfarm.com/" ).navigate().refresh();
        BrowserUtilities.waitFor(2);
     addressPage.button_remove.click();
     BrowserUtilities.waitFor(3);
     //addressPage.button_Yes.click();
       actions.sendKeys(Keys.TAB).perform();
       actions.sendKeys(Keys.ENTER).perform();

    }

    @Then("user should see the message {string}")
    public void user_should_see_the_message(String string) {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(addressPage.getWarningMessage_addressDeleted.isDisplayed());

    }
}

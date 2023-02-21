package stepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AccountPage;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.List;

public class US_049_StepDef_SG {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();
    AddressPage addressPage = new AddressPage();

    @Then("User clicks the account home button")
    public void user_clicks_the_account_home_button() {
        loginPage.button_accountHome.click();
        BrowserUtilities.waitFor(3);


    }

    @Then("User clicks the address button on left column")
    public void user_clicks_the_address_button_on_left_column() {
        accountPage.button_adress.click();
        BrowserUtilities.waitFor(3);

    }

    @Then("User clicks add new address button")
    public void user_clicks_add_new_address_button() {
        addressPage.button_addNewAddress.click();
        BrowserUtilities.waitFor(3);

    }

    @Then("user clicks search places text box")
    public void user_clicks_search_places_text_box() {
        addressPage.textBox_searchPlaces.click();
        BrowserUtilities.waitFor(3);

    }

    @Then("user enters the part of address")
    public void user_enters_the_part_of_address() {
        addressPage.textBox_searchPlaces.sendKeys("Henry");
        BrowserUtilities.waitFor(3);

    }

    @Then("user selects the address from opened menu")
    public void user_selects_the_address_from_opened_menu() {
        addressPage.select_firstAddress.click();
        BrowserUtilities.waitFor(3);

    }

    @Then("user asserts variable titles are visible")
    public void user_asserts_variable_titles_are_visible(DataTable dataTable) {
//        Assert.assertTrue(addressPage.title_addressTitle.isDisplayed());
//        Assert.assertTrue(addressPage.title_address.isDisplayed());
//        Assert.assertTrue(addressPage.title_state.isDisplayed());
//        Assert.assertTrue(addressPage.title_city.isDisplayed());
//        Assert.assertTrue(addressPage.title_postal.isDisplayed());
//        Assert.assertTrue(addressPage.title_deliveryAddress.isDisplayed());
//        Assert.assertTrue(addressPage.title_salesAddress.isDisplayed());

        List<String> texts = dataTable.column(0);
        for (int i = 0; i < texts.size(); i++) {
            WebElement element = Driver.getDriver( "https://test.urbanicfarm.com/" ).findElement(By.xpath("//*[text()='" + texts.get(i) + "']"));
            Assert.assertTrue(element.isDisplayed());

        }
    }

    @Then("user asserts all titles and menus must be functional and additable")
    public void user_asserts_all_titles_and_menus_must_be_functional_and_additable(DataTable dataTable) {
//        Assert.assertTrue(addressPage.title_addressTitle.isEnabled());
//        Assert.assertTrue(addressPage.title_address.isEnabled());
//        Assert.assertTrue(addressPage.title_state.isEnabled());
//        Assert.assertTrue(addressPage.title_city.isEnabled());
//        Assert.assertTrue(addressPage.title_postal.isEnabled());
//        Assert.assertTrue(addressPage.title_deliveryAddress.isEnabled());
//        Assert.assertTrue(addressPage.title_salesAddress.isEnabled());
//        Assert.assertTrue(addressPage.textBox_home.isEnabled());
//        Assert.assertTrue(addressPage.textBox_address.isEnabled());
//        Assert.assertTrue(addressPage.textBox_postal.isEnabled());
//        Assert.assertTrue(addressPage.checkBox_deliveryAddress.isEnabled());
//        Assert.assertTrue(addressPage.checkBox_sellerAddress.isEnabled());
//        Assert.assertFalse(addressPage.textBox_states.isEnabled());
//        Assert.assertFalse(addressPage.textBox_city.isEnabled());

        List<String> texts = dataTable.column(0);
        for (int i = 0; i < texts.size(); i++) {
            WebElement element = Driver.getDriver( "https://test.urbanicfarm.com/" ).findElement(By.xpath("//*[@id='" + texts.get(i) + "']"));
            //"//input[@id='addressTitle']"
            Assert.assertTrue(element.isDisplayed());
        }

    }

    @Then("user clicks submit button")
    public void user_clicks_submit_button() {
        addressPage.button_submit.click();
        BrowserUtilities.waitFor(1);

    }

    @Then("user asserts Your address has been successfully added should appear")
    public void user_asserts_your_address_has_been_successfully_added_should_appear() {
        Assert.assertTrue(addressPage.message_successful.isDisplayed());

    }

    @Then("user selects Mark as a delivery address")
    public void user_selects_mark_as_a_delivery_address() {
        BrowserUtilities.waitFor(1);
        addressPage.checkBox_deliveryAddress.click();
        BrowserUtilities.waitFor(1);

    }

    @Then("user clicks delivery address button")
    public void user_clicks_delivery_address_button() {
        addressPage.button_deliveryAddress.click();

    }

    @Then("user asserts delivery address is visible")
    public void user_asserts_delivery_address_is_visible() {
        Assert.assertTrue(addressPage.body_AddressCard.isDisplayed());


    }

    @Then("user selects Mark as a sales address")
    public void user_selects_mark_as_a_sales_address() {
        addressPage.checkBox_sellerAddress.click();

    }

    @Then("user clicks my sales address button")
    public void user_clicks_my_sales_address_button() {
        addressPage.button_salesAddress.click();

    }

    @Then("user asserts sales address is visible")
    public void user_asserts_sales_address_is_visible() {
        Assert.assertTrue(addressPage.body_AddressCard.isDisplayed());
    }



}

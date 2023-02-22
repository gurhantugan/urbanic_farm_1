package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OrdersPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.JSUtils;

public class US_070_StepDef_AK_BT {

    OrdersPage ordersPage = new OrdersPage();
    @Then("orders option should be clickable")
    public void ordersOptionShouldBeClickable() {
        BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenBuyerUrl"),"account/orders");
        BrowserUtilities.waitForClickability(ordersPage.button_orders,3);
        BrowserUtilities.verifyElementClickable(ordersPage.button_orders);
    }

    @When("user clicks on orders")
    public void userClicksOnOrders() {
        JSUtils.clickElementByJS(ordersPage.button_orders);

    }

    @Then("Your Orders\\(Orders List) should be displayed")
    public void yourOrdersOrdersListShouldBeDisplayed() {
        BrowserUtilities.waitForVisibility(ordersPage.text_yourOrders,3);
        BrowserUtilities.verifyElementDisplayed(ordersPage.text_yourOrders);

    }

    @When("user select any order and click on details button")
    public void userSelectAnyOrderAndClickOnDetailsButton() {

    }

    @Then("order details should be displayed")
    public void orderDetailsShouldBeDisplayed() {
    }

    @Then("order summery and order contents fields should be visible")
    public void order_summery_and_order_contents_fields_should_be_visible() {
         
    }
    @When("user click on seller page button")
    public void user_click_on_seller_page_button() {
         
    }
    @Then("seller page button should be functional and clickable")
    public void seller_page_button_should_be_functional_and_clickable() {
         
    }
    @When("user click on seller adress button")
    public void user_click_on_seller_adress_button() {
         
    }
    @Then("seller page should give correct result with view larger map")
    public void seller_page_should_give_correct_result_with_view_larger_map() {
         
    }
}

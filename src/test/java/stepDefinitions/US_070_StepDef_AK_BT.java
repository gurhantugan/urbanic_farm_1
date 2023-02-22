package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OrdersPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

import java.util.Set;

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
        //JSUtils.clickElementByJS(ordersPage.button_orders);

    }

    @Then("Your Orders\\(Orders List) should be displayed")
    public void yourOrdersOrdersListShouldBeDisplayed() {
        if(ordersPage.idOfOrders.size()>0){
            System.out.println("Orders List displayed");
        }

    }

    @When("user select any order and click on details button")
    public void userSelectAnyOrderAndClickOnDetailsButton() {
        JSUtils.clickElementByJS(ordersPage.viewOrderDetails.get(0));
    }

    @Then("order details should be displayed")
    public void orderDetailsShouldBeDisplayed() {
        BrowserUtilities.waitForVisibility(ordersPage.orderDetails,3);
        BrowserUtilities.verifyElementDisplayed(ordersPage.orderDetails);
    }

    @Then("order summery and order contents fields should be visible")
    public void order_summery_and_order_contents_fields_should_be_visible() {

         BrowserUtilities.verifyElementDisplayed(ordersPage.orderDetails);
         BrowserUtilities.verifyElementDisplayed(ordersPage.orderContents);
    }
    @When("user click on seller page button")
    public void user_click_on_seller_page_button() {
         JSUtils.clickElementByJS(ordersPage.buttons_sellerPage.get(0));
    }
    @Then("seller page button should be functional and clickable")
    public void seller_page_button_should_be_functional_and_clickable() {
         BrowserUtilities.waitForVisibility(ordersPage.button_addToCard,3);
         BrowserUtilities.verifyElementDisplayed(ordersPage.button_addToCard);
         Driver.getDriver().navigate().back();
    }
    @When("user click on seller adress button")
    public void user_click_on_seller_adress_button() {
         BrowserUtilities.verifyElementDisplayed(ordersPage.texts_sellerAddress.get(0));
    }
    @Then("seller page should give correct result with view larger map")
    public void seller_page_should_give_correct_result_with_view_larger_map() {
         if(ordersPage.iframe.size()>1){
             Driver.getDriver().switchTo().frame(1);
         }else {
             Driver.getDriver().switchTo().frame(0);
         }
         JSUtils.clickElementByJS(ordersPage.button_viewLargerMap);
        String currentWindowHandle = Driver.getDriver().getWindowHandle();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String handle : windowHandles) {

            if(!handle.equals(currentWindowHandle)){
                Driver.getDriver().switchTo().window(handle);
            }
        }
        ordersPage.button_rejectAll.click();
        BrowserUtilities.waitForPageToLoad(10);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("/maps"));

        Driver.closeDriver();
    }
}

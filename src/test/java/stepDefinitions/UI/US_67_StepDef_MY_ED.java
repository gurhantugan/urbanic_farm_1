package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_67_StepDef_MY_ED {
    /* @Given("user goes to {string} page after login as buyer")
     public void userGoesToPageAfterLoginAsBuyer(String endpoint) {
         BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenBuyerUrl"),endpoint);
         BrowserUtilities.waitFor(2);

     }*/
    CardAndBasketPage cardAndBasketPage = new CardAndBasketPage();
    WelcomePage welcomePage = new WelcomePage();
    OrdersPage ordersPage = new OrdersPage();
    Actions actions = new Actions(Driver.getDriver());
    SelfShareTradePage selfShareTradePage = new SelfShareTradePage();
    SoldItemsPage soldItemsPage = new SoldItemsPage();
    String expectedProduct;
    String expectedSeller;
    String buyerOrderID;


    @Given("user goes to {string} page after login as Mary")
    public void userGoesToPageAfterLoginAsMary(String endpoint) {
        BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenMaryBuyer"), endpoint);
        BrowserUtilities.waitFor(4);


    }

    @And("user goes to {string} page after login as Mathew")
    public void userGoesToPageAfterLoginAsMathew(String endpoint) {
        BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenMathewSeller"), endpoint);
        BrowserUtilities.waitFor(2);
    }


    @When("user wants to buy any product from Mathew the Seller")
    public void userWantsToBuyAnyProductFromMathewTheSeller() {
        Select select = new Select(welcomePage.select_sort);
        select.selectByValue("Closest");
        BrowserUtilities.waitFor(5);
        expectedSeller = welcomePage.list_SellerName.get(0).getText();
        actions.moveToElement(welcomePage.list_SellerName.get(0)).click().perform();

        BrowserUtilities.waitFor(5);
    }

    @And("user goes to seller page to buy product and clicks add to cart")
    public void userGoesToSellerPageToBuyProductAndClicksAddToCart() {
        System.out.println(expectedProduct = selfShareTradePage.product_inSeller.getText());


        selfShareTradePage.button_AddToCart.click();
        BrowserUtilities.waitFor(3);
    }

    @And("user verifies seller name and product name in the cart")
    public void userVerifiesSellerNameAndProductNameInTheCart() {
        String actualSeller = cardAndBasketPage.seller_name.getText();
        System.out.println(actualSeller);
        String actualProduct = cardAndBasketPage.product_name.getText();
        System.out.println(actualProduct);

        BrowserUtilities.waitFor(3);

        Assert.assertTrue(actualSeller.contains(expectedSeller));
        Assert.assertEquals(expectedProduct, actualProduct);


    }

    @And("user clicks proceed to checkout")
    public void userClicksProceedToCheckout() {
        cardAndBasketPage.button_checkOut.click();
        BrowserUtilities.waitFor(3);
        cardAndBasketPage.button_Next.click();
        BrowserUtilities.waitFor(3);
        cardAndBasketPage.button_Next.click();
        BrowserUtilities.waitFor(3);
        cardAndBasketPage.button_GoToPayment.click();
        BrowserUtilities.waitFor(3);
    }

    @And("user sees new open pga to pay with paypall and clicks login")
    public void userSeesNewOpenPgaToPayWithPaypallAndClicksLogin() {
        BrowserUtilities.switchToWindowWithIndex(1);
        BrowserUtilities.waitFor(3);
        cardAndBasketPage.button_paypalLogin.click();
        cardAndBasketPage.email_paypal.clear();
        cardAndBasketPage.email_paypal.sendKeys(ConfigurationReader.getProperty("paypal_username"));
        cardAndBasketPage.password_paypal.sendKeys(ConfigurationReader.getProperty("paypal_password"));
        BrowserUtilities.waitFor(3);
        cardAndBasketPage.button_loginLast_paypal.click();
        BrowserUtilities.waitFor(3);
        cardAndBasketPage.button_complete_purchase.click();
        BrowserUtilities.waitFor(8);

    }

    @Then("user sees {string} message on the screen")
    public void userSeesMessageOnTheScreen(String paymentMessage) {
        BrowserUtilities.switchToWindowWithIndex(0);
        BrowserUtilities.waitFor(3);
        String actualText = cardAndBasketPage.text_payment_successful.getText();
        Assert.assertEquals("payment not successful", paymentMessage, actualText);


    }

    @And("user clicks on the notification bell to confirm orders")
    public void userClicksOnTheNotificationBellToConfirmOrders() {

        cardAndBasketPage.notification_bell.click();
        BrowserUtilities.waitFor(3);
    }

    @And("user clicks on the order link in notofications")
    public void userClicksOnTheOrderLinkInNotofications() {
        cardAndBasketPage.link_order_placed.click();
        BrowserUtilities.waitFor(5);
        cardAndBasketPage.cross_close_notification.click();

        BrowserUtilities.waitFor(3);


    }

    @And("user clicks on the view order details to get orderID")
    public void userClicksOnTheViewOrderDetailsToGetOrderID() {
        ordersPage.viewOrderDetails.get(0).click();
        BrowserUtilities.waitFor(3);
        buyerOrderID = ordersPage.order_number.getText();
        System.out.println(buyerOrderID);

    }

    @Then("seller sees the same orderID on his account")
    public void sellerSeesTheSameOrderIDOnHisAccount() {
        String sellerOrderID = soldItemsPage.soldItems_orderID.getText();
        System.out.println(sellerOrderID);
        Assert.assertEquals("not same order", buyerOrderID, sellerOrderID);
        BrowserUtilities.waitFor(3);

    }

    @When("seller sees order and changes the status from in progress to on delivery")
    public void sellerSeesOrderAndChangesTheStatusFromInProgressToOnDelivery() {
        Select selectOrderStatus = new Select(soldItemsPage.soldItems_orderStatus);
        selectOrderStatus.selectByValue("ON_DELIVERY");
        BrowserUtilities.waitFor(3);

    }

    @And("user goes to account page and clicks on Orders")
    public void userGoesToAccountPageAndClicksOnOrders() {
        welcomePage.account_name.click();
        BrowserUtilities.waitFor(3);
       ordersPage.button_orders.click();

    }

    @Then("user sees the order status on delivery")
    public void userSeesTheOrderStatusOnDelivery() {
        System.out.println(ordersPage.order_status_buyer.getText());
        Assert.assertEquals("order status", "On Delivery", ordersPage.order_status_buyer.getText());
    }

    @And("user clicks on the mark all read button")
    public void userClicksOnTheMarkAllReadButton() {

        ordersPage.link_mark_all_as_read.click();
        BrowserUtilities.waitFor(2);

    }

    @Then("user sees {string} in notifications box")
    public void userSeesInNotificationsBox(String notificationMessage) {
        String actualNotificationMessage = ordersPage.text_no_unread_notifications.getText();
        Assert.assertEquals("not matched message", notificationMessage, actualNotificationMessage);
        BrowserUtilities.waitFor(2);
        ordersPage.cross_notification.click();

    }
}















































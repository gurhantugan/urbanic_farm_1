package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CardAndBasketPage;
import pages.OrdersPage;
import pages.SelfShareTradePage;
import pages.WelcomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_67_StepDef_MY_ED {
    /* @Given("user goes to {string} page after login as buyer")
     public void userGoesToPageAfterLoginAsBuyer(String endpoint) {
         BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenBuyerUrl"),endpoint);
         BrowserUtilities.waitFor(2);

     }*/
    CardAndBasketPage cardAndBasketPage=new CardAndBasketPage();
    WelcomePage welcomePage = new WelcomePage();
    OrdersPage ordersPage=new OrdersPage();
    Actions actions = new Actions(Driver.getDriver());
   SelfShareTradePage selfShareTradePage=new SelfShareTradePage();
   String expectedProduct;
    String expectedSeller;





    @Given("user goes to {string} page after login as Mary")
    public void userGoesToPageAfterLoginAsMary(String endpoint) {
        BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenMaryBuyer"), endpoint);
        BrowserUtilities.waitFor(2);


    }

    @And("user goes to {string} page after login as Mathew")
    public void userGoesToPageAfterLoginAsMathew(String endpoint) {
        BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenMathewSeller"), endpoint);
        BrowserUtilities.waitFor(2);
    }


    @When("user wants to buy any product from Mathew the Seller")
    public void userWantsToBuyAnyProductFromMathewTheSeller() {
        Select select =new Select(welcomePage.select_sort);
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

      Assert.assertTrue( actualSeller.contains(expectedSeller));
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
        Assert.assertEquals("payment not successful",paymentMessage,actualText);


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
}

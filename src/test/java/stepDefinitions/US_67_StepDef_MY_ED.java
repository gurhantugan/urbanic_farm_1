package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
    WelcomePage welcomePage = new WelcomePage();
    Actions actions = new Actions(Driver.getDriver());
   SelfShareTradePage selfShareTradePage=new SelfShareTradePage();

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
       actions.moveToElement(welcomePage.list_SellerName.get(0)).click().perform();
       BrowserUtilities.waitFor(5);
    }

    @And("user goes to seller page to buy product and clicks add to cart")
    public void userGoesToSellerPageToBuyProductAndClicksAddToCart() {
        selfShareTradePage.button_AddToCart.click();
        BrowserUtilities.waitFor(5);
    }
}

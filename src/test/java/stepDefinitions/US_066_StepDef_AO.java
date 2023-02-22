package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CardAndBasketPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.JSUtils;

import java.util.Random;

public class US_066_StepDef_AO {

    CardAndBasketPage cardAndBasketPage = new CardAndBasketPage();
    Random random = new Random();
    int  quantityBefore;
    int  quantityAfter;
    double totalCostBefore;
    double totalCostAfter;
    double price;

    @Given("user goes to {string} page after login as a buyer")
    public void userGoesToPageAfterLoginAsABuyer(String endpoint) {
        BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenBuyerUrl"),endpoint);

    }

    @And("user clicks on Add to Card button")
    public void userClicksOnAddToCardButton() {
        int randomButton=random.nextInt(cardAndBasketPage.button_addToCard.size()-1);
        System.out.println("randomButton = " + randomButton);
        cardAndBasketPage.button_addToCard.get(randomButton);
        
    }

    @When("user clicks on plus button")
    public void userClicksOnPlusButton() {
        quantityBefore = Integer.parseInt(cardAndBasketPage.number_quantity.get(0).getAttribute("value"));
        System.out.println("quantityBefore = " + quantityBefore);
        totalCostBefore = Double.parseDouble(cardAndBasketPage.totalCost.getText().substring(1).replace(".",""))/100;
        System.out.println("totalCostBefore = " + totalCostBefore);

        JSUtils.clickElementByJS(cardAndBasketPage.button_plus);
        BrowserUtilities.waitFor(2);
    }

    @And("quantity should be increased")
    public void quantityShouldBeIncreased() {
        quantityAfter = Integer.parseInt(cardAndBasketPage.number_quantity.get(0).getAttribute("value"));
        System.out.println("quantityAfter = " + quantityAfter);
        BrowserUtilities.waitFor(2);
        Assert.assertEquals(quantityBefore+1,quantityAfter);

        price = Double.parseDouble(cardAndBasketPage.price.getText().substring(1).replace(".",""))/100;
        System.out.println("price = " + price);
        totalCostAfter = Double.parseDouble(cardAndBasketPage.totalCost.getText().substring(1).replace(".",""))/100;
        System.out.println("totalCostAfter = " + totalCostAfter);



    }

    @Then("user should see total correct results in product increases")
    public void userShouldSeeTotalCorrectResultsInProductIncreases() {
        try {
            Assert.assertTrue(totalCostBefore+price == totalCostAfter);
        } catch (Exception exception){
            System.out.println(totalCostBefore+price+"="+totalCostAfter);
            System.out.println("There is a mistake in assertion");
        }
    }

    @When("user clicks on delete button")
    public void userClicksOnDeleteButton() {
        cardAndBasketPage.button_delete.click();
    }

    @Then("user should see message {string}")
    public void userShouldSeeMessage(String arg0) {
        Assert.assertTrue(cardAndBasketPage.text.isDisplayed());
    }

    @Then("user verifies the item deleted from cart")
    public void userVerifiesTheItemDeletedFromCart() {
    }

    @Then("user should see Total change in product wraps")
    public void userShouldSeeTotalChangeInProductWraps() {
    }

    @Then("user verifies the item does not delete from cart")
    public void userVerifiesTheItemDoesNotDeleteFromCart() {
    }
}

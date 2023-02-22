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
    int quantityBefore;
    int quantityAfter;

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
        quantityBefore = Integer.parseInt(cardAndBasketPage.number_quantity.get(1).getText());
        JSUtils.clickElementByJS(cardAndBasketPage.button_plus);
        BrowserUtilities.waitFor(2);

    }

    @And("quantity should be increased")
    public void quantityShouldBeIncreased() {
        quantityAfter = Integer.parseInt(cardAndBasketPage.number_quantity.get(1).getText());
        BrowserUtilities.waitFor(2);
        Assert.assertEquals(quantityBefore+1,quantityAfter);

    }

    @Then("user should see total correct results in product increases")
    public void userShouldSeeTotalCorrectResultsInProductIncreases() {
    }

    @When("user clicks on delete button")
    public void userClicksOnDeleteButton() {
    }

    @Then("user should see message {string}")
    public void userShouldSeeMessage(String arg0) {
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

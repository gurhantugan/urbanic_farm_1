package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import pages.WelcomePage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.JSUtils;

import java.util.Random;

import static utilities.BrowserUtilities.waitFor;

public class US_065_StepDef_GT extends CommonPage {

    Random random = new Random();
    WelcomePage welcomePage = new WelcomePage();
   int anyProduct;

    @When("User verifies welcome page is displayed")
    public void userVerifiesWelcomePageIsDisplayed() {
        waitFor(3);
        Assert.assertTrue(welcomePage.text_localSellerNearYou.isDisplayed());
        System.out.println(welcomePage.text_localSellerNearYou.getText());
    }

    @Then("User verifies a list of sellers under the heading local sellers near you")
    public void userVerifiesAListOfSellersUnderTheHeadingLocalSellersNearYou() {
        for (int i = 0; i < welcomePage.list_allSellers.size(); i++) {
            Assert.assertTrue(welcomePage.list_allSellers.get(i).isDisplayed());
            System.out.println("Page1 seller " + (i + 1) + "=" + welcomePage.list_allSellers.get(i).getText());

        }

        int numberOfSellers1 = welcomePage.list_allSellers.size();
        System.out.println("numberOfSellersAtPage1 = " + numberOfSellers1);

        JSUtils.scrollDownByJS();
        waitFor(1);

        try {
            if (welcomePage.button_page2.isEnabled()) {
                welcomePage.button_page2.click();
                waitFor(3);
                for (int i = 0; i < welcomePage.list_allSellers.size(); i++) {
                    Assert.assertTrue(welcomePage.list_allSellers.get(i).isDisplayed());
                    System.out.println("Page2 seller " + (i + 1) + "=" + welcomePage.list_allSellers.get(i).getText());

                }
                int numberOfSellers2 = welcomePage.list_allSellers.size();
                System.out.println("numberOfSellersAtPage2 = " + numberOfSellers2);
            }

        } catch (Exception e) {
            System.out.println("There is no second page");
        }
    }

    @And("User is able to choose any seller")
    public void userIsAbleToChooseAnySeller() {
        int anyseller = random.nextInt(welcomePage.list_allSellers.size());
        Assert.assertTrue(welcomePage.list_allSellers.get(anyseller).isEnabled());
    }

    @Then("User verifies Products are listed in separate sections")
    public void userVerifiesProductsAreListedInSeparateSections() {
        int numberOfSellers = welcomePage.list_allSellers.size();
        int numberOfProducts = welcomePage.list_allProducts.size();

        Assert.assertEquals(numberOfProducts, numberOfSellers);
    }

    @Then("User verifies Product quantity icons {string} are clickable")
    public void userVerifiesProductQuantityIconsAreClickable(String arg0) {

        for (int i = 0; i < welcomePage.button_plus.size(); i++) {
            JSUtils.scrollIntoViewJS(welcomePage.button_plus.get(i));
            waitFor(1);
            BrowserUtilities.masterClick(welcomePage.button_plus.get(i));
            waitFor(1);
            BrowserUtilities.masterClick(welcomePage.button_plus.get(i));
            waitFor(1);
            BrowserUtilities.masterClick(welcomePage.button_minus.get(i));
        }
    }

    @Then("User verifies add to Cart button is clickable")
    public void userVerifiesAddToCartButtonIsClickable() {


        for (int i = 0; i < welcomePage.button_AddToCard.size(); i++) {

            JSUtils.scrollIntoViewJS(welcomePage.button_plus.get(i));
             waitFor(1);
            JSUtils.scrollIntoViewJS(welcomePage.button_AddToCard.get(i));
             waitFor(1);
            Assert.assertTrue(welcomePage.button_AddToCard.get(i).isEnabled());

        }
    }

    @And("user clicks on basket Dropdown avatar")
    public void userClicksOnBasketDropdownAvatar() {
        BrowserUtilities.masterClick(welcomePage.avatar_basketDropdown);
    }

    @When("User clicks on the add to Cart button and verifies {string} success message is displayed")
    public void userClicksOnTheAddToCartButtonAndVerifiesSuccessMessageIsDisplayed(String successMessage) {

 anyProduct=random.nextInt(welcomePage.button_addToYourCardUnderBasketAvatar.size());
        System.out.println("any product = " + anyProduct);
BrowserUtilities.waitFor(3);
        BrowserUtilities.scrollToElement(welcomePage.button_addToYourCardUnderBasketAvatar.get(anyProduct));
        BrowserUtilities.waitFor(3);

      JSUtils.clickElementByJS(welcomePage.button_addToYourCardUnderBasketAvatar.get(anyProduct-1));
        BrowserUtilities.waitFor(3);

        Assert.assertTrue(welcomePage.successMessage_addedToYourBasket.getText().contains(successMessage));


//        try {
//            welcomePage.button_cancel.click();
//
//        } catch (Exception e) {
//            System.out.println("pop-up message has not displayed yet");
//
//        }

    }


    @Then("User verifies the product is added to the cart.")
    public void userVerifiesTheProductIsAddedToTheCart() {

        BrowserUtilities.waitFor(3);
        Driver.getDriver().navigate().refresh();
        BrowserUtilities.waitFor(3);

        String productNameDown=welcomePage.text_AllProductsNameDown.get(anyProduct).getText();
        String productNameUp=welcomePage.text_AddedProductNameUp.getText();



        JSUtils.scrollIntoViewJS(welcomePage.text_AddedProductNameUp);
        BrowserUtilities.waitFor(2);
        System.out.println("productNameDown = " + productNameDown);
        System.out.println("productNameUp = " + productNameUp);

        Assert.assertEquals(productNameDown,productNameUp);
    }



}


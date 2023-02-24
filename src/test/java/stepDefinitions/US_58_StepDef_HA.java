package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.YourProductsServicesPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.DatabaseUtilities;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;
import java.util.stream.Collectors;

import static stepDefinitions.Hooks.driver;

public class US_58_StepDef_HA {
    Random random = new Random();
    int randomHub;
    String addedProduct = "";
    YourProductsServicesPage yourProductsServicesPage = new YourProductsServicesPage();
    @Given("user login as seller")
    public void userLoginAsSeller() {
        BrowserUtilities.loginWithTokenSeller(ConfigurationReader.getProperty("sellerToken"), "account/hub");
    }

    @And("user goes to your products-services")
    public void userGoesToYourProductsServices() {
        // Assert.assertTrue(driver.getCurrentUrl() == "https://test.urbanicfarm.com/account/hub");
        Assert.assertEquals("https://test.urbanicfarm.com/account/hub", driver.getCurrentUrl());
    }

    @And("user click on random Hubs")
    public void userClickOnRandomHubs() {
        randomHub = random.nextInt(yourProductsServicesPage.allhubs.size());
        yourProductsServicesPage.allhubs.get(randomHub).click();
        BrowserUtilities.waitFor(2);
    }
    public static String getRandomIndexFromList(List<String> getString) {
        Random random1 = new Random();
        int randomIndex = random1.nextInt(getString.size());
        return getString.get(randomIndex);
    }
    @When("user verifies product name, price, stock, unit information added products should be displayed")
    public void userVerifiesProductNamePriceStockUnitInformationAddedProductsShouldBeDisplayed() {
        Assert.assertTrue(yourProductsServicesPage.addNewProduct_Name.isDisplayed());
        Assert.assertTrue(yourProductsServicesPage.addNewProduct_Price.isDisplayed());
        Assert.assertTrue(yourProductsServicesPage.addNewProduct_Stock.isDisplayed());
        Assert.assertTrue(yourProductsServicesPage.addNewProduct_Unit.isDisplayed());
        // structure  programming
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < yourProductsServicesPage.allAddedProducts.size(); i++) {
//            list.add(yourProductsServicesPage.allAddedProducts.get(i).getText());
//        }
        // functional programming
        List<String> addProductNames = yourProductsServicesPage.allAddedProducts.stream()
                .map(t -> t.getText())
                .collect(Collectors.toList());
        List<String> allProductNames = yourProductsServicesPage.allProductsNames.stream()
                .map(t -> t.getAttribute("value"))
                .collect(Collectors.toList());
        allProductNames.removeAll(addProductNames);
        addedProduct = getRandomIndexFromList(allProductNames);
        BrowserUtilities.waitFor(5);
        yourProductsServicesPage.addNewProduct_Name.sendKeys(addedProduct);
//        yourProductsServicesPage.addNewProduct_Name.sendKeys("Adoration Tomato");
        yourProductsServicesPage.addNewProduct_Price.sendKeys("15");
        yourProductsServicesPage.addNewProduct_Stock.sendKeys("15");
        Select select = new Select(yourProductsServicesPage.addNewProduct_Unit);
        select.selectByIndex(5);
//        BrowserUtilities.scrollToElement(yourProductsServicesPage.addNewProduct_Submit);
//        BrowserUtilities.masterClick(yourProductsServicesPage.addNewProduct_Submit);
        BrowserUtilities.scrollToElement(yourProductsServicesPage.addNewProduct_Submit);
        BrowserUtilities.clickWithJS(yourProductsServicesPage.addNewProduct_Submit);
    }

    @Then("user verifies one of the approved, in-Review, rejected options for each product should be visible on the file")
    public void userVerifiesOneOfTheApprovedInReviewRejectedOptionsForEachProductShouldBeVisibleOnTheFile() {
        BrowserUtilities.waitFor(5);
        for (int i = 0; i < yourProductsServicesPage.allProductsStatus.size(); i++) {
            String actualStatus = yourProductsServicesPage.allProductsStatus.get(i).getText();
            Assert.assertTrue(
                    actualStatus.equals("APPROVED") ||
                            actualStatus.equals("IN REVIEW") ||
                            actualStatus.equals("REJECTED")
            );
        }
    }

    @Then("user verifies in-review should be visible on the added product")
    public void userVerifiesInReviewShouldBeVisibleOnTheAddedProduct() {
        String actualProductStatus = BrowserUtilities.getStatusOfProduct(addedProduct);
        String expectedProductStatus = "IN_REVIEW";
        Assert.assertEquals(expectedProductStatus, actualProductStatus);
    }

    @Then("user approves last added product from database")
    public void userApprovesLastAddedProductFromDatabase() {
        BrowserUtilities.wait(3);
        DatabaseUtilities.approveLastProduct();
        BrowserUtilities.wait(3);
    }

    @Then("user verifies approved should be visible on the added product")
    public void userVerifiesApprovedShouldBeVisibleOnTheAddedProduct() {
        Driver.getDriver().navigate().back();
        BrowserUtilities.wait(2);
        yourProductsServicesPage.allhubs.get(randomHub).click();
        BrowserUtilities.wait(2);
        String actualProductStatus = BrowserUtilities.getStatusOfProduct(addedProduct);
        String expectedProductStatus = "APPROVED";
        Assert.assertEquals(expectedProductStatus, actualProductStatus);
    }

    @Then("verifies product name on the file related to the previously added product is clickable")
    public void userVerifiesProductNameOnTheFileRelatedToThePreviouslyAddedProductIsClickable() {
        yourProductsServicesPage.clickAddedProduct(addedProduct);
    }

    @When("user verifies product name is clicked, the update-delete page is displayed")
    public void userVerifiesProductNameIsClickedTheUpdateDeletePageIsDisplayed() {
        Assert.assertTrue(yourProductsServicesPage.update.isDisplayed());
        Assert.assertTrue(yourProductsServicesPage.delete.isDisplayed());
    }

    @When("user verifies product information should be able to be changed on this page")
    public void userVerifiesProductInformationShouldBeAbleToBeChangedOnThisPage() {

    }

    @When("user verifies update is clicked after corrections, it has been succesfully updated alert should be displayed")
    public void userVerifiesUpdateIsClickedAfterCorrectionsItHasBeenSuccesfullyUpdatedAlertShouldBeDisplayed() {
        yourProductsServicesPage.update.click();
        BrowserUtilities.toastMessageAssertion(addedProduct + " has been successfully updated");
    }

    @When("user verifies delete button is clicked, yes- no options should appear")
    public void userVerifiesDeleteButtonIsClickedYesNoOptionsShouldAppear() {
        yourProductsServicesPage.delete.click();
        BrowserUtilities.wait(6);
        // TODO: 15/02/2023 buranin uzerinde durmak lazim
    }

    @Then("user verifies yes - no options should appear")
    public void userVerifiesYesNoOptionsShouldAppear() {
        Assert.assertTrue(yourProductsServicesPage.yes.isDisplayed());
        Assert.assertTrue(yourProductsServicesPage.no.isDisplayed());
    }

    @When("user verifies one of the yes - no options should be selected")
    public void userVerifiesOoneOfTheYesNoOptionsShouldBeSelected() {
    }

    @Then("user verifies no option should cancel the operation")
    public void userVerifiesNoOptionShouldCancelTheOperation() {
    }

    @When("user verifies yes option is selected, the product should be removed from the page")
    public void userVerifiesYesOptionIsSelectedTheProductShouldBeRemovedFromThePage() {
        yourProductsServicesPage.yes.click();
        BrowserUtilities.toastMessageAssertion(addedProduct + " has been successfully deleted");
        BrowserUtilities.wait(3);
        Assert.assertTrue(
                yourProductsServicesPage.allAddedProducts.stream()
                        .map(t -> t.getText())
                        .noneMatch(t -> t.equals(addedProduct))
        );
    }
}

package stepDefinitions.UI;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AccountPage;
import pages.OrdersPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class US_062_StepDef_SG {

    AccountPage accountPage = new AccountPage();
    OrdersPage ordersPage = new OrdersPage();
    Actions actions = new Actions(Driver.getDriver());

//    @Given("user goes to {string} page after login as buyer")
//    public void userGoesToPageAfterLoginAsBuyer(String endPoint) {
//        BrowserUtilities.loginWithTokenBuyer(ConfigurationReader.getProperty("tokenBuyerUrl"), endPoint);
//        BrowserUtilities.waitFor(3);
//    }


    @Then("user asserts orders button is clickable")
    public void userAssertsOrdersButtonIsClickable() {
        Assert.assertTrue(ordersPage.button_orders.isEnabled());
    }

    @Then("user clicks the orders button on left column")
    public void userClicksTheOrdersButtonOnLeftColumn() {
        ordersPage.button_orders.click();
    }

    @Then("your Orders page opens")
    public void yourOrdersPageOpens() {
        String actualUrl = "https://test.urbanicfarm.com/account/orders";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Then("your Orders\\(Orders List) page should displayed")
    public void yourOrdersOrdersListPageShouldDisplayed(DataTable dataTable) {
        List<String> texts = dataTable.column(0);
        for (int i = 0; i < texts.size(); i++) {
            WebElement element = Driver.getDriver().findElement(By.xpath("//*[text()='" + texts.get(i) + "']"));
            Assert.assertTrue(element.isDisplayed());
        }
    }

    @Then("view order details button must be functional")
    public void viewOrderDetailsButtonMustBeFunctional() {
        Assert.assertTrue(ordersPage.button_viewOrderDetails.isEnabled());
    }

    @Then("user clicks on view order details button")
    public void userClicksOnViewOrderDetailsButton() {
        ordersPage.button_viewOrderDetails.click();
    }

    @Then("order Details page should be displayed")
    public void orderDetailsPageShouldBeDisplayed() {
        String actualUrl = "https://test.urbanicfarm.com/account/orders/order-details/828";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("order summary and Order contents fields should be visible on the Order Details page")
    public void orderSummaryAndOrderContentsFieldsShouldBeVisibleOnTheOrderDetailsPage() {
        Assert.assertTrue(ordersPage.field_orderSummary.isDisplayed());
        Assert.assertTrue(ordersPage.field_orderContents.isDisplayed());
    }

    @Then("seller page button should be functional")
    public void sellerPageButtonShouldBeFunctional() {
        Assert.assertTrue(ordersPage.button_sellerPage.isEnabled());
    }

    @Then("user clicks seller page")
    public void userClicksSellerPage() {
        ordersPage.button_sellerPage.click();
        BrowserUtilities.waitFor(3);
    }

    @Then("seller page should redirect to correct page")
    public void sellerPageShouldRedirectToCorrectPage() {
        String actualUrl = "https://test.urbanicfarm.com/point/1801";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("seller address button should be functional")
    public void sellerAddressButtonShouldBeFunctional() {
        //Seller Address Button is not clickable.It is label. Just assert.
        Assert.assertTrue(ordersPage.text_sellerAdress.isDisplayed());

    }

    @Then("seller page view should give correct result with larger map")
    public void sellerPageViewShouldGiveCorrectResultWithLargerMap() {

        Driver.getDriver().switchTo().frame(0);
        ordersPage.button_viewLargerMap.click();
        String currentWindowHandle = Driver.getDriver().getWindowHandle();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String handle : windowHandles) {

            if(!handle.equals(currentWindowHandle)){
                Driver.getDriver().switchTo().window(handle);
            }
        }

        ordersPage.button_rejectAll.click();
        BrowserUtilities.waitFor(2);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("/maps"));
    }

}

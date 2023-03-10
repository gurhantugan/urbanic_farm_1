package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.YourProductsServicesPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

public class US_059_StepDef_BT {
    Faker faker = new Faker();
    HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    YourProductsServicesPage ypsp = new YourProductsServicesPage();
    @Given("user login as Seller")
    public void user_login_as_seller() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver().manage().window().maximize();
        BrowserUtilities.waitForVisibility(homePage.button_login,3);
        JSUtils.clickElementByJS(homePage.button_login);
        BrowserUtilities.waitForClickability(loginPage.button_forgotPassword, 3);
        loginPage.box_email.sendKeys(ConfigurationReader.getProperty("sellerEmail"));
        loginPage.box_password.sendKeys(ConfigurationReader.getProperty("sellerPassword"));
        loginPage.button_login.click();
        BrowserUtilities.waitFor(4);
         
    }
    @When("user click on product services")
    public void user_click_on_product_services() {
        BrowserUtilities.waitForClickability(homePage.button_account,3);
        JSUtils.clickElementByJS(homePage.button_account);
        System.out.println(4);
        BrowserUtilities.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(ypsp.sideButton_account,ypsp.sideButton_yourProductsServices).perform();
        //System.out.println(ypsp.sideButton_yourProductsServices.getText());
    }
    @Then("various products should be display")
    public void various_products_should_be_display() {
        BrowserUtilities.waitForVisibility(ypsp.variousProduct.get(2),3);
        Assert.assertTrue(ypsp.variousProduct.size()>1);
         
    }
    @Then("One of the Approved-In, Review, Rejected options should be visible")
    public void one_of_the_approved_in_review_rejected_options_should_be_visible() {
         JSUtils.clickElementByJS(ypsp.button_vegetablesFruits);
         BrowserUtilities.waitForVisibility(ypsp.rounded.get(0),3);
        for (int i=0; i<ypsp.rounded.size();i++) {
            BrowserUtilities.verifyElementDisplayed(ypsp.rounded.get(i));
        }
    }
    @Then("Product Name, Price, Stock, proviously added products should be displayed")
    public void product_name_price_stock_proviously_added_products_should_be_displayed() {
         BrowserUtilities.waitForVisibility(ypsp.textbox_productName,3);
         BrowserUtilities.verifyElementDisplayed(ypsp.textbox_productName);
         BrowserUtilities.verifyElementDisplayed(ypsp.textbox_price);
         BrowserUtilities.verifyElementDisplayed(ypsp.textbox_stock);
         BrowserUtilities.verifyElementDisplayed(ypsp.dropDown_unit);
    }
    @When("product is clicked")
    public void product_is_clicked() {
         JSUtils.clickElementByJS(ypsp.products.get(0));
         BrowserUtilities.writeDataToIdsFile("product",ypsp.products.get(0).getText());
    }
    @Then("update-delete page is displayed")
    public void update_delete_page_is_displayed() {
         BrowserUtilities.verifyElementDisplayed(ypsp.button_update);
         BrowserUtilities.verifyElementDisplayed(ypsp.button_delete);
    }
    @Then("Product information should be able to be changed on this page")
    public void product_information_should_be_able_to_be_changed_on_this_page() {
        String oldInfo1 = ypsp.textbox_price.getText();
        ypsp.textbox_price.clear();
        String newInfo1 = faker.number().digits(2);
        ypsp.textbox_price.sendKeys(newInfo1);
        Assert.assertNotEquals(oldInfo1,newInfo1);

        String oldInfo2 = ypsp.textbox_stock.getText();
        ypsp.textbox_stock.clear();
        String newInfo2 = faker.number().digits(2);
        ypsp.textbox_stock.sendKeys(newInfo2);
        Assert.assertNotEquals(oldInfo2,newInfo2);

        String oldInfo3 = ypsp.dropDown_unit_edit.getText();
        ypsp.dropDown_unit.sendKeys("Feet");
        Assert.assertNotEquals(oldInfo3,"Feet");



    }
    @Then("Organic, trade buttons should be functional")
    public void organic_trade_buttons_should_be_functional() {
         JSUtils.clickElementByJS(ypsp.checkBox_organic);
         JSUtils.clickElementByJS(ypsp.button_update);
         BrowserUtilities.waitFor(3);
         String currentTitle = Driver.getDriver().getCurrentUrl();
         Driver.getDriver().navigate().to("https://test.urbanicfarm.com/home");

         BrowserUtilities.waitForPageToLoad(5);

         Boolean founded = false;
             for (int i = 1; i < homePage.pageNumbers.size(); i++) {
                 BrowserUtilities.waitFor(2);
                 for (int j = 0; j < homePage.productNames.size(); j++) {
                     System.out.println(homePage.productNames.get(j).getText());
                     System.out.println(BrowserUtilities.readDataFromIdsFile("product"));
                     if (homePage.productNames.get(j).getText().equals(BrowserUtilities.readDataFromIdsFile("product"))) {
                         founded = true;
                         break;
                     }
                     if(founded==true){
                         break;
                     }

                 }
                 if(founded == false){
                     JSUtils.clickElementByJS(homePage.pageNumbers.get(i));
                 }else {
                     break;
                 }

             }

        WebElement product1 = Driver.getDriver().findElement(By.xpath("//p[text()='"+BrowserUtilities.readDataFromIdsFile("product")+"' and @class='m-0 mb-1 text-start text-white ProductCard_productTitle__3K4rg']/../../.."));
         BrowserUtilities.verifyElementDisplayed(product1);
         Assert.assertTrue(product1.getDomProperty("textContent").contains(BrowserUtilities.readDataFromIdsFile("product")));
         WebElement product2 = Driver.getDriver().findElement(By.xpath("//*[text()='"+BrowserUtilities.readDataFromIdsFile("product")+"' and @class='ProductCard_productTitle__3K4rg']/../../div[@class='row d-flex justify-content-center']/button"));
         BrowserUtilities.verifyElementDisplayed(product2);
        System.out.println("Done");


    }
    @Then("Update-Delete buttons should be functional")
    public void update_delete_buttons_should_be_functional() {
        BrowserUtilities.verifyElementClickable(ypsp.button_update);

        BrowserUtilities.verifyElementClickable(ypsp.button_delete);





    }
    @When("update option is clicked")
    public void update_option_is_clicked() {
        JSUtils.clickElementByJS(ypsp.button_update);


    }
    @Then("{string} alert should be displayed")
    public void alert_should_be_displayed(String string) {
         
    }
    @When("delete button is clicked")
    public void delete_button_is_clicked() {

        JSUtils.clickElementByJS(ypsp.button_delete);
        BrowserUtilities.waitForVisibility(ypsp.button_no,3 );
        BrowserUtilities.verifyElementDisplayed(ypsp.button_no);
        JSUtils.clickElementByJS(ypsp.button_no);
    }
    @Then("Yes No options should appear and One of the Yes No options should be selected.")
    public void yes_no_options_should_appear_and_one_of_the_yes_no_options_should_be_selected() {
        BrowserUtilities.waitForVisibility(ypsp.button_no,3 );
        BrowserUtilities.verifyElementDisplayed(ypsp.button_no);
        BrowserUtilities.verifyElementDisplayed(ypsp.button_yes);
    }
    @Then("No option should cancel the operation")
    public void no_option_should_cancel_the_operation() {
        JSUtils.clickElementByJS(ypsp.button_no);
        BrowserUtilities.waitFor(3);
         BrowserUtilities.verifyElementNotDisplayed(ypsp.button_no);
    }
    @Then("Yes option should remove the product from the page.")
    public void yes_option_should_remove_the_product_from_the_page() {
        JSUtils.clickElementByJS(ypsp.button_delete);
        BrowserUtilities.waitFor(10);
        BrowserUtilities.waitForVisibility(ypsp.button_yes,3);
         JSUtils.clickElementByJS(ypsp.button_yes);

    }
    @Then("alert should be displayed.")
    public void alert_should_be_displayed() {
         BrowserUtilities.verifyElementDisplayed(ypsp.alert);
         //String expectedResult = "You don't have any requested product.";
        // Assert.assertEquals(expectedResult,ypsp.alert.getDomProperty("textContent"));
   
    }


}

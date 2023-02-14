package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US_047_StepDef_BT {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @Given("user login as Buyer")
    public void user_login_as_buyer() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver().manage().window().maximize();
        BrowserUtilities.clickWithJS(homePage.button_login);
        loginPage.textbox_email.sendKeys(ConfigurationReader.getProperty("buyerEmail"));
        loginPage.textbox_password.sendKeys(ConfigurationReader.getProperty("buyerPassword"));
        BrowserUtilities.clickWithJS(loginPage.button_login);
        BrowserUtilities.clickWithJS(homePage.sign_cancel);
        BrowserUtilities.waitFor(3);

    }
    @Given("Account must be clickable")
    public void account_must_be_clickable() {

        BrowserUtilities.verifyElementClickable(homePage.button_account);
    }
    @When("Account is clicked, Qr code, Full name, Email, Phone should be seen.")
    public void account_is_clicked_qr_code_full_name_email_phone_should_be_seen() throws InterruptedException {
        JSUtils.clickElementByJS(homePage.button_account);
        BrowserUtilities.verifyElementDisplayed(accountPage.qrCode);
        BrowserUtilities.verifyElementDisplayed(accountPage.firstName);
        BrowserUtilities.verifyElementDisplayed(accountPage.email);
        BrowserUtilities.verifyElementDisplayed(accountPage.textbox_phone);


    }
    @When("Copy button should be functional")
    public void copy_button_should_be_functional() {
        BrowserUtilities.waitForVisibility(accountPage.button_copy,3);
        accountPage.button_copy.click();
        BrowserUtilities.waitForVisibility(accountPage.message_toast,3);
        String actualMessage = accountPage.message_toast.getText();
        System.out.println(actualMessage);
        String expectedMessage = "Copied!";
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    @When("Download button should be functional")
    public void download_button_should_be_functional() {
        if(BrowserUtilities.fileIsExist(System.getProperty("user.home")+"/Downloads","QRCode.png")){
            BrowserUtilities.deleteFile(System.getProperty("user.home")+"/Downloads","QRCode.png");
        }
        accountPage.button_download.click();
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(BrowserUtilities.fileIsExist(System.getProperty("user.home")+"/Downloads","QRCode.png"));
    }
    @When("Edit button should be clickable")
    public void edit_button_should_be_clickable() {

        accountPage.button_edit.click();
        BrowserUtilities.waitFor(2);
        BrowserUtilities.verifyElementDisplayed(accountPage.button_save);
        BrowserUtilities.verifyElementDisplayed(accountPage.button_chooseFile);


    }
    @When("Choose file button should be functional and The file should be selected when the choose file button is clicked.")
    public void choose_file_button_should_be_functional_and_the_file_should_be_selected_when_the_choose_file_button_is_clicked() {
         List<String> list = new ArrayList<>();
         list.addAll(Arrays.asList("tinkywinky.png","dipsy.png","laalaa.png","po.png"));
         BrowserUtilities.waitFor(3);

         String randomPicFirst = BrowserUtilities.giveMeRandomPic(list);
         String firstPic = System.getProperty("user.dir")+"/src/test/resources/userLogo/"+randomPicFirst;
         accountPage.button_chooseFile.sendKeys(firstPic);
         BrowserUtilities.screenShotWebElement(accountPage.picture,"target/firstImage.png");

         BrowserUtilities.waitFor(3);

         String secondPic = System.getProperty("user.dir")+"/src/test/resources/userLogo/"+BrowserUtilities.giveMeRandomPic(list,randomPicFirst);
         accountPage.button_chooseFile.sendKeys(secondPic);
         BrowserUtilities.screenShotWebElement(accountPage.picture,"target/secondImage.png");

    }

    @When("The account photo should change after selected file")
    public void the_account_photo_should_change_after_selected_file() {
        boolean assertImageAreDifferent = BrowserUtilities.assertImageAreDifferent("target/firstImage.png","target/secondImage.png");
        Assert.assertTrue(assertImageAreDifferent);
    }
    @When("After clicking the Edit button, the phone menu should be updated")
    public void after_clicking_the_edit_button_the_phone_menu_should_be_updated() {
        BrowserUtilities.cleanTextInBox(accountPage.textbox_phone);
        Faker faker = new Faker();

        String firstNumber = accountPage.textbox_phone.getAttribute("value");
        String phoneNumber = "1" + faker.number().digits(10);
        if(firstNumber==phoneNumber){
            BrowserUtilities.cleanTextInBox(accountPage.textbox_phone);
            phoneNumber = "1" + faker.number().digits(10);
        }

        accountPage.textbox_phone.sendKeys(phoneNumber);

    }
    @When("Save button should be functional")
    public void save_button_should_be_functional() {
        BrowserUtilities.waitForVisibility(accountPage.button_save,3);
        BrowserUtilities.verifyElementClickable(accountPage.button_save);
    }
    @Then("After clicking the Save button, {string} should be displayed")
    public void after_clicking_the_save_button_should_be_displayed(String string) {
         BrowserUtilities.waitForVisibility(accountPage.button_save,3);
         BrowserUtilities.clickWithJS(accountPage.button_save);
         BrowserUtilities.waitFor(3);
         Assert.assertEquals(string,accountPage.message_toast.getText());
    }
    @Then("Toogle the menu botton be functional")
    public void toogle_the_menu_botton_be_functional() {
         BrowserUtilities.waitForVisibility(accountPage.toogle,3);
         BrowserUtilities.verifyElementClickable(accountPage.toogle);
    }
    @Then("Clicking the menu button on the Toogle should change the menu dimensions")
    public void clicking_the_menu_button_on_the_toogle_should_change_the_menu_dimensions() {
        String before = accountPage.toogle.getCssValue("left");
        System.out.println(before);
        BrowserUtilities.clickWithJS(accountPage.toogle);
        BrowserUtilities.waitFor(2);
        String after = accountPage.toogle.getCssValue("left");
        System.out.println(after);
        Assert.assertNotEquals(before,after);
        Driver.closeDriver();
    }
}

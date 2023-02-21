package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class US_048_StepDef_MY {
    Random random=new Random();
    Faker faker=new Faker();
    Actions action=new Actions(Driver.getDriver( "https://test.urbanicfarm.com/" ));
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    AddressPage addressPage= new AddressPage();
    String digits;
    int i;
    @And("user enter {string} and {string} as login credentials and clicks login")
    public void userEnterAndAsLoginCredentialsAndClicksLogin(String email, String password) {
        loginPage.textbox_email.sendKeys(email);
        loginPage.textbox_password.sendKeys(password);
        loginPage.button_login.click();

    }

    @Then("user logged in and sees {string}")
    public void userLoggedInAndSees(String adressMessage) {
        String actualMessage = homePage.adressMessageText.getText();
        System.out.println(actualMessage);
        Assert.assertEquals("messages not same",adressMessage,actualMessage);

    }

    @And("the user clicks here to go adress")
    public void theUserClicksToGoAdress() {
        BrowserUtilities.waitFor(3);
        homePage.linkAdress.click();
        BrowserUtilities.waitFor(2);
       // Driver.getDriver().navigate().to("https://test.urbanicfarm.com/account/address");
      //Driver.getDriver().navigate().back();
    }

    @And("the user is on the Adress page")
    public void theUserIsOnTheAdressPage() {
        String actualUrl = Driver.getDriver( "https://test.urbanicfarm.com/" ).getCurrentUrl();
        String expectedUrl= "https://test.urbanicfarm.com/account/address";
     Assert.assertEquals("not matched",expectedUrl,actualUrl);

    }

    @When("the user clicks on {string}")
    public void theUserClicksOn(String AdressButton) {
        addressPage.button_addNewAddress.click();
    }

    @Then("the user sees the search box")
    public void theUserSeesTheSearchBox() {
     addressPage.textBox_searchPlaces.click();

    }

    @And("the user clicks there and writes five digits to search adress")
    public void theUserClicksThereAndWritesFiveDigitsToSearchAdress() {
         digits = faker.number().digits(5);
        addressPage.textBox_searchPlaces.sendKeys(digits);
        BrowserUtilities.waitFor(2);


    }

    @Then("the user should see relevant adresses in dropdown bar")
    public void theUserShouldSeeRelevantAdressesInDropdownBar() {


        List<WebElement> ListAdresses_dropdown = addressPage.adresses_dropdown;
        int size = addressPage.adresses_dropdown.size();
        int i = random.nextInt(size);
        WebElement adress_got = ListAdresses_dropdown.get(i);



        Assert.assertTrue("not appeared",adress_got.isDisplayed());
      BrowserUtilities.waitFor(3);


    }

    @When("the user clicks one of the adress and gets adress details box containing five digits code")
    public void theUserClicksOneOfTheAdressAndGetsAdressDetailsBoxContainingFiveDigitsCode() {
        //action.moveToElement(addressPage.adresses_dropdown.get(0)).click().perform();
       // String expected_adress = addressPage.adresses_dropdown.get(0).getText();
       // System.out.println(expected_adress);

        WebElement adress_got = addressPage.adresses_dropdown.get(i);
        action.moveToElement(adress_got).click().perform();
        String  actualAddress = addressPage.address_Bar.getAttribute("value");

        System.out.println(actualAddress);
        Assert.assertTrue(actualAddress.contains(digits));


    }

    @Then("the user clicks cancel and returns to adress page")
    public void theUserClicksCancelAndReturnsToAdressPage() {
      addressPage.button_cancel.click();
      BrowserUtilities.waitFor(2);
        String currentUrl = Driver.getDriver( "https://test.urbanicfarm.com/" ).getCurrentUrl();
        String expectedUrl="https://test.urbanicfarm.com/account/address";
        Assert.assertEquals("not on adress page",expectedUrl,currentUrl);
       addressPage.logout_button.click();
      Driver.closeDriver();
    }
}

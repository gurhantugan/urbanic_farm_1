package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_010_StepDef_ED {
    HomePage homePage = new HomePage();

    @Given("User is on the Urbanic_Farm page")
    public void user_is_on_the_urbanic_farm_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver().manage().window().maximize();
    }


    @And("User clickable the sell your produce button")
    public void userClickableTheSellYourProduceButton() throws InterruptedException{
        BrowserUtilities.waitFor(3);
        homePage.button_shellYourProduct.click();



    }
}
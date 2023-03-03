package stepDefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class US_023_StepDef_MY {
    HomePage homePage = new HomePage();

    @Given("user goes to bottom of the page")
    public void user_goes_to_bottom_of_the_page() {
        Actions goBottom = new Actions(Driver.getDriver());
        goBottom.sendKeys(Keys.END).perform();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @When("user clicks on Terms Of Service")
    public void the_user_clicks_on_terms_of_service() throws InterruptedException {
        homePage.termsOfServiceLink.click();
        Thread.sleep(2000);


    }
}

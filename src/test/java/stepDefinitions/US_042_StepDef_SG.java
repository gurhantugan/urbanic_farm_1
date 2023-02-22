package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.Driver;

public class US_042_StepDef_SG extends CommonPage {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    Actions actions = new Actions(Driver.getDriver());

    @Then("User moves on to Events button")
    public void user_moves_on_to_events_button() {
        actions.moveToElement(registerPage.button_Events).perform();

    }

    @Then("User asserts the event page is displayed")
    public void user_asserts_the_event_page_is_displayed() {
        Assert.assertTrue(registerPage.button_eventRegister.isDisplayed());

    }

}

package stepDefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_007_StepDef_SK extends HomePage {

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));

    }
    @When("user enter the Login button")
    public  void user_enter_the_login_button() {
        button_navbarLogin.click();


    }
    @Then("user should able to see relevant email and password page")
    public void user_should_able_to_see_relevant_email_and_password_page() {
        box_email.getText();

       // Driver.getDriver().close();
    }

}

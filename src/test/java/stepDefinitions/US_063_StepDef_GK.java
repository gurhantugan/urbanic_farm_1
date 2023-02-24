package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_063_StepDef_GK {

     LoginPage loginPage=new LoginPage();

    @Given("User enter to Home Page")
    public void user_enter_to_home_page() {
       // Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
       // Driver.getDriver().manage().window().maximize();

    }

    @When("User see and click the login button")
    public void user_see_and_click_the_login_button() {


    }



    @Then("User enters buyer valid email address")
    public void user_enters_buyer_valid_email_address() {


    }
    @Then("User enters buyer valid password")
    public void user_enters_buyer_valid_password() {


    }

    @Then("User click the login button")
    public void user_click_the_login_button() {

    }

    @Then("User see {string} message on screen")
    public void user_see_message_on_screen(String string) {

    }


}

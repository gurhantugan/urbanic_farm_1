package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigurationReader;
import utilities.Driver;

public class MyStepdefs {
    @Given("User goes to Home Page")
    public void userGoesToHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
    }

    @Then("User Asserts accessibility")
    public void userAssertsAccessibility() {
    }
}

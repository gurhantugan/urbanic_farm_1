import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigurationReader;

import static stepDefinitions.Hooks.driver;

public class MyStepdefs {
    @Given("User goes to Home Page")
    public void userGoesToHomePage() {
        driver.get(ConfigurationReader.getProperty("baseUrl"));
    }

    @Then("User Asserts accessibility")
    public void userAssertsAccessibility() {
    }
}

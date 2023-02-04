package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class US_003_StepDef_GB {
    @Given("user is on the Urbanic_Farm page")
    public void user_is_on_the_urbanic_farm_page() {
        Driver.getDriver().get("https://test.urbanicfarm.com/");
        throw new io.cucumber.java.PendingException();
    }
    @When("The user clicks on Blog button")
    public void the_user_clicks_on_blog_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should go to relevant page with {string}")
    public void user_should_go_to_relevant_page_with(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

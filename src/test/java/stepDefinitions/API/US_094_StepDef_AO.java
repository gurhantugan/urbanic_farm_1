package stepDefinitions.API;

import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.response;

public class US_094_StepDef_AO {
    String token;

    @Then("User gets all existing hubs' information")
    public void userGetsAllExistingHubsInformation() {

        response = given().spec(requestSpecification(token)).post("account/hub/getMyHubs");
        response.prettyPrint();
    }
}

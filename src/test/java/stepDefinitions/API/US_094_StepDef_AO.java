package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.response;

public class US_094_StepDef_AO {
    String token;
    Response response;

    @Then("User gets all existing hubs' information")
    public void userGetsAllExistingHubsInformation() {

        response = given().contentType(ContentType.JSON).spec(requestSpecification(USER.SELLER.getToken())).post("/account/hub/getMyHubs");
        response.prettyPrint();
    }
}

package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.Then;
import utilities.ApiUtilities;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.response;

public class US_095_StepDef_HG {
    String token = ApiUtilities.loginWithAPI(USER.SELLER.getEmail(), USER.SELLER.getPassword());
    @Then("User gets Hub create")
    public void userGetsHubCreate() {
        response = given().spec(requestSpecification(token)).post("account/hub/create");
        response.prettyPrint();
    }
}

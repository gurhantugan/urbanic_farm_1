package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.response;

public class US_108_StepDef_MO {

    String token;

    @Then("User get all events detail")
    public void user_get_all_events_detail() {

        response = given().spec(requestSpecification(USER.SELLER.getToken())).post("https://test.urbanicfarm.com/api/public/getAllEvents");
        response.prettyPrint();

    }


}

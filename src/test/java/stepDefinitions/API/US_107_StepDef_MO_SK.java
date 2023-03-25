package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.response;

public class US_107_StepDef_MO_SK {



    @Then("User recieve all notifications")
    public void user_recieve_all_notifications() {


        response = given().spec(requestSpecification(USER.SELLER.getToken())).post("https://test.urbanicfarm.com/api/account/notifications/getAll");
        response.prettyPrint();


    }


}

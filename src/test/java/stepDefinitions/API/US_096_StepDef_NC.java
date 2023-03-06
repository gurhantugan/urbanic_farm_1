package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ApiUtilities;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.response;


public class US_096_StepDef_NC {

    String token;

    @Given("User logs in as as seller with API")
    public void userLogsInAsAsSellerWithAPI() {
        token = ApiUtilities.loginWithAPI(USER.SELLER.getEmail(), USER.SELLER.getPassword());

    }

    @Then("User gets Hub info")
    public void userGetsHubInfo() {
        response = given().spec(requestSpecification(token)).post("account/hub/getHubDetails/VEGETABLES_AND_FRUITS_HUB");
        response.prettyPrint();

    }




}

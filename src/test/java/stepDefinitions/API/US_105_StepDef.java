package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtilities;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_105_StepDef {

    String token;

    Response response;
    @Given("User logs in API for notification")
    public void userLogsInAPIForNotification() {
        token = ApiUtilities.loginWithAPI(USER.SELLER.getEmail(), USER.SELLER.getPassword());
    }

    @Then("User get all conversations")
    public void userGetAllConversations() {
        response = given().spec(requestSpecification(token)).post("/chat/getConversations");
    }

    @And("user verifies that the response is expected.")
    public void userVerifiesThatTheResponseIsExpected() {
        Assert.assertEquals(200, response.getStatusCode());

        response.prettyPrint();
    }
}

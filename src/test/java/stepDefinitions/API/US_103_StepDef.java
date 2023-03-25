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
import static utilities.ApiUtilities.response;

public class US_103_StepDef {

    String token;

    Response response;

    @Given("The user connects to the {string} api")
    public void theUserConnectsToTheApi(String str) {
        token = ApiUtilities.loginWithAPI(USER.SELLER_1.getEmail(), USER.SELLER_1.getPassword());
    }

    @Then("user connects to the getBasketDetails")
    public void userConnectsToTheGetBasketDetails() {
        response = given().spec(requestSpecification(token)).post("/public/basket/getBasketDetails");
        response.prettyPrint();
    }

    @And("user verifies that the status code is {int}")
    public void userVerifiesThatTheStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());

    }


}

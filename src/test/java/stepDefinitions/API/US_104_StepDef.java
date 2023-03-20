package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_104_StepDef {
    Response response;

    String token;



    @And("The user connects to the getMyBuys api")
    public void theUserConnectsToTheGetMyBuysApi() {
        response = given().spec(requestSpecification(USER.SELLER)).post("/account/order/get/myBuys");
       // response.prettyPrint();
    }

    @And("The user verifies seller ids numbers more than one")
    public void theUserVerifiesSellerIdsNumbersMoreThanOne() {
        List<Object> id = response.jsonPath().getList("id");
        for (int i = 0; i <id.size(); i++) {
            System.out.println(id.get(i));

        }
        Assert.assertTrue(id.size()>=1);

    }

    @And("The user verifies that the status code is {int}")
    public void theUserVerifiesThatTheStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }
}

package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;


public class US_122_NC_StepDef {

    Response response;
    String token;

    @Given("The user connects to the {string} api.")
    public void theUserConnectsToTheApi(String abc) {
        token = ApiUtilities.loginWithAPI(USER.SELLER.getEmail(), USER.SELLER.getPassword());


    }

    @And("The user connects to the getWeekly api")
    public void theUserConnectsToTheGetWeeklyApi() {
        response = given().spec(requestSpecification(USER.SELLER)).post("account/weeklyorder/getWeeklyOrderList");
        response.prettyPrint();
    }

    /*@And("The user verifies buyer ids numbers more than one")
    public void theUserVerifiesBuyerIdsNumbersMoreThanOne() {
        List<Object> id = response.jsonPath().getList("id");
        for (int i = 0; i <id.size(); i++) {
            System.out.println(id.get(i));

        }
        Assert.assertTrue(id.size()>=1);
    }*/

    @And("The user verifies that the status code is {int}.")
    public void theUserVerifiesThatTheStatusCodeIs(int arg0) {
        Assert.assertEquals(200, response.getStatusCode());
    }
}

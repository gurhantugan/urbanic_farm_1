package stepDefinitions.API;

import enums.USER;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;


public class US_095_StepDef_Grupca {
    Response response;
    @Given("user connects to the {string} with token and payload")

    public void userConnectsToTheWithTokenAndPayload(String endpoint, DataTable dataTable) {
        Map<String,String> payload= dataTable.asMaps().get(0);
        response = given().contentType(ContentType.JSON).spec(requestSpecification(USER.SELLER.getToken()))
                .body(payload).post(endpoint);
        response.prettyPrint();
       // response.prettyPeek();





    }

    @Then("user verifies that the response is as expected status code")
    public void userVerifiesThatTheResponseIsAsExpectedStatusCode() {
        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertEquals("You already have this hub. Try to update it.",response.jsonPath().getString("descr"));
    }
}

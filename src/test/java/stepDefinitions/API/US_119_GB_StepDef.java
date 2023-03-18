package stepDefinitions.API;

import enums.USER;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.requestSpecification2;

public class US_119_GB_StepDef {
    Response response;
    @Given("user connects to the {string} with payload and token")
    public void userConnectsToTheWithPayloadAndToken(String endpoint, DataTable dataTable) {
        Map<String, String> payload = dataTable.asMaps().get(0);

        System.out.println("payload = " + payload);

        response = given().contentType(ContentType.JSON).spec(requestSpecification(USER.SELLER.getToken()))
                .body(payload).post(endpoint);
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }

    @Then("user asserts that the response is as expected")
    public void userAssertsThatTheResponseIsAsExpected() {
        Assert.assertEquals(true, response.jsonPath().getBoolean("success"));
        Assert.assertEquals("Event marked as completed", response.jsonPath().getString("descr"));
    }


}

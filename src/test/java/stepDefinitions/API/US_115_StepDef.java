package stepDefinitions.API;
import enums.USER;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.ApiUtilities;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static stepDefinitions.API.US_086_NC_StepDef.requestSpecification;
import static utilities.ApiUtilities.response;
public class US_115_StepDef {
    Response response;
    @Given("user logs in by token and goes {string} with payload")
    public void userLogsInByTokenAndGoesWithPayload(String endPoint, DataTable dataTable) {
        Map<String, String> payload = dataTable.asMaps().get(0);
//        Map<String, Object> payload = new HashMap<>();
//        payload.put("title", "Kemal Gulen");
//        payload.put("date", "2023-04-10T15:00");
//        payload.put("fee", 120);
//        payload.put("duration", 60);
//        payload.put("attendeeLimit", 20);
//        payload.put("addressId", 724);
//        payload.put("tac","Merhaba");

        response = given().contentType(ContentType.JSON).spec(requestSpecification(USER.SELLER.getToken()))
                .body(payload).post(endPoint);
        response.prettyPrint();
    }
    @Then("user verifies that the response is as expected in create event is as expected")
    public void userVerifiesThatTheResponseIsAsExpectedInCreateEventIsAsExpected(DataTable dataTable) {
        List<String> paths = dataTable.column(0);
        List<String> expectedData = dataTable.column(1);

        for (int i = 0; i < expectedData.size(); i++) {

            Assert.assertEquals(expectedData.get(i), response.jsonPath().getString(paths.get(i)));
            System.out.println("Expected data = " + expectedData.get(i) + " - Actual Data = " + response.jsonPath().getString(paths.get(i)).toString());
        }
    }
}

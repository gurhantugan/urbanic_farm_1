package stepDefinitions.API;

import enums.USER;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;

public class US_101_StepDef {

    Response response;

    @Given("user connects to {string} with payload and token")
    public void userConnectsToWithPayloadAndToken(String endPoint, DataTable dataTable) {
        Map<String, String> payload = dataTable.asMaps().get(0);

        System.out.println("payload = " + payload);

        response = given().contentType(ContentType.JSON).spec(requestSpecification(USER.SELLER.getToken()))
                .body(payload).post(endPoint);
        response.prettyPrint();
        System.out.println(response.getStatusCode());

    }
}

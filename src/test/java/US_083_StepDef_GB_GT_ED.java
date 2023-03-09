import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.token;

import io.cucumber.datatable.DataTable;

public class US_083_StepDef_GB_GT_ED<Datatable> {
    Response response;


    @Given("user connects to the {string} with payload")
    public void userConnectsToTheWithPayload(String endpoint, DataTable dataTable) {
        Map<String, String> payload = dataTable.asMaps().get(0);


        response = given().contentType(ContentType.JSON)
                .body(payload).post(endpoint);
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
    }
package stepDefinitions.API;

import enums.USER;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.response;


public class US_084_StepDef_HA_GB_GT {
        Response response;
        @Given("user connects to the {string} with payload and token2")
        public void userConnectsToTheWithPayloadAndToken2(String endpoint) {
            // Map<String, String> payload = table.asMap();
            Map<String, Integer> payload = new HashMap<String, Integer>();
            payload.put("sellerId", 1484);
            response = given().contentType(ContentType.JSON).spec(requestSpecification(USER.SELLER.getToken()))
                    .body(payload).post(endpoint);
            response.prettyPrint();
        }


        @And("user verifies that the response is expected")
        public void userVerifiesThatTheResponseIsExpected(DataTable dataTable) {

            List<String> paths = dataTable.column(0);
            List<String> expectedData = dataTable.column(1);

            for (int i = 0; i < expectedData.size() ; i++) {
                Assert.assertEquals(expectedData.get(i), response.jsonPath().getString(paths.get(i)));
                System.out.println("Expected data = " + expectedData.get(i) + " - Actual Data = " + response.jsonPath().getString(paths.get(i)).toString());

            }


        }
    }














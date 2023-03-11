package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.*;

import io.cucumber.datatable.DataTable;

public class US_083_StepDef_GB_GT_ED {

    Response response;

    /* @Given("user connects to the {string} with payload")
     public void userConnectsToTheWithPayload(String endpoint, DataTable dataTable) {

         Map<String, String> payload = dataTable.asMaps().get(0);

         System.out.println("payload = " + payload);

         response = given().contentType(ContentType.JSON).spec(requestSpecification2())
                  .body(payload).post(endpoint);
         response.prettyPrint();
          System.out.println(response.getStatusCode());
     }*/
    @Given("user connects to the {string} with payload")
    public void userConnectsToTheWithPayload(String endpoint) {

        Map<String, String> payload = new HashMap<>();
        payload.put("email", "abc@def.com");
        payload.put("message", "Hello world");
        payload.put("name", "John Smith");
        payload.put("subject", "Tomato");

        System.out.println("payload = " + payload);

        response = given().contentType(ContentType.JSON).spec(requestSpecification2())
                .body(payload).post(endpoint);
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }

}
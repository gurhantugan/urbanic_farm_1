package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ApiUtilities;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_091_StepDef_NC {
    String token ;
    Response response;


    @Given("The user connects to the api")
    public void theUserConnectsToTheApi() {

        String map = "{\n" +
                "  \"availability\": \"02:00-03:00\",\n" +
                "  \"deliveryType\": [\n" +
                "    \"BUYER_PICKUP\"\n" +
                "  ]\n" +
                "}";
        response = given()
                .contentType(ContentType.JSON).when().
                auth().oauth2(token)
                .body(map).post("/account/change/delivery");


        System.out.println("Status Code =" + response.getStatusCode());
        System.out.println("ContentType=" + response.getContentType());
        System.out.println("show info = " + response.prettyPrint());
    }
}

package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.requestSpecificationWithoutToken;

public class US_091_StepDef_NC {

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
                .contentType(ContentType.JSON).spec(requestSpecificationWithoutToken())
                .body(map).post("/account/change/delivery");


        System.out.println("Status Code =" + response.getStatusCode());
        System.out.println("ContentType=" + response.getContentType());
        System.out.println("show info = " + response.prettyPrint());
    }
}

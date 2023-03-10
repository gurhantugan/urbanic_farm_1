package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ApiUtilities;

import static io.restassured.RestAssured.given;

public class US_091_StepDef_NC {
    String token = ApiUtilities.loginWithAPI(USER.BUYER2.getEmail(), USER.BUYER.getPassword());
    Response response;
    String endPoint;

    @Given("The user connects to the api")
    public void theUserConnectsToTheApi() {
        endPoint = "https://test.urbanicfarm.com/api/account/change/delivery";
        String body = "{\n" +
                "  \"availability\": \"02:00-03:00\",\n" +
                "  \"deliveryType\": [\n" +
                "    \"BUYER_PICKUP\"\n" +
                "  ]\n" +
                "}";
        response = given()
                .contentType(ContentType.JSON)
                .when().auth().
                oauth2(token)
                .body(body)
                .post(endPoint);



        System.out.println("Status Code =" + response.getStatusCode());
        System.out.println("ContentType=" + response.getContentType());
        System.out.println("show info = " + response.prettyPrint());
    }
}

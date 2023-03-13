package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;

public class US_084_StepDef_HA_GB_GT {


    public class US_084_HA_GB_GT_StepDef {
        Response response;
        @Given("user connects to the {string} with payload and token")
        public void userConnectsToTheWithPayloadAndToken(String endpoint) {
            // Map<String, String> payload = table.asMap();
            Map<String, Integer> payload = new HashMap<String, Integer>();
            payload.put("sellerId", 1484);
            response = given().contentType(ContentType.JSON).spec(requestSpecification(USER.SELLER.getToken()))
                    .body(payload).post(endpoint);
            response.prettyPrint();
        }


        @And("user verifies that the response is expected")
        public void userVerifiesThatTheResponseIsExpected() {
//        Assert.assertEquals(true, response.jsonPath().getString("success"));
            Integer rate = Integer.parseInt(response.jsonPath().getString("productFeedback[0].rate"));
            Assert.assertEquals(Optional.of(5), rate);

//        Assert.assertEquals(true, response.jsonPath().getString("success"));
//        Assert.assertEquals(true, response.jsonPath().getString("success"));
//
//
//        System.out.println(response.jsonPath().getString("success"));
            System.out.println(response.jsonPath().getString("productFeedback[0].rate"));
//        System.out.println(response.jsonPath().getString("productFeedback.firstName"));
//        System.out.println(response.jsonPath().getString("productFeedback.userEmail"));
        }
    }


    }











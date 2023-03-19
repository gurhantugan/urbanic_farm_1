package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import utilities.ApiUtilities;
import utilities.BrowserUtilities;
import utilities.JSUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_092_Stepdef_AK {

    String token;
    Response response;
    String endpoint = "https://test.urbanicfarm.com/api/account/change/delivery";

    @Given("user logs in with api for product.")
    public void userLogsInWithApiForProduct() {
        token = ApiUtilities.loginWithAPI(USER.ALI.getEmail(), USER.ALI.getPassword());
    }

    @When("changes availability for seller to deliver products")
    public void changesAvailabilityForSellerToDeliverProducts() {

        Map<String, Object> body = new HashMap<>();

        List<String> deliverTypeList = new ArrayList<>();
        deliverTypeList.add("SELLER_DELIVERY");

        body.put("deliveryType", deliverTypeList);

        List<String> estimatedDeliveryTimeList = new ArrayList<>();
        estimatedDeliveryTimeList.add("120_3");

        body.put("estimatedDeliveryTime", estimatedDeliveryTimeList);

        body.put("freeDeliveryRange", 100);
        body.put("maxDeliveryRange", 30);
        body.put("minFreeDeliveryOrder", 5);
        body.put("perMileCost", 1);


        response = given()
                .contentType(ContentType.JSON)
                .auth()
                .oauth2(USER.ALI.getToken())
                .body(body)
                .post(endpoint);

        response.prettyPrint();

    }

    @When("user verifies the product add status code is {int}.")
    public void userVerifiesTheProductAddStatusCodeIs(int statusCode) {

        Assert.assertEquals(statusCode,response.getStatusCode());
        System.out.println(response.statusCode());
    }




//    @Test
//    public void stringBody() {
//        String body = "{\n" +
//                "    \"availability\": \"\",\n" +
//                "    \"availabilityBranch\": \"\",\n" +
//                "    \"deliveryType\": [\n" +
//                "        \"SELLER_DELIVERY\"\n" +
//                "    ],\n" +
//                "    \"estimatedDeliveryTime\": [\n" +
//                "        \"50_3\"\n" +
//                "    ],\n" +
//                "    \"flexibleDeliveryOptions\": [],\n" +
//                "    \"freeDeliveryRange\": 100,\n" +
//                "    \"maxDeliveryRange\": 50,\n" +
//                "    \"minFreeDeliveryOrder\": 588,\n" +
//                "    \"perMileCost\": \"5\"\n" +
//                "}";
//
//        response = given()
//                .contentType(ContentType.JSON)
//                .auth()
//                .oauth2(USER.ALI.getToken())
//                .body(body)
//                .post(endpoint);
//
//        response.prettyPrint();
//
//    }
}

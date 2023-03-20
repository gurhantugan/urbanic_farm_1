package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_093_StepDef_GB_HA_ED_GT {

    Response response;
    String endpoint="account/change/delivery";


    @When("changes availability for seller flexible delivery.")
    public void changesAvailabilityForSellerFlexibleDelivery() {
        Map<String, Object> payload=new HashMap<>();

List<Object> deliveryType=new ArrayList<>();
deliveryType.add("SELLER_FLEXIBLE");

Map<String, Integer> deliveryTime=new HashMap<>();
deliveryTime.put("deliveryBy",5);
deliveryTime.put("orderBegin",1);
deliveryTime.put("orderEnd",3);

List<Map<String,Integer>> flexibleDeliveryOpt=new ArrayList<>();
flexibleDeliveryOpt.add(deliveryTime);

payload.put("deliveryType",deliveryType);
payload.put("freeDeliveryRange",5);
payload.put("maxDeliveryRange",55);
payload.put("minFreeDeliveryOrder",10);
payload.put("perMileCost",1);
payload.put("flexibleDeliveryOptions",flexibleDeliveryOpt);


        System.out.println(payload);

//        {
//            "deliveryType": [
//            "SELLER_FLEXIBLE"
//  ],
//            "freeDeliveryRange": 0,
//                "maxDeliveryRange": 0,
//                "minFreeDeliveryOrder": 0,
//                "perMileCost": 0,
//                "flexibleDeliveryOptions": [
//            {
//                "deliveryBy": 0,
//                    "orderBegin": 0,
//                    "orderEnd": 0
//            }
//  ]
//        }

        response=given().contentType(ContentType.JSON).spec(requestSpecification(USER.SELLER.getToken())).
                body(payload).post(endpoint);
        response.prettyPrint();

    }

    @Then("user verifies the success message is true")
    public void userVerifiesTheSuccessMessageIsTrue() {

        Assert.assertTrue(response.jsonPath().getBoolean("success"));
    }
}

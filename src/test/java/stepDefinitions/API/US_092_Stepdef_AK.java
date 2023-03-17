package stepDefinitions.API;

import enums.USER;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_092_Stepdef_AK {

    Response response;
    String endpoint = "https://test.urbanicfarm.com/api/account/change/delivery";

    @Test
    public void stringBody() {
        String body = "{\n" +
                "    \"availability\": \"\",\n" +
                "    \"availabilityBranch\": \"\",\n" +
                "    \"deliveryType\": [\n" +
                "        \"SELLER_DELIVERY\"\n" +
                "    ],\n" +
                "    \"estimatedDeliveryTime\": [\n" +
                "        \"50_3\"\n" +
                "    ],\n" +
                "    \"flexibleDeliveryOptions\": [],\n" +
                "    \"freeDeliveryRange\": 100,\n" +
                "    \"maxDeliveryRange\": 50,\n" +
                "    \"minFreeDeliveryOrder\": 588,\n" +
                "    \"perMileCost\": \"5\"\n" +
                "}";

        response = given()
                .contentType(ContentType.JSON)
                .auth()
                .oauth2(USER.SELLER.getToken())
                .body(body)
                .post(endpoint);

        response.prettyPrint();

    }

    @Test
    public void mapBody() {
        Map<String,Object> body = new HashMap<>();

        List<String> deliverTypeList = new ArrayList<>();
        deliverTypeList.add("SELLER_DELIVERY");

        body.put("deliveryType",deliverTypeList);

        List<String> estimatedDeliveryTimeList = new ArrayList<>();
        estimatedDeliveryTimeList.add("50_3");

        body.put("estimatedDeliveryTime",estimatedDeliveryTimeList);

        body.put("freeDeliveryRange",100);
        body.put("maxDeliveryRange",30);
        body.put("minFreeDeliveryOrder",5);
        body.put("perMileCost",1);


        response = given()
                .contentType(ContentType.JSON)
                .auth()
                .oauth2(USER.SELLER.getToken())
                .body(body)
                .post(endpoint);

        response.prettyPrint();

    }
}

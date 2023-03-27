package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_121_StepDef_MY {

    Response response;

    @Given("user goes to end point and sends the body to get response")
    public void userGoesToEndPointAndSendsTheBodyToGetResponse() {

/*String payload="{\n" +
        "    \"weeklyOrderId\": \"\",\n" +
        "    \"title\": \"mesut2\",\n" +
        "    \"subTotal\": 56,\n" +
        "    \"deliveryCost\": 5,\n" +
        "    \"tip\": 0,\n" +
        "    \"total\": \"61.00\",\n" +
        "    \"type\": \"daily\",\n" +
        "    \"wo_products\": [\n" +
        "        {\n" +
        "            \"id\": 13,\n" +
        "            \"wo_productQuantity\": 7\n" +
        "        }\n" +
        "    ]\n" +
        "}";*/
Map<String,Integer> wopMap=new HashMap<>();
wopMap.put("id", Integer.valueOf(13));
wopMap.put("wo_productQuantity", Integer.valueOf(7));
List<Map> wopList=new ArrayList<>();
wopList.add(wopMap);
Map<String,Object> payload1= new HashMap<>();
payload1.put("weeklyOrderId","");
payload1.put("title","mesut3");
        payload1.put("subTotal","56");
        payload1.put("deliveryCost",5);
        payload1.put("tip",0);
        payload1.put("total","61.00");
        payload1.put("type","daily");
        payload1.put("wo_products",wopList);




         response = given().contentType(ContentType.JSON).spec(ApiUtilities.requestSpecification(USER.SELLER_1_TOKEN)).body(payload1).post("/account/weeklyorder/createWeeklyOrder");
         response.prettyPrint();
        //   response = ApiUtilities.requestSpecification(USER.SELLER_1).contentType(ContentType.JSON).body(payload).post("/account/weeklyorder/createWeeklyOrder");
      //   response.prettyPrint();

    }

    @And("user checks that success true message in response and status code {int}")
    public void userChecksThatSuccessTrueMessageInResponseAndStatusCode(int statusCodeexpected) {
        Assert.assertEquals(statusCodeexpected,response.statusCode());
        Assert.assertTrue(response.jsonPath().getBoolean("success"));
        int idCreatedWD = response.jsonPath().getInt("weekly_order.id");
        System.out.println(idCreatedWD);

    }
}



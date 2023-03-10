package stepDefinitions.API;

import enums.USER;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.junit.Assert;
import utilities.ApiUtilities;
import static utilities.ApiUtilities.requestSpecification;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class US_90_StepDef_MY {
    String token;
    Response response;
    @Given("user logs in with api with Seller_1 credentials")
    public void userLogsInWithApiWithSellerCredentials() {
         token = ApiUtilities.loginWithAPI(USER.SELLER_1.getEmail(), USER.SELLER_1.getPassword());

    }



    @When("user posts the request")
    public void userPostsTheRequest() {
        Map<String, Object> map = new HashMap<>();

        map.put("availabilityBranch", "03:00-21:00");
        map.put("deliveryType",new String[]{"BUYER_PICKUP_FROM_BRANCH"} );

        response = given().contentType(ContentType.JSON).spec(requestSpecification(token))
                .body(map).post("/account/change/delivery");
        response.prettyPrint();
        System.out.println(response.getStatusCode());


    }






}

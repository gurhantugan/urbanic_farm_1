package stepDefinitions.API;

import enums.USERINFO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.response;

public class US_086_NC_StepDef {

    public static String token;

    public static RequestSpecification requestSpec;
    Map<String, String> map = new HashMap<>();



    public static RequestSpecification requestSpecification(USERINFO user){
        requestSpec = new RequestSpecBuilder().addHeader("Authorization", "Bearer " + user.getToken()).
                setBaseUri("https://test.urbanicfarm.com/api").build();
        return requestSpec;

    }

    public static RequestSpecification requestSpecification(String token){
        requestSpec = new RequestSpecBuilder().addHeader("Authorization", "Bearer " + token).
                setBaseUri("https://test.urbanicfarm.com/api").build();
        return requestSpec;

    }

    @Given("User login with APİ")
    public void userLoginWithAPİ() {

        map.put("email", "seller_urban2@yopmail.com");
        map.put("password", "Seller2/");
        response = given().formParams(map).baseUri("https://test.urbanicfarm.com/api").post("/public/login");
        response.prettyPrint();

        token=  response.jsonPath().getString("token");


    }

    @Then("user gets the address info")
    public void userGetsTheAddressInfo() {

        given().spec(requestSpecification(token)).post("/account/address/getAddress");
        response.prettyPrint();
    }

    @Then("user gets the status code {int}")
    public void userGetsTheStatusCode(int statusCod) {

        Assert.assertEquals(200, response.statusCode());
    }

    @Then("User verifies the response")
    public void userVerifiesTheResponse() {

        Assert.assertEquals(true,response.jsonPath().getBoolean("success"));
    }
}

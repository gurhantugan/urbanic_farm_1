package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_102_SG_StepDef {

    Response response;

    String token;
    @Given("User logs in with API for get all Product request")
    public void userLogsInWithAPIForGetAllProductRequest() {
        token = ApiUtilities.loginWithAPI(USER.EZRA.getEmail(), USER.EZRA.getPassword());
    }


    @Given("User can get all requested products' information")
    public void userCanGetAllRequestedProductsInformation() {
        Map<String, String> infoMap = new HashMap<>();

        infoMap.put("relatedHub", "VEGETABLES_AND_FRUITS_HUB");

        response = given().contentType(ContentType.JSON).spec(requestSpecification(token))
                .body(infoMap).post("account/getProductRequests");

        response.prettyPrint();


    }

    @Then("user verifies the all requested product status code is {int}")
    public void userVerifiesTheAllRequestedProductStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());

    }

    @Then("user verifies the all requested product response")
    public void userVerifiesTheAllRequestedProductResponse() {

            Assert.assertEquals("application/json", response.header("content-type"));
            //Assert.assertEquals("2023-02-25 06:50:58", response.header("date"));
    }
}

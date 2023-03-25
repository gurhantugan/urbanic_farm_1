package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtilities;

import static io.restassured.RestAssured.given;

public class US_120_StepDef_MY {

    Response response;
    @Given("user goes to end point and sends the body to get response with the order list endpoint")
    public void userGoesToEndPointAndSendsTheBodyToGetResponseWithTheOrderListEndpoint() {


        response = given().contentType(ContentType.JSON).spec(ApiUtilities.requestSpecification(USER.SELLER_1_TOKEN)).post("/account/weeklyorder/getWeeklyOrderList");
        response.prettyPrint();



    }

    @Then("user asserts that status code and response is list")
    public void userAssertsThatStatusCodeAndResponseIsList() {
        Assert.assertEquals(200, response.statusCode());
       // Assert.assertEquals("", response.jsonPath().getList(""));
    }
}

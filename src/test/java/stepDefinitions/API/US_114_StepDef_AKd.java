package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;


public class US_114_StepDef_AKd {

 Map<String,Object> body = new HashMap<>();
    Response response;
    String token;

    int orderId;

    String tokenBuyer;






    @Given("user logs in with api order..")
    public void userLogsInWithApiOrder() {
        token = ApiUtilities.loginWithAPI(USER.SELLER.getEmail(), USER.SELLER.getPassword());
        tokenBuyer = ApiUtilities.loginWithAPI(USER.BUYER.getEmail(), USER.BUYER.getPassword());
    }

   /* @And("user creates Address.")
    public void userCreatesAddress() {
    }

    @And("user creates Event.")
    public void userCreatesEvent() {
    }
/*

    */
   @And("user checks order")
   public void userChecksOrder() {

       body.put("orderId","71M85562V4039514R");
       response = given().spec(requestSpecification(tokenBuyer)).formParams(body).post("/account/event/attendance/checkOrder");
       response.prettyPrint();
      // orderId = response.jsonPath().getInt("order.id");
    }




   @Then("user verifies success message is true")
    public void userVerifiesSuccessMessageIsTrue() {
       Assert.assertTrue(response.jsonPath().getBoolean("success"));
    }

   @Then("user verifies if status code is {int} on Event")
    public void userVerifiesIfStatusCodeIsOnEvent(int str) {
       Assert.assertEquals(200, response.getStatusCode());
   }


}

package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
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



    @Given("user logs in with api.")
    public void userLogsInWithApi() {

        token = ApiUtilities.loginWithAPI(USER.BUYER.getEmail(), USER.BUYER.getPassword());
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

        body.put("orderId",orderId);
        response = given().contentType(ContentType.JSON).spec(requestSpecification(token)).
                body(body).
                post("/account/event/attendance/checkOrder");
        response.prettyPrint();
    }



//    @Then("user verifies success message is true")
//    public void userVerifiesSuccessMessageIsTrue() {
//    }
//
//    @Then("user verifies if status code is {int} on Event")
//    public void userVerifiesIfStatusCodeIsOnEvent(int arg0) {
//    }


}

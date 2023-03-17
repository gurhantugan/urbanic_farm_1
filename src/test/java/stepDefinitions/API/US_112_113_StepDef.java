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
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_112_113_StepDef {
    Map<String, Object> body = new HashMap<>();


    Response response;

    String token;

    String tokenSeller;

    int eventId;

    int attendanceId;

    int addressId;


    @Given("User logs in as as Seller with API")
    public void userLogsInAsAsSellerWithAPI() {
        token = ApiUtilities.loginWithAPI(USER.BUYER.getEmail(), USER.BUYER.getPassword());
        tokenSeller = ApiUtilities.loginWithAPI(USER.SELLER.getEmail(), USER.SELLER.getPassword());
    }

    @And("User creates Address")
    public void userCreatesAddress() {
        body.put("address", "Köln, Deutschland");
        body.put("city", "Köln");
        body.put("isDefault", true);
        body.put("isSellerAddress", false);
        body.put("postal", "59200");
        body.put("state", "Köln");
        body.put("title", "Online");
        body.put("emptyBasket?", true);
        response =given().contentType(ContentType.JSON).spec(requestSpecification(token)).
                body(body).
                post("/account/address/addAddress");
        addressId = response.jsonPath().getInt("address.id");
        response.prettyPrint();

    }

    @And("User creates Event")
    public void userCreatesEvent() {
        body.put("title", "gunes");
        body.put("date", "2023-03-18T08:29");
        body.put("fee", 1);
        body.put("duration", 60);
        body.put("attendeeLimit", 50);
        body.put("addressId", addressId);
        body.put("tac", "aaa");
        response =given().contentType(ContentType.JSON).spec(requestSpecification(token)).
                body(body).
                post("/account/event/create");
        response.prettyPrint();
        eventId = response.jsonPath().getInt("event.id");



    }

    @And("User gets Register")
    public void userGetsRegister() {
        body.put("eventId", eventId);
        body.put("numberOfAttendees", "1");
        response =given().contentType(ContentType.JSON).spec(requestSpecification(token)).
                body(body).
                post("/account/event/register");
        attendanceId = response.jsonPath().getInt("attendanceId");
        response.prettyPrint();
    }

    @Then("User verifies success message is true")
    public void userVerifiesSuccessMessageIsTrue() {
        Assert.assertTrue(response.jsonPath().getBoolean("success"));
    }

    @Then("User verifies if status code is {int} on Event")
    public void userVerifiesIfStatusCodeIsOnEvent(int arg0) {
        Assert.assertEquals(200, response.getStatusCode());
    }

    @And("User Go to Payment")
    public void userGoToPayment() {
        body.put("attendanceId", attendanceId);
        response = given().contentType(ContentType.JSON).spec(requestSpecification(token)).
                body(body).
                post("/account/event/attendance/gotopayment");
        response.prettyPrint();
    }

}

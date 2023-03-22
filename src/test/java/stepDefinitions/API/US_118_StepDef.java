package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_118_StepDef {

    Map<String, Object> body = new HashMap<>();

    String token;

    Response response;
    int addressId;
    int eventId;


    @And("User create Address")
    public void userCreateAddress() {
        body.put("address", "Ankara");
        body.put("city", "Bolu");
        body.put("isDefault", true);
        body.put("isSellerAddress", false);
        body.put("postal", "64200");
        body.put("state", "Ege");
        body.put("title", "Online");
        body.put("emptyBasket?", true);
        response = given().contentType(ContentType.JSON).spec(requestSpecification(token)).body(body).post("/account/address/addAddress");
        response.prettyPrint();
        addressId = response.jsonPath().getInt("address.id");
    }


    @When("User delete an event")
    public void userDeleteAnEvent() {
        body.put("eventId", eventId);
        response = given().spec(requestSpecification(token)).post("/account/event/delete");
        response.prettyPrint();
    }



    @And("User creat Event")
    public void userCreatEvent() {
        body.put("title", "meeting");
        body.put("date", "2023-03-18T23:59");
        body.put("fee", 35);
        body.put("duration", 60);
        body.put("attendeeLimit", 50);
        body.put("addressId", addressId);
        body.put("tac", "engineer");
        response = given().spec(requestSpecification(token)).formParams(body).post("/account/event/create");
        response.prettyPrint();
        eventId = response.jsonPath().getInt("event.id");


    }

    @Then("User verifies the status code")
    public void userVerifiesTheStatusCode() {
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Given("User logs in API for delete event")
    public void userLogsInAPIForDeleteEvent() {
        token = ApiUtilities.loginWithAPI(USER.BUYER2.getEmail(), USER.BUYER2.getPassword());
    }



}

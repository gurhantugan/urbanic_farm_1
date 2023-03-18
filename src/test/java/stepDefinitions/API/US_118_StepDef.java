package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_118_StepDef {

    Map<String, Object> body = new HashMap<>();

    Response response;
    int addressId;
    int eventId;


    @And("User create Address")
    public void userCreateAddress() {
        body.put("address", "City of London, London, Vereinigtes Königreich");
        body.put("city", "London");
        body.put("isDefault", false);
        body.put("isSellerAddress", false);
        body.put("postal", "59300");
        body.put("state", "Greater London");
        body.put("title", "Home");
        body.put("emptyBasket?", true);
        response =given().contentType(ContentType.JSON).spec(requestSpecification(USER.SELLER.getToken())).
                body(body).
                post("/account/address/addAddress");
        addressId = response.jsonPath().getInt("address.id");
        response.prettyPrint();
    }


    @When("User delete an event")
    public void userDeleteAnEvent() {
        body.put("eventId", eventId);
        response = given().spec(requestSpecification(USER.SELLER.getToken())).post("/account/event/delete");
        response.prettyPrint();
    }



    @And("User creat Event")
    public void userCreatEvent() {
        body.put("title", "ozbek");
        body.put("date", "2023-03-21");
        body.put("fee", 1);
        body.put("duration", 50);
        body.put("attendeeLimit", 15);
        body.put("addressId", addressId);
        body.put("tac", "bbb");
        response = given().spec(requestSpecification(USER.SELLER.getToken())).post("/account/event/create");
        response.prettyPrint();
        eventId = response.jsonPath().getInt("event.id");


    }

    @Then("User verifies the status code")
    public void userVerifiesTheStatusCode() {
        Assert.assertEquals(200, response.getStatusCode());
    }

    @And("User verifies success message is true delete")
    public void userVerifiesSuccessMessageIsTrueDelete() {
    }
}

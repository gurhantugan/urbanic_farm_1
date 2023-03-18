package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_111_AK_StepDef {

    Response response;



    @Then("User get All events details")
    public void userGetAllEventsDetails() {
        //body.put("attendanceId", attendanceId);
        response = given().contentType(ContentType.JSON).spec(requestSpecification(USER.SELLER.getToken())).post("public/getEvent/464");
        response.prettyPrint();




    }


}

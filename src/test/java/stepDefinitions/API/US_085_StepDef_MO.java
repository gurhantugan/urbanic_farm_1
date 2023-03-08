package stepDefinitions.API;

import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_085_StepDef_MO {

    Response response;

    String token;



    @Then("user adds account info")
    public void user_adds_account_info() {
        Map<Object,Object>str = new HashMap<>();
        str.put("email","ezra_test@mailsac.com");
        str.put("first_name","Ezra");
        str.put("first_middle","Joyce");
        str.put("first_lastname","Cremin");
        str.put("device_lastname","0");
       response = given().contentType(ContentType.JSON).spec(requestSpecification(token))
               .body(str).post("/account/change/phone");
       response.prettyPrint();




    }
    @Then("user updates the account")
    public void user_updates_the_account() {
        Map<Object,Object>str = new HashMap<>();
        str.put("first_lastname","gunes");
        str.put("first_middle","bolt");
        response = given().contentType(ContentType.JSON).spec(requestSpecification(token))
                .body(str).post("/account/change/phone");


    }

}

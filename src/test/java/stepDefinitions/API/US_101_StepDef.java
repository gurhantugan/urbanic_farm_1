package stepDefinitions.API;

import enums.USER;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static utilities.ApiUtilities.requestSpecification;

public class US_101_StepDef {

    Response response;

    String token;

    @Given("User logs in with API for new Product request")
    public void userLogsInWithAPIForNewProductRequest() {
        token= ApiUtilities.loginWithAPI(USER.EZRA.getEmail(), USER.EZRA.getPassword());
    }


    @Then("User can request for a new product")
    public void userCanRequestForANewProduct(DataTable dataTable) {

        List<String> key = dataTable.column(0);
        List<String> value = dataTable.column(1);

        Map<String, String> keyValue = new HashMap<>();

        for (int i = 0; i <key.size() ; i++) {
            keyValue.put(key.get(i), value.get(i));

        }
        response = given().spec(requestSpecification(token)).
                formParams(keyValue).post("/account/newProductRequest");
        response.prettyPrint();

    }

    @And("User verifies the request product success code is {int}")
    public void userVerifiesTheRequestProductSuccessCodeIs(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @And("User verifies the request product response")
    public void userVerifiesTheRequestProductResponse() {

        Assert.assertEquals(true, response.jsonPath().getBoolean("success"));
    }
}

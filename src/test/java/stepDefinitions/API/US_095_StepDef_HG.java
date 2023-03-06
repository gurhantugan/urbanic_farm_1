package stepDefinitions.API;

import enums.USER;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.response;

public class US_095_StepDef_HG {
    String token = ApiUtilities.loginWithAPI(USER.SELLER.getEmail(), USER.SELLER.getPassword());
    @Then("User gets Hub create")
    public void userGetsHubCreate(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String>payload = dataTable.asMaps().get(0);
        response = given().spec(requestSpecification(token)).formParams(payload).post("account/hub/create");
        response.prettyPrint();
    }

    @Then("user verifies status code is {int}")
    public void userVerifiesStatusCodeIs(int statusCode) {
        //System.out.println(response.getStatusCode());
        Assert.assertEquals(statusCode,response.getStatusCode());
    }
}

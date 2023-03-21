package stepDefinitions.API;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ApiUtilities;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.response;

public class US_099_NC_StepDef {

    String token;
    @Given("User logs in with API for updating the product")
    public void userLogsInWithAPIForUpdatingTheProduct() {
        token = ApiUtilities.loginWithAPI(ConfigurationReader.getProperty("sellerEmail"), ConfigurationReader.getProperty("sellerPassword"));
    }

    @When("user updates the product")
    public void userUpdatesTheProduct(DataTable dataTable) {
        List<String> key = dataTable.column(0);
        List<String> value = dataTable.column(1);

        Map<String, Object> tableMap = new HashMap<>();

        for (int i = 0; i < key.size(); i++) {
            tableMap.put(key.get(i), value.get(i));

        }
        response = given().spec(requestSpecification(token)).formParams(tableMap).post("/account/hub/product/update");
        response.prettyPrint();
    }

    @Then("user verifies that update function works")
    public void userVerifiesThatUpdateFunctionWorks(DataTable dataTablea) {
        List<String> key = dataTablea.column(0);
        List<String> value = dataTablea.column(1);

        for (int i = 0; i < key.size(); i++) {
            Assert.assertEquals(value.get(i),response.jsonPath().getString(key.get(i)));




        }
    }
}

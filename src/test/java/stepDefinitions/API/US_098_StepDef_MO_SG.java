package stepDefinitions.API;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;
import static utilities.ApiUtilities.response;

public class US_098_StepDef_MO_SG {


    @Then("user verifies that the response is as expectedd")
    public void userVerifiesThatTheResponseIsAsExpectedd(DataTable dataTable) {
        List<String> paths = dataTable.column(0);
        List<String> expectedData = dataTable.column(1);

        for (int i = 0; i < paths.size(); i++) {

            Map<String,String> map = new HashMap<>();
            map.put("success","true");
            map.put("product","VEGETABLES_AND_FRUITS_Basil");

             Assert.assertEquals(expectedData.get(i), response.jsonPath().getString(paths.get(i)));
            System.out.println("Expected data = " + expectedData.get(i) + " -Actual Data = " + response.jsonPath().getString(paths.get(i)));



        }





    }


}

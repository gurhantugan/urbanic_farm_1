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

    @Then("user verifies that the response is as expected")
    public void userVerifiesThatTheResponseIsAsExpected(DataTable dataTable) {
        //Map<String,String> map = new HashMap<>();
        //map.put("success","true");
       // map.put("product[1].uniqueName","VEGETABLES_AND_FRUITS_Basil");


        List<String> paths = dataTable.column(0);
        List<String> expectedData = dataTable.column(1);

        for (int i = 0; i < paths.size(); i++) {

            Map<String,String> map = new HashMap<>();
            map.put("success","true");
            map.put("product","VEGETABLES_AND_FRUITS_Basil");

            /*  response = given().contentType(ContentType.JSON).spec(requestSpecification(token))
                    .body(map).post("/account/change/phone");
            response.prettyPrint();
          */
            Assert.assertEquals(expectedData.get(i), response.jsonPath().getString(paths.get(i)));
            System.out.println("Expected data = " + expectedData.get(i) + " -Actual Data = " + response.jsonPath().getString(paths.get(i)));



    }



/*
        Assert.assertEquals(expectedData.get(0), response.jsonPath().getString(paths.get(0)));
        Assert.assertEquals(expectedData.get(1), response.jsonPath().getString(paths.get(1)));
        Assert.assertEquals(expectedData.get(2), response.jsonPath().getString(paths.get(2)));
        Assert.assertEquals(expectedData.get(3), response.jsonPath().getString(paths.get(3)));
    */

    }



}

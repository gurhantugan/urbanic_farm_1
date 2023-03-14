package stepDefinitions.API;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static utilities.ApiUtilities.response;

public class US_082_StepDef_ED {

    @Then("user verifies that the response is as expected in followings")
    public void userVerifiesThatTheResponseIsAsExpectedInFollowings(DataTable dataTable) {
        List<String> paths = dataTable.column(0);
        List<String> expectedData = dataTable.column(1);

        for (int i = 0; i < expectedData.size(); i++) {

            Assert.assertEquals(expectedData.get(i), response.jsonPath().getString(paths.get(i)));
            System.out.println("Expected data = " + expectedData.get(i) + " - Actual Data = " + response.jsonPath().getString(paths.get(i)).toString());
        }

/*      // Bu methot dinamik olmadığı için çok tavsiye edilmez.

        Assert.assertEquals(expectedData.get(0), response.jsonPath().getString(paths.get(0)));
        Assert.assertEquals(expectedData.get(1), response.jsonPath().getString(paths.get(1)));
        Assert.assertEquals(expectedData.get(2), response.jsonPath().getString(paths.get(2)));
        Assert.assertEquals(expectedData.get(3), response.jsonPath().getString(paths.get(3)));
    */

    }



}




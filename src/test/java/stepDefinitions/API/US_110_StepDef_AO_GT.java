package stepDefinitions.API;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static enums.USER.SELLER;
import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;

public class US_110_StepDef_AO_GT {
   Response response1 = given().contentType(ContentType.JSON).spec(requestSpecification(SELLER.getToken())).post("account/event/getMyAttendances");

    @Then("user verifies some attendance titles are as follows")
    public void userVerifiesSomeAttendanceTitlesAreAsFollows(DataTable dataTable) {

        System.out.println(".............................................................");

        response1.prettyPrint();

        List<String> expectedAttendanceTitles = dataTable.column(0);
        System.out.println("expectedAttendanceTitles = " + expectedAttendanceTitles);

        List<String> allActualAttendanceTitles = response1.jsonPath().getList("attendances.event.title");

        String successMessage = response1.jsonPath().getString("success");
        System.out.println("successMessage = " + successMessage);


        for (int i = 0; i < allActualAttendanceTitles.size(); i++) {
            System.out.println(allActualAttendanceTitles.get(i).toString());
            // Assert.assertEquals(allExpextedTitles.get(i).toString(), allActualAttendanceTitles.get(i).toString());


            Assert.assertTrue(allActualAttendanceTitles.stream().anyMatch(t -> t.equals(expectedAttendanceTitles.get(0))));
            Assert.assertTrue(allActualAttendanceTitles.stream().anyMatch(t -> t.equals(expectedAttendanceTitles.get(1))));
            Assert.assertTrue(allActualAttendanceTitles.stream().anyMatch(t -> t.equals(expectedAttendanceTitles.get(2))));
            Assert.assertTrue(allActualAttendanceTitles.stream().anyMatch(t -> t.equals(expectedAttendanceTitles.get(3))));
            Assert.assertTrue(allActualAttendanceTitles.stream().anyMatch(t -> t.equals(expectedAttendanceTitles.get(4))));

        }
    }

}





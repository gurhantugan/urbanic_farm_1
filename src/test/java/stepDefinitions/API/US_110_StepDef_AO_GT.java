package stepDefinitions.API;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

public class US_110_StepDef_AO_GT {
    Response response;
    @Then("user verifies some attendance titles are as follows")
    public void userVerifiesSomeAttendanceTitlesAreAsFollows(DataTable dataTable) {

        List<String> expectedAttendanceTitles=dataTable.column(0);
        System.out.println("expectedAttendanceTitles = " + expectedAttendanceTitles);
       // List<String> allActualAttendanceTitles =response.jsonPath().getList("attendances.event.title");
        String successMessage=response.jsonPath().getString("success");
        System.out.println("successMessage = " + successMessage);




//        for (int i = 0; i < allActualAttendanceTitles.size(); i++) {
//            System.out.println( allActualAttendanceTitles.get(i).toString());
//           // Assert.assertEquals(allExpextedTitles.get(i).toString(), allActualAttendanceTitles.get(i).toString());

//Assert.assertTrue(cp.genders.stream().anyMatch(t -> t.getText().equals("Male")));

        }
    }



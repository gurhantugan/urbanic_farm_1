package stepDefinitions.API;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static enums.USER.SELLER;
import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.requestSpecification;

public class US_109_StepDef_AO_GT {
    Response response;

    @Given("user connects to the {string} with token")
    public void userConnectsToTheWithToken(String endpoint) {
       response= given().contentType(ContentType.JSON).spec(requestSpecification(SELLER.getToken())).post(endpoint);
       response.prettyPrint();


    }


    @Then("user verifies the success message")
    public void userVerifiesTheSuccessMessage() {
        Boolean actualResultSuccess=response.jsonPath().getBoolean("success");
        Boolean expectedResultSuccess=true;

        System.out.println("actualResultSuccess = " + actualResultSuccess);
        System.out.println("expectedResultSuccess = " + expectedResultSuccess);

        Assert.assertEquals(expectedResultSuccess,actualResultSuccess);

    }

    @Then("user verifies all titles are as follows")
    public void userVerifiesAllTitlesAreAsFollows(DataTable dataTable) {
        List<String> allExpextedTitles=dataTable.column(0);
        List<String> allActualTitles =response.jsonPath().getList("events.title");
        for (int i = 0; i < allActualTitles.size(); i++) {
            System.out.println("title"+(i+1)+"= "+  allActualTitles.get(i).toString());
            Assert.assertEquals(allExpextedTitles.get(i).toString(), allActualTitles.get(i).toString());

        }

    }


    @Then("user verifies attendee limit for each event are as follows")
    public void userVerifiesAttendeeLimitForEachEventAreAsFollows(DataTable dataTable) {

        List<String> allExpextedAtendeeLimit = dataTable.column(0);
        List<Integer> allActualAttendeeLimit = response.jsonPath().getList("events.attendeeLimit");
        for (int i = 0; i < allExpextedAtendeeLimit.size(); i++) {
            System.out.println("attendee limit" + (i + 1) + "= " + String.valueOf(allActualAttendeeLimit.get(i)));
            Assert.assertEquals(allExpextedAtendeeLimit.get(i).toString(), String.valueOf(allActualAttendeeLimit.get(i)));
        }

    }
}

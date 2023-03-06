package stepDefinitions.API;

import com.github.javafaker.Faker;
import enums.USER;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import utilities.ApiUtilities;

import java.util.List;
import static utilities.ApiUtilities.response;

public class Login {
    Faker faker = new Faker();
    Integer id;
    public static List<Integer> addressIds;
    String token;

    @Given("user logs in with api")
    public void userLogsInWithApi() {
        token = ApiUtilities.loginWithAPI(USER.EZRA.getEmail(), USER.EZRA.getPassword());


    }

    @Then("user gets address info")
    public void userGetsAddressInfo() {

        addressIds= ApiUtilities.Address.getAddress(USER.EZRA);
    }

    @When("user adds an address")
    public void userAddsAnAddress() {
        id= ApiUtilities.Address.addAddress("Hello hi",
                "arizona",
                true,
                false,
                "12345",
                "sta",
                "hello",
                false,
                token);
    }

    @And("user verifies added address exists")
    public void userVerifiesAddedAddressExists() {
//        response.prettyPrint();
        System.out.println(addressIds);
        boolean bayrak=false;
        for (int i = 0; i < addressIds.size(); i++) {
            if(addressIds.get(i).equals(id)) bayrak=true;
        }

        Assert.assertTrue(bayrak);
    }

    @When("user updates the address")
    public void userUpdatesTheAddress() {
        ApiUtilities.Address.updateAddress(id,
                "Hi hello",
                "arizona",
                true,
                false,
                "12345",
                "sta",
                "hello",
                false,
                token);


    }

    @And("user deletes the address")
    public void userDeletesTheAddress() {
        System.out.println(id);
        ApiUtilities.Address.deleteAddress(id, token);
    }

    @Then("user verifies the status code is {int}")
    public void userVerifiesTheStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());

    }

    @Then("user verifies the response")
    public void userVerifiesTheResponse(DataTable dataTable) {
        List<String> expectedData = dataTable.column(0);
        List<String> paths = dataTable.column(1);

        for (int i = 0; i < expectedData.size(); i++) {
            Assert.assertEquals(expectedData.get(i), response.jsonPath().getString(paths.get(i)));
        }

    }

    public static class US_085_StepDef {



        @Test
        public void test(){

    RestAssured.baseURI="https://test.urbanicfarm.com/";
    RequestSpecification request = RestAssured.given();
    Response response = request.when().post("https://test.urbanicfarm.com/api/account/change/phone").then().extract().response();
    int statusCode = response.getStatusCode();
            System.out.println(statusCode);



        }




    }
}

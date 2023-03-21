package stepDefinitions.API;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.ConfigurationReader;
public class US_115_StepDef {
    Response response;
    @Given("user logs in by token and goes {string}")
    public void userLogsInByTokenAndGoes(String endpoint) {
        String token = ConfigurationReader.getProperty("tokenBuyerUrl");
        RestAssured.baseURI = ConfigurationReader.getProperty(endpoint);
        RequestSpecification request = RestAssured.given();
        request.header("Authorization", "Bearer token");
        Response response = request.get("/account/event/create");
        Assert.assertEquals("200", response.getStatusCode());
        // System.out.println(response.getStatusCode());
    }
    @And("user fills the required information to create an event")
    public void userFillsTheRequiredInformationToCreateAnEvent() {
    }
    @And("user creates the event")
    public void userCreatesTheEvent() {
    }
    @And("user verifies that the event was created successfully with the correct parameters")
    public void userVerifiesThatTheEventWasCreatedSuccessfullyWithTheCorrectParameters() {
    }
}

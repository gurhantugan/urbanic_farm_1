package stepDefinitions.API;

import enums.USER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;

public class US_097_StepDef {
    Response response;
    RequestSpecification specification = new RequestSpecBuilder()
            .addHeader("Authorization", "Bearer " + USER.BUYER2.getToken())
            .setBaseUri("https://test.urbanicfarm.com/api")
            .setRelaxedHTTPSValidation()
            .build();




    @Then("user verifies the response status code is {int}")
    public void userVerifiesTheResponseStatusCodeIs(int code) {

        Assert.assertEquals(200, response.getStatusCode());
    }

    @Then("user verifies the list of all product")
    public void userVerifiesTheListOfAllProduct() {
        response = given().spec(specification).when().post("/public/product/getAllProducts");
        response.prettyPrint();
    }

    @And("user verifies all products are visible")
    public void userVerifiesAllProductsAreVisible() {
        JsonPath json=response.jsonPath();
        List<Integer> listId=json.getList("products.findAll{it.id>0}.id");
        System.out.println("ID list:" + listId);
        Assert.assertEquals(listId.get(listId.size() - 1),(Integer) listId.size());

    }

    @And("user verifies success is true")
    public void userVerifiesSuccessIsTrue() {
        Assert.assertEquals(true,response.jsonPath().getBoolean("success"));

    }
}

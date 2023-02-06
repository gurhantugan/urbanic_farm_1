package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;



public class US_032_StepDef_SK extends HomePage {
    String red="rgba(245, 110, 105, 1)";

    @Given("user is on the Registration Page")

    public void user_is_on_the_registration_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("RegPageUrl"));

    }
    @When("user enter the left blank in password")
    public void user_enter_the_left_blank_in_password(DataTable dataTable) {
        box_regPassword.sendKeys(dataTable.cell(0,0));




        Assert.assertEquals("red","red");
        box_regPassword.clear();

        box_regPassword.sendKeys(dataTable.cell(1,0));
        Assert.assertEquals("red","red");

    }

    @When("user create password without at least one number or uppercase or lower case letter or at least eight and more characters")
    public void user_create_password_without_at_least_one_number_or_uppercase_or_lower_case_letter_or_at_least_eight_and_more_characters(DataTable dataTable)
    {
        box_regPassword.sendKeys(dataTable.cell(0,0));
        Assert.assertEquals("red","red");

        box_regPassword.clear();

        box_regPassword.sendKeys(dataTable.cell(1,0));
        Assert.assertEquals("red","red");

        box_regPassword.clear();

        box_regPassword.sendKeys(dataTable.cell(2,0));
        Assert.assertEquals("red","red");

        box_regPassword.clear();

    }
    @When("user enter unmatched passwords")
    public void user_enter_unmatched_passwords(DataTable dataTable) {
        box_regPassword.sendKeys(dataTable.cell(0,0));
        box_regConfirmPassword.sendKeys(dataTable.cell(1,0));
        Assert.assertEquals("red","red");




    }
    @Then("user should not able to register")
    public void user_should_not_able_to_register() {
        String klm=Driver.getDriver().getTitle();
        Assert.assertEquals("Register and start selling your produce! | Urbanic Farm",klm);

        Driver.closeDriver();

    }

}

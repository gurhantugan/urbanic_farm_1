package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RegisterPage;
import utilities.Driver;

import java.util.List;

import static utilities.BrowserUtilities.*;


public class US_033_StepDef_ED {

    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();
    String firstName = faker.name().firstName();

    @And("user enters valid first name in the registration page")
    public void userEntersValidFirstNameInTheRegistrationPage() {

        registerPage.firstNameBox.sendKeys(firstName);
        System.out.println("firstName = " + firstName);

    }

    @And("user enters valid last name in the registration page")
    public void userEntersValidLastNameInTheRegistrationPage() {

        registerPage.lastnameBox.sendKeys(faker.name().lastName());


    }

    @And("user enters valid email in the registration page")
    public void userEntersValidEmailInTheRegistrationPage() {

        registerPage.emailBox.sendKeys(faker.internet().emailAddress());

    }

    @And("user enters valid password in the registration page")
    public void userEntersValidPasswordInTheRegistrationPage() {

        registerPage.password.sendKeys("Abc12345");
    }

    @And("user enters valid confirmation password in the registration page")
    public void userEntersValidConfirmationPasswordInTheRegistrationPage() {

        registerPage.confirmPassword.sendKeys("Abc12345");
    }

    @And("user enters valid zipcode in the registration page")
    public void userEntersValidZipcodeInTheRegistrationPage() {

        registerPage.zipCodeBox.sendKeys(faker.number().digits(5));

    }

    @Test
    public void test() {
        String zipcode = faker.number().digits(5);
        System.out.println("zipcode = " + zipcode);
    }

    @Then("user verifies its name in registered page")
    public void userVerifiesItsNameInRegisteredPage() {

        waitFor(3);
        String actualUserName = registerPage.text_userName.getText();
        Assert.assertEquals(firstName, actualUserName);

    }

    @And("user enters invalid zipcode in the registration page and get warning message")
    public void userEntersInvalidZipcodeInTheRegistrationPageAndGetWarningMessage(DataTable dataTable) {

        List<String> invalidZipcodes = dataTable.column(0);
        for (int i = 0; i < dataTable.column(0).size(); i++) {
            registerPage.zipCodeBox.sendKeys(dataTable.column(0).get(i));
            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.PAGE_DOWN);
            waitFor(2);
            registerPage.registerButton.click();
            waitFor(1);
            String expectedWarningMessage = "This field should only contains numbers with 5 characters";
            String actualWarningMessage = registerPage.zipCodeBox.getDomProperty("title");
            Assert.assertEquals("We did not get warning message", expectedWarningMessage, actualWarningMessage);
            clearText(registerPage.zipCodeBox);
            waitFor(1);


        }
    }

}
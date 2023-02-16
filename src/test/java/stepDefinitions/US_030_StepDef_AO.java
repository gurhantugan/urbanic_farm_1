package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.RegisterPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;

public class US_030_StepDef_AO {
    RegisterPage registerPage = new RegisterPage();

    @Given("user on the Urbanic_Farm page {string}")
    public void userOnTheUrbanic_FarmPage(String arg0) {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver().manage().window().maximize();
    }

    @When("user click on register button")
    public void userClickOnRegisterButton() {
        registerPage.button_register.click();

    }

    @Then("user should see First name")
    public void userShouldSeeFirstName() {
        Assert.assertTrue(registerPage.button_register.isDisplayed());
        Assert.assertTrue(registerPage.button_register.isEnabled());
        Assert.assertTrue(registerPage.button_FirstName.isEnabled());
    }

    @When("user enters {string} in First name field")
    public void userEntersInFirstNameField(String arg0) {

        registerPage.button_FirstName.sendKeys(arg0);
    }

    @And("user enters {string} in Last name field")
    public void userEntersInLastNameField(String arg0) {

        registerPage.button_LastName.sendKeys(arg0);
    }

    @And("user enters {string} in Email field")
    public void userEntersInEmailField(String arg0) {

        registerPage.button_Email.sendKeys(arg0);
    }

    @And("user enters {string} in Password field")
    public void userEntersInPasswordField(String arg0) {

        registerPage.button_Password.sendKeys(arg0);
    }

    @Then("assert First name field is enabled")
    public void assertFirstNameFieldIsEnabled() {

        Assert.assertTrue(registerPage.button_FirstName.isEnabled());
    }

    @Then("assert Last name field is enabled")
    public void assertLastNameFieldIsEnabled() {

        Assert.assertTrue(registerPage.button_LastName.isEnabled());
    }

    @Then("assert Email field is enabled")
    public void assertEmailFieldIsEnabled() {

        Assert.assertTrue(registerPage.button_Email.isEnabled());
    }

    @Then("assert Password field is enabled")
    public void assertPasswordFieldIsEnabled() {

        Assert.assertTrue(registerPage.button_Password.isEnabled());
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {

        registerPage.button_register.click();
    }

    @Then("user gets {string} warning message")
    public void userGetsWarningMessage(String warning) {
        //String expectedWarningMessage = "Please fill in this field.";
        BrowserUtilities.waitFor(2);
        String firstNameActualWarning = registerPage.button_FirstName.getDomProperty("validationMessage");
        String lastNameActualWarning = registerPage.button_LastName.getDomProperty("validationMessage");
        String emailActualWarning = registerPage.button_Email.getDomProperty("validationMessage");
        String passwordActualWarning = registerPage.button_Password.getDomProperty("validationMessage");
        ArrayList<String> warningArray = new ArrayList<>();
        warningArray.add(firstNameActualWarning);
        warningArray.add(lastNameActualWarning);
        warningArray.add(emailActualWarning);
        warningArray.add(passwordActualWarning);

        System.out.println("firstNameActualWarning = " + firstNameActualWarning);
        System.out.println("lastNameActualWarning = " + lastNameActualWarning);
        System.out.println("emailActualWarning = " + emailActualWarning);
        System.out.println("passwordActualWarning = " + passwordActualWarning);

        Assert.assertTrue(warningArray.contains(warning));

    }

    @And("user clicks on registertwo button")
    public void userClicksOnRegistertwoButton() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJS(registerPage.button_register2);

        //registerPage.button_register2.click();
    }


}



package stepDefinitions;

import com.github.javafaker.Faker;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Test;
import pages.RegisterPage;
import utilities.BrowserUtilities;

public class US_033_StepDef_ED {

   RegisterPage registerPage=new RegisterPage();
   Faker faker=new Faker();
    String firstName=faker.name().firstName();

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
        String zipcode=faker.number().digits(5);
        System.out.println("zipcode = " + zipcode);
    }

    @Then("user verifies its name in registered page")
    public void userVerifiesItsNameInRegisteredPage() {

        BrowserUtilities.waitFor(3);
        String actualUserName=registerPage.text_userName.getText();
        Assert.assertEquals(firstName,actualUserName);


    }
}

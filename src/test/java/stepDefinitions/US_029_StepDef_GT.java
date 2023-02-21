package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.BrowserUtilities;

import static utilities.BrowserUtilities.waitFor;

public class US_029_StepDef_GT {

    RegisterPage registerPage=new RegisterPage();

    @And("user clicks on Sign in with Google button")
    public void userClicksOnSignInWithGoogleButton() {
       waitFor(2);
        registerPage.button_signInWithGoogle.click();

    }

    @Then("user verifies its username in registered page")
    public void userVerifiesItsUsernameInRegisteredPage() {
        BrowserUtilities.waitFor(5);
        String expectedUserName="LEON";
        String actualUserName=registerPage.text_userName.getText();
        Assert.assertEquals(expectedUserName,actualUserName);

    }
}

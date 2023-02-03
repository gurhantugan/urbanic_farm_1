package stepDefinitions;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;
import java.util.Locale;

public class US_037_StepDef_BT {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    String oldPassword = "oldPassword001";
    String email = "testurbanicfarm001@yopmail.com";
    FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-GB"), new RandomService());
    String newPassword = fakeValuesService.bothify("B????????####");
    String password = newPassword;


    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        System.out.println(password);
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver().manage().window().maximize();
        homePage.button_login.click();
    }

    @When("Forgot Password button should be clickable and the user presses the Forgot Password button")
    public void forgotPasswordButtonShouldBeClickableAndTheUserPressesTheForgotPasswordButton() {
        BrowserUtilities.waitForClickability(loginPage.button_forgotPassword,3);
        BrowserUtilities.verifyElementClickable(loginPage.button_forgotPassword);
        loginPage.button_forgotPassword.click();

    }

    @Then("The {string} message should appear")
    public void theMessageShouldAppear(String string) {
        BrowserUtilities.waitForVisibility(loginPage.message_pleaseVerifyYourEmail,3);
        BrowserUtilities.verifyElementDisplayed(loginPage.message_pleaseVerifyYourEmail);
        Assert.assertEquals(loginPage.message_pleaseVerifyYourEmail.getText(),string);
    }

    @When("The user enters the valid email in the {string} window")
    public void theUserEntersTheValidEmailInTheWindow(String string) {
        BrowserUtilities.waitForVisibility(loginPage.textbox_verifyEmail,5);
        loginPage.textbox_verifyEmail.sendKeys(email);
    }

    @Then("Verify Email button should be clickable")
    public void verifyEmailButtonShouldBeClickable() {
        BrowserUtilities.waitForClickability(loginPage.button_verifyEmail,5);
        BrowserUtilities.verifyElementClickable(loginPage.button_verifyEmail);
    }

    @When("The user press the Verify Email button")
    public void theUserPressTheVerifyEmailButton() {
        loginPage.button_verifyEmail.click();
    }

    @Then("Email should be sent to the user's mailbox and {string} message should appear")
    public void emailShouldBeSentToTheUserSMailboxAndMessageShouldAppear(String string) {
        BrowserUtilities.waitForVisibility(loginPage.message_emailIsSent,5);
        BrowserUtilities.verifyElementDisplayed(loginPage.message_emailIsSent);
        Assert.assertEquals(loginPage.message_emailIsSent.getText(),string);
    }

    @When("The user comes to the mailbox")
    public void theUserComesToTheMailbox() {
        Driver.getDriver().get("https://yopmail.com/");
        Driver.getDriver().findElement(By.id("accept")).click();
        BrowserUtilities.waitFor(3);
        Driver.getDriver().findElement(By.cssSelector(".ycptinput")).sendKeys(email);
        Driver.getDriver().findElement(By.cssSelector("#refreshbut>.md>.material-icons-outlined")).click();
        Driver.getDriver().switchTo().frame("ifinbox");
        List<WebElement> listOfMessage = Driver.getDriver().findElements(By.xpath("//*[@class='lmf']"));
        listOfMessage.get(0).click();
        BrowserUtilities.waitFor(3);
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().switchTo().frame("ifmail");

    }

    @Then("The user sees the password reset link in the mailbox and Reset Your Password button must be clickable")
    public void theUserSeesThePasswordResetLinkInTheMailboxAndResetYourPasswordButtonMustBeClickable() {
        BrowserUtilities.waitForVisibility(Driver.getDriver().findElement(By.xpath("//span[text()='Reset Your Password']")), 5);
        BrowserUtilities.verifyElementDisplayed(Driver.getDriver().findElement(By.xpath("//span[text()='Reset Your Password']")));
        BrowserUtilities.verifyElementClickable(Driver.getDriver().findElement(By.xpath("//a[text()='Reset Your Password']")));

    }


    @When("The user presses the Reset Your Password link")
    public void theUserPressesTheResetYourPasswordLink() {
        Driver.getDriver().findElement(By.xpath("//a[text()='Reset Your Password']")).click();
        BrowserUtilities.switchToWindowWithIndex(1);

    }

    @Then("Change Password screen and Confirm Password menus should be appeared")
    public void changePasswordScreenAndConfirmPasswordMenusShouldBeAppeared() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://test.urbanicfarm.com/reset-password"));
        BrowserUtilities.isDisplayedText(Driver.getDriver().findElement(By.xpath("//*[text()='Change Password']")).getText());
    }

    @And("New Password and Confirm Password textbox should be functional")
    public void newPasswordAndConfirmPasswordTextboxShouldBeFunctional() {
        BrowserUtilities.waitForClickability(Driver.getDriver().findElement(By.xpath("//*[@name='plainPassword']")),3 );
        BrowserUtilities.verifyElementClickable(Driver.getDriver().findElement(By.xpath("//*[@name='plainPassword']")));
        BrowserUtilities.verifyElementClickable(Driver.getDriver().findElement(By.xpath("//*[@name='confirmPassword']")));
    }

    @When("The user enters the new valid password to New Password textbox and Confirm Password textbox")
    public void theUserEntersTheNewValidPasswordToNewPasswordTextboxAndConfirmPasswordTextbox() {
        Driver.getDriver().findElement(By.xpath("//*[@name='plainPassword']")).sendKeys(newPassword);
        Driver.getDriver().findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys(newPassword);
    }

    @Then("Press the submit button with valid and new credentials and Login Page should be appeared")
    public void pressTheSubmitButtonWithValidAndNewCredentialsAndLoginPageShouldBeAppeared() {
        Driver.getDriver().findElement(By.cssSelector(".btn")).click();
        BrowserUtilities.waitFor(3);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://test.urbanicfarm.com/auth/login");
        Driver.closeDriver();
    }

}

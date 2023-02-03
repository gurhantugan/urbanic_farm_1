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

    String email = "testurbanicfarm001@yopmail.com";
    FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-GB"), new RandomService());
    String newPassword = fakeValuesService.bothify("B????????####");



    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver().manage().window().maximize();
        homePage.button_login.click();
    }

    @When("Forgot Password button should be clickable and user presses the Forgot Password button")
    public void forgotPasswordButtonShouldBeClickableAndUserPressesTheForgotPasswordButton() {
        BrowserUtilities.waitForClickability(loginPage.button_forgotPassword, 3);
        BrowserUtilities.verifyElementClickable(loginPage.button_forgotPassword);
        loginPage.button_forgotPassword.click();

    }

    @Then("{string} message should appear")
    public void messageShouldAppear(String string) {
        BrowserUtilities.waitForVisibility(loginPage.message_pleaseVerifyYourEmail, 3);
        BrowserUtilities.verifyElementDisplayed(loginPage.message_pleaseVerifyYourEmail);
        Assert.assertEquals(loginPage.message_pleaseVerifyYourEmail.getText(), string);
    }

    @When("User enters the valid email in the {string} window")
    public void userEntersTheValidEmailInTheWindow(String string) {
        BrowserUtilities.waitForVisibility(loginPage.textbox_verifyEmail, 5);
        loginPage.textbox_verifyEmail.sendKeys(email);
    }

    @Then("Verify Email button should be clickable")
    public void verifyEmailButtonShouldBeClickable() {
        BrowserUtilities.waitForClickability(loginPage.button_verifyEmail, 5);
        BrowserUtilities.verifyElementClickable(loginPage.button_verifyEmail);
    }

    @When("User click on the Verify Email button")
    public void userClickOnTheVerifyEmailButton() {
        loginPage.button_verifyEmail.click();
    }

    @Then("Email should be sent to the user's mailbox and {string} message should appear")
    public void emailShouldBeSentToTheUserSMailboxAndMessageShouldAppear(String string) {
        BrowserUtilities.waitForVisibility(loginPage.message_emailIsSent, 5);
        BrowserUtilities.verifyElementDisplayed(loginPage.message_emailIsSent);
        Assert.assertEquals(loginPage.message_emailIsSent.getText(), string);
    }

    @When("User comes to the mailbox")
    public void userComesToTheMailbox() {
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

    @Then("User sees the password reset link in the mailbox and Reset Your Password button must be clickable")
    public void userSeesThePasswordResetLinkInTheMailboxAndResetYourPasswordButtonMustBeClickable() {
        BrowserUtilities.waitForVisibility(Driver.getDriver().findElement(By.xpath("//span[text()='Reset Your Password']")), 5);
        BrowserUtilities.verifyElementDisplayed(Driver.getDriver().findElement(By.xpath("//span[text()='Reset Your Password']")));
        BrowserUtilities.verifyElementClickable(Driver.getDriver().findElement(By.xpath("//a[text()='Reset Your Password']")));

    }


    @When("User clicks on the Reset Your Password link")
    public void userClicksOnTheResetYourPasswordLink() {
        Driver.getDriver().findElement(By.xpath("//a[text()='Reset Your Password']")).click();
        BrowserUtilities.switchToWindowWithIndex(1);

    }

    @Then("Change Password screen and Confirm Password menus should appear")
    public void changePasswordScreenAndConfirmPasswordMenusShouldAppear() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://test.urbanicfarm.com/reset-password"));
        BrowserUtilities.isDisplayedText(Driver.getDriver().findElement(By.xpath("//*[text()='Change Password']")).getText());
    }

    @And("New Password and Confirm Password textbox should be functional")
    public void newPasswordAndConfirmPasswordTextboxShouldBeFunctional() {
        BrowserUtilities.waitForClickability(Driver.getDriver().findElement(By.xpath("//*[@name='plainPassword']")), 3);
        BrowserUtilities.verifyElementClickable(Driver.getDriver().findElement(By.xpath("//*[@name='plainPassword']")));
        BrowserUtilities.verifyElementClickable(Driver.getDriver().findElement(By.xpath("//*[@name='confirmPassword']")));
    }

    @When("User enters the new valid password to New Password textbox and Confirm Password textbox")
    public void userEntersTheNewValidPasswordToNewPasswordTextboxAndConfirmPasswordTextbox() {
        Driver.getDriver().findElement(By.xpath("//*[@name='plainPassword']")).sendKeys(newPassword);
        Driver.getDriver().findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys(newPassword);
    }

    @Then("Click on the submit button with valid and new credentials and Login Page should appear")
    public void clickOnTheSubmitButtonWithValidAndNewCredentialsAndLoginPageShouldAppear() {
        Driver.getDriver().findElement(By.cssSelector(".btn")).click();
        BrowserUtilities.waitFor(3);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://test.urbanicfarm.com/auth/login");
        Driver.closeDriver();
    }

    @And("verify password is not the old one")
    public void verifyPasswordIsNotTheOldOne() {
        String oldPassword = BrowserUtilities.readDataFromIdsFile("password1");
        if(oldPassword==null || oldPassword.length()>0) {
            BrowserUtilities.writeDataToIdsFile("password1", newPassword);
        }
        Assert.assertNotEquals(oldPassword,newPassword);
        Driver.closeDriver();
    }
}









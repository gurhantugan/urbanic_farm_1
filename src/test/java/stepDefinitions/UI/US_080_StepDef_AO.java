package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AccountPage;
import pages.GetInTouchPage;
import utilities.BrowserUtilities;

public class US_080_StepDef_AO {

    AccountPage accountpage = new AccountPage();
    GetInTouchPage getInTouchPage = new GetInTouchPage();

    @Then("Contact us head at the top of the Welcome Page should appear")
    public void contactUsHeadAtTheTopOfTheWelcomePageShouldAppear() {
        Assert.assertTrue(accountpage.button_Contactus.isEnabled());
    }

    @Then("Contact us head should be clickable")
    public void contactUsHeadShouldBeClickable() {
        Assert.assertTrue(accountpage.button_Contactus.isDisplayed());
    }

    @When("user clicks Contact us")
    public void userClicksContactUs() {
        accountpage.button_Contactus.click();
    }

    @Then("get in touch page should appear")
    public void getInTouchPageShouldAppear() {
        Assert.assertTrue(getInTouchPage.button_SendMessage.isEnabled());
    }

    @When("user clicks Send Message without entering any information")
    public void userClicksSendMessageWithoutEnteringAnyInformation() {
        getInTouchPage.button_SendMessage.click();
    }

    @Then("user should see these allerts {string}")
    public void userShouldSeeTheseAllerts(String arg0) {
        Assert.assertTrue(getInTouchPage.button_yourNameWarning.isDisplayed());
        Assert.assertTrue(getInTouchPage.button_yourEmailWarning.isDisplayed());
        Assert.assertTrue(getInTouchPage.button_yourMessageWarning.isDisplayed());

        System.out.println(getInTouchPage.button_yourNameWarning.getText());
        System.out.println(getInTouchPage.button_yourEmailWarning.getText());
        System.out.println(getInTouchPage.button_yourMessageWarning.getText());

    }

    @When("user entering the required information")
    public void userEnteringTheRequiredInformation() {
        getInTouchPage.button_yourName.sendKeys("George");
        getInTouchPage.button_yourEmail.sendKeys("george@gmail.com");
        getInTouchPage.button_yourMessage.sendKeys("Thanks for your fresh fruit");

        System.out.println("George");
        System.out.println("george@gmail.com");
        System.out.println("Thanks for your fresh fruit");

    }

    @And("user clicks Send Message")
    public void userClicksSendMessage() {
        getInTouchPage.button_SendMessage.click();
    }

    @Then("user should see the allert {string}")
    public void userShouldSeeTheAllert(String expectedMessage) {

        BrowserUtilities.waitFor(2);
        //String expectedMessage = getInTouchPage.ToastMessage.getDomProperty("Thanks for your message! It has been sent to us.");
        Assert.assertEquals(expectedMessage,getInTouchPage.ToastMessage.getText());
    }
}

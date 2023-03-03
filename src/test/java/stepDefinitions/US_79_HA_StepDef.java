/*
package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_79_HA_StepDef {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @Given("user login as BuyerHuseyin")
    public void userLoginAsBuyerHuseyin() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver().manage().window().maximize();
        BrowserUtilities.clickWithJS(homePage.button_login);
        loginPage.textbox_email.sendKeys(ConfigurationReader.getProperty("buyerHuseyinEmail"));
        loginPage.textbox_password.sendKeys(ConfigurationReader.getProperty("buyerHuseyinPassword"));
        BrowserUtilities.clickWithJS(loginPage.button_login);
        BrowserUtilities.clickWithJS(homePage.sign_cancel);
        BrowserUtilities.waitFor(3);
    }

    @Then("user verifies view all option if there is no notifications")
    public void userVerifiesViewAllOptionIfThereIsNoNotifications() {
        String actualText = loginPage.noUnreadNotifications.getText();
        Assert.assertEquals("No unread Notifications", actualText);
        Assert.assertTrue(loginPage.viewAll.isDisplayed());
        Assert.assertTrue(loginPage.viewAll.isEnabled());
        BrowserUtilities.clickWithJS(loginPage.viewAll);
        Assert.assertFalse(loginPage.notificationsCardContainer.size() > 0);
        Assert.assertTrue(loginPage.noUnreadNotifications.isDisplayed());
    }

    @Then("user verifies options should be visible and functional if there are notifications")
    public void userVerifiesOptionsShouldBeVisibleAndFunctionalIfThereAreNotifications() {
        Assert.assertTrue(loginPage.filterByUnread.isDisplayed());
        Assert.assertTrue(loginPage.filterByUnread.isEnabled());
        BrowserUtilities.clickWithJS(loginPage.filterByUnread);
        int oldCount_MarkedRead = loginPage.checkbox_markedRead.size();
        loginPage.checkbox_markedUnread.size();
        loginPage.checkbox_markedUnread.get(0).click();
        int newCount_MarkedRead = loginPage.checkbox_markedRead.size();
        Assert.assertTrue(newCount_MarkedRead == oldCount_MarkedRead + 1);
    }

    @Then("user verifies options visible and functional")
    public void userVerifiesOptionsVisibleAndFunctional() {
        System.out.println("verifying options visible and functional");
    }
}

*.

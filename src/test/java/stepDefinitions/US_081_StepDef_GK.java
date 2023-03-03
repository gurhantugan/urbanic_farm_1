package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.*;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

public class US_081_StepDef_GK {


    WelcomePage welcomePage=new WelcomePage();
    WeFunderPage weFunderPage=new WeFunderPage();


    @Then("User should click <{string}>")
    public void user_should_click(String string) {
        welcomePage.SupportTheLocalFoodMovement.click();

    }
    @Then("User should see {string} webpage")
    public void user_should_see_webpage(String string) {
        Assert.assertTrue(welcomePage.SupportTheLocalFoodMovement.isDisplayed());

    }
    @Then("User should click <{string}> before login")
    public void user_should_click_before_login(String string) {
     welcomePage.SupportTheLocalFoodMovement2.click();
    }

    @Then("User should see {string} webpage before login")
    public void user_should_see_webpage_before_login(String string) {
       Assert.assertTrue(welcomePage.SupportTheLocalFoodMovement2.isDisplayed());
    }

    @Then("User close cookie part on website")
    public void user_close_cookie_part_on_website() {
        BrowserUtilities.waitFor(10);
        // weFunderPage.cookies.click();
        JSUtils.clickElementByJS(weFunderPage.cookies);
    }
    @Then("User click {string} on website")
    public void user_click_on_website(String string) {
        weFunderPage.SentenceOfInvest.isDisplayed();

    }
    @Then("User see {string} sentence on the page")
    public void user_see_sentence_on_the_page(String string) {
       weFunderPage.Overview.click();
    }
    @Then("User see Urbanic Farm under {string}")
    public void user_see_urbanic_farm_under(String string) {
        weFunderPage.Pitch.sendKeys("Urbanic Farm");

    }



}

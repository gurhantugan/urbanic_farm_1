package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.WelcomePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class US_063_StepDef_GK {

    LoginPage loginPage = new LoginPage();
    HomePage homepage = new HomePage();
    WelcomePage welcomePage = new WelcomePage();

    @Given("User enter to Home Page")
    public void user_enter_to_home_page() {
       // Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
       // Driver.getDriver().manage().window().maximize();

    }

    @When("User see and click the login button")
    public void user_see_and_click_the_login_button() {
        homepage.button_navbarLogin.click();

    }


    @Then("User enters buyer valid email address")
    public void user_enters_buyer_valid_email_address() {
        loginPage.box_email.sendKeys(ConfigurationReader.getProperty("buyerEmail"));


    }

    @Then("User enters buyer valid password")
    public void user_enters_buyer_valid_password() {
        loginPage.box_password.sendKeys(ConfigurationReader.getProperty("buyerPassword"));

    }

    @Then("User click the login button")
    public void user_click_the_login_button() {
        loginPage.button_submit.click();

    }

    @Then("User see {string} message on screen")
    public void user_see_message_on_screen(String string) {
        //BrowserUtilities.waitFor(35);
    //    welcomePage.WelcomeToUrbanicForm.isEnabled();
      //  welcomePage.closeMessage.click();

    }

    @Then("user should be functinal all titles")
    public void user_should_be_functinal_all_titles(io.cucumber.datatable.DataTable dataTable) {

        /*
        List<String> texts = dataTable.column(0);
        for (int i = 0; i < texts.size(); i++) {
            WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id='" + texts.get(i) + "']"));

            Assert.assertTrue(element.isDisplayed());

         */

            Assert.assertTrue(welcomePage.WhatAreYouLookingFor.isEnabled());
            Assert.assertTrue(welcomePage.SearchInMiles.isEnabled());
            Assert.assertTrue(welcomePage.Categories.isEnabled());
            Assert.assertTrue(welcomePage.SearchOnlyInOrganic.isEnabled());
            Assert.assertTrue(welcomePage.Search.isEnabled());
        }


    }


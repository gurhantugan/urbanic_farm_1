package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;

public class US_020_StepDef_ED {
    HomePage homePage = new HomePage();

    @And("User clickable the About Us button")
    public void userClickableTheAboutUsButton() {

        homePage.link_AboutUs.click();
    }

    @Then("User should go to the relevant page")
    public void userShouldGoToTheRelevantPage() {

        Assert.assertTrue(homePage.link_support.isDisplayed());
    }
}

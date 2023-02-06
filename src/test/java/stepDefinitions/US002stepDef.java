package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class US002stepDef {
    @Given("user goes to the website")
    public void userGoesToTheWebsite() {

        Driver.getDriver().get("https://test.urbanicfarm.com/");
    }

    @Then("{string} logo should be visible on the web site")
    public void logoShouldBeVisibleOnTheWebSite(String arg0) {

        @FindBy(xpath = "//div[@class='d-flex justify-content-center align-items-center']");
        public WebElement logoUrbanicFarm;

    }

    @Then("Homepage should contain Support the local food movement,")
    public void homepageShouldContainSupportTheLocalFoodMovement() {
    }

    @Then("Homepage should contain Blog,")
    public void homepageShouldContainBlog() {
    }

    @Then("Homepage should contain Explore,")
    public void homepageShouldContainExplore() {
    }

    @Then("Homepage should contain About Us,")
    public void homepageShouldContainAboutUs() {
    }

    @Then("Homepage should contain Contact Us,")
    public void homepageShouldContainContactUs() {
    }

    @Then("Homepage should contain Login,")
    public void homepageShouldContainLogin() {
    }

    @Then("Homepage should contain Register.")
    public void homepageShouldContainRegister() {
    }
}

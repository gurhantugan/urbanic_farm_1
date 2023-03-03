package stepDefinitions.UI;

import io.cucumber.java.en.*;
import pages.HomePage;
import utilities.Driver;
import utilities.JSUtils;



public class US_018_StepDef_SK extends HomePage {

    @When("user should be able to click GetAPP button")
    public void user_should_be_able_to_click_get_app_button() {

        JSUtils.clickElementByJS(button_getApp);


    }
    @Then("user should able to see relevant Get App Logo on page")
    public void user_should_able_to_see_relevant_get_app_logo_on_page() {


    link_Apple.getText();

        Driver.closeDriver();
    }

}

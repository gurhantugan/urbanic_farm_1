package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class US_011_StepDef_AsK extends HomePage {




    @When("user should able to see the link of Backyard gardeners and farmers join the Movement For Free!")
    public void userShouldAbleToSeeTheLinkOfBackyardGardenersAndFarmersJoinTheMovementForFree() {
    link_of_BackyardGardenersAndFarmersJoinTheMovementForFree.isDisplayed();
    }

    @Then("user should able to click the {string} button")
    public void userShouldAbleToClickTheRegisterNowButton() {
       button_registerNow.click();

    }


}

package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MyEventsPage;

public class US_078_StepDef_MO_SG {

    MyEventsPage myEventsPage = new MyEventsPage();

    @When("user click on cancel button")
    public void user_click_on_cancel_button() {
        myEventsPage.button_cancel.click();


    }

    @When("user should be able to sees {string} message")
    public void user_should_be_able_to_sees_message(String string) {

    }

    @When("user click on Mark as completed button")
    public void user_click_on_mark_as_completed_button() {
       myEventsPage.button_mark_as_completed.click();
    }

    @When("user should be able to see {string} message")
    public void user_should_be_able_to_see_message(String string) {

    }

    @When("user click on copy link  button")
    public void user_click_on_copy_link_button() {
       myEventsPage.button_copy_link.click();
    }



    @And("user should be able to seeing  {string} message")
    public void userShouldBeAbleToSeeingMessage(String arg0) {

    }
}


package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import pages.AccountPage;
import pages.MyEventsPage;
import pages.OrdersPage;
import pages.WelcomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_072_StepDef_MY_ED {

    WelcomePage welcomePage=new WelcomePage();
    MyEventsPage myEventsPage=new MyEventsPage();
    Actions actions=new Actions(Driver.getDriver());

    @And("user goes to account page and clicks on My Events")
    public void userGoesToAccountPageAndClicksOnMyEvents() {
        BrowserUtilities.waitFor(3);
        welcomePage.account_name.click();
        BrowserUtilities.waitFor(3);
        actions.moveToElement(myEventsPage.link_MyEvents).click().perform();

    }

    @And("user clicks the new Events")
    public void userClicksTheNewEvents() {
        myEventsPage.button_Create_newEvents.click();
    }
}

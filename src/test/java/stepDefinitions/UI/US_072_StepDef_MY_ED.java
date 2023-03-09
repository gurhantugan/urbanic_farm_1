package stepDefinitions.UI;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AccountPage;
import pages.MyEventsPage;
import pages.OrdersPage;
import pages.WelcomePage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.JSUtils;

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

    @And("user writes the required data to the boxes and gets the messages")
    public void userWritesTheRequiredDataToTheBoxesAndGetsTheMessages(DataTable dataTable) {

        for (int i = 1; i < 7; i++) {

            BrowserUtilities.clearAndSend(myEventsPage.box_title,dataTable.column(0).get(i));
            Select select = new Select(myEventsPage.box_Address);
            select.selectByIndex(Integer.parseInt(dataTable.column(1).get(i)));
            BrowserUtilities.clearAndSend(myEventsPage.box_Date,dataTable.column(2).get(i));
            BrowserUtilities.clearAndSend(myEventsPage.box_time,dataTable.column(3).get(i));
            BrowserUtilities.clearAndSend(myEventsPage.box_duration,dataTable.column(4).get(i));
            BrowserUtilities.clearAndSend(myEventsPage.box_attendeeLimit,dataTable.column(5).get(i));
            BrowserUtilities.clearAndSend(myEventsPage.box_TermsAndConditions,dataTable.column(6).get(i));

            JSUtils.clickElementByJS(myEventsPage.button_Submit);
            BrowserUtilities.waitFor(3);
           String expectedmessage = dataTable.column(7).get(i);
           String actualmessage = Driver.getDriver().findElement(By.xpath("//div[@class='CreateEvents_inlineErrormsg__2AiUS'][text()='"+dataTable.column(7).get(i)+"']")).getText();
            Assert.assertEquals("test gecmedi",expectedmessage,actualmessage);

        }

    }


    }


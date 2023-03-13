package stepDefinitions.UI;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        BrowserUtilities.waitFor(2);
        myEventsPage.button_Create_newEvents.click();
    }

    @And("user writes the required data to the boxes and gets the messages")
    public void userWritesTheRequiredDataToTheBoxesAndGetsTheMessages(DataTable dataTable) {

        for (int i = 1; i < dataTable.height(); i++) {

            BrowserUtilities.clearAndSend(myEventsPage.box_title,dataTable.column(0).get(i));
            Select select = new Select(myEventsPage.box_Address);
<<<<<<< HEAD
            //select.selectByIndex(Integer.parseInt(dataTable.column(1).get(i)));
           // select.selectByValue(dataTable.column(1).get(i));
=======
>>>>>>> main
            select.selectByVisibleText(dataTable.column(1).get(i));
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
    @And("user clicks the add button next to address bar")
    public void userClicksTheAddButtonNextToAddressBar() {

        myEventsPage.button_Add.click();
    }

    @And("user fills the required information and clicks submit")
    public void userFillsTheRequiredInformationAndClicksSubmit() {

        actions.sendKeys(myEventsPage.box_addressTitle,"Gallery").click().perform();
        actions.sendKeys(myEventsPage.box_addressSecond,"London Street").click().perform();
        BrowserUtilities.waitFor(2);
        myEventsPage.box_states.click();
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clearAndSend(myEventsPage.box_states,"California");
<<<<<<< HEAD
       // myEventsPage.states_inList.get(2).click();
       // actions.moveToElement(myEventsPage.states_California).click().perform();
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clearAndSend(myEventsPage.box_cities,"Alameda");
        //actions.moveToElement(myEventsPage.cities_Alameda).click().perform();
=======
       // actions.moveToElement(myEventsPage.states_California).click().perform();
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clearAndSend(myEventsPage.box_cities,"Alameda");
       // actions.moveToElement(myEventsPage.cities_Alameda).click().perform();
>>>>>>> main
        actions.sendKeys(myEventsPage.box_postal,"45678").click().perform();
        myEventsPage.button_addressSubmit.click();



    }

    @When("user fills the required information to the event page and clicks go back")
    public void userFillsTheRequiredInformationToTheEventPageAndClicksGoBack(DataTable dataTable) {

        BrowserUtilities.clearAndSend(myEventsPage.box_title,dataTable.column(0).get(1));
        Select select = new Select(myEventsPage.box_Address);
        select.selectByVisibleText(dataTable.column(1).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_Date,dataTable.column(2).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_time,dataTable.column(3).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_duration,dataTable.column(4).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_attendeeLimit,dataTable.column(5).get(1));
        BrowserUtilities.clearAndSend(myEventsPage.box_TermsAndConditions,dataTable.column(6).get(1));
        BrowserUtilities.waitFor(2);
        myEventsPage.button_goBack.click();
        BrowserUtilities.waitFor(2);

    }

    @Then("user clicks create new events and sees the boxes as  empty and gets the following messages")
    public void userClicksCreateNewEventsAndSeesTheBoxesAsEmptyAndGetsTheFollowingessages(DataTable dataTable) {


        myEventsPage.button_Create_newEvents.click();
        BrowserUtilities.waitFor(2);
        actions.sendKeys(Keys.END).perform();
        myEventsPage.button_createEventSubmit.click();
        BrowserUtilities.waitFor(2);

        for (int i = 1; i < dataTable.height(); i++) {

            String expectedmessage = dataTable.column(0).get(i);
            String actualmessage = Driver.getDriver().findElement(By.xpath("//div[@class='CreateEvents_inlineErrormsg__2AiUS'][text()='" + dataTable.column(0).get(i) + "']")).getText();
            Assert.assertEquals("test gecmedi",expectedmessage,actualmessage);
            BrowserUtilities.waitFor(2);


        }

        Driver.closeDriver();

    }
}


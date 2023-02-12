package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.SelfShareTradePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class US_038_StepDefs_MY {
     SelfShareTradePage selfShareTradePage=new SelfShareTradePage();
    LoginPage loginPage=new LoginPage();

    @Then("user clicks Sell-Share-Trade button and verifies the relevant page is opening")
    public void user_clicks_button_and_verifies_the_relevant_page_is_opening() {
       selfShareTradePage.button_Sell_Share_Trade.click();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://test.urbanicfarm.com/account/home";
        Assert.assertEquals("not same page",expectedUrl,actualUrl);


    }
    @Then("user checks the following links are displayed on the page")
    public void user_checks_the_following_are_displayed_on_the_page(DataTable dataTable) {

        List<String> allLinks = dataTable.column(0);

        Assert.assertEquals("not equal link",allLinks.get(0),selfShareTradePage.link_About_us.getText());
        Assert.assertEquals("not equal link",allLinks.get(1),selfShareTradePage.link_Contact_us.getText());
        Assert.assertEquals("not equal link",allLinks.get(2),selfShareTradePage.link_Scheduled_delivery.getText());
        Assert.assertEquals("not equal link",allLinks.get(3),selfShareTradePage.link_Events.getText());
        Assert.assertEquals("not equal link",allLinks.get(4),selfShareTradePage.link_Logout.getText());
        Assert.assertEquals("not equal link",allLinks.get(5),selfShareTradePage.link_Cart.getText());

      selfShareTradePage.link_Logout.click();
      Driver.closeDriver();

    }



}

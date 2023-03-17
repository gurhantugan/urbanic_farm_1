package stepDefinitions.UI;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import pages.SelfShareTradePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_044_StepDef_HA {
    SelfShareTradePage selfShareTradePage = new SelfShareTradePage();
    @And("user clicks on huseyin button")
    public void userClicksOnHuseyinButton(){
        selfShareTradePage.button_navHuseyin.click();
    }
    @And("user clicks on logout button")
    public void userClicksOnLogoutButton() {
        BrowserUtilities.waitForVisibility(selfShareTradePage.button_logout, 10);
        BrowserUtilities.verifyElementClickable(selfShareTradePage.button_logout);
        selfShareTradePage.button_logout.click();

    }


}

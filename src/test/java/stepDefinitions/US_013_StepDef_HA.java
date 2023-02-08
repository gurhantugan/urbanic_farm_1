package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utilities.BrowserUtilities;

public class US_013_StepDef_HA {
    HomePage homePage = new HomePage();
    @And("user verifies that register now button is clickable")
    public void userVerifiesThatRegisterNowButtonIsClickable() {
        BrowserUtilities.waitFor(3);
        BrowserUtilities.verifyElementClickable(homePage.button_registerNow);
        BrowserUtilities.clickWithJS(homePage.button_registerNow);
        BrowserUtilities.waitFor(3);
    }
}

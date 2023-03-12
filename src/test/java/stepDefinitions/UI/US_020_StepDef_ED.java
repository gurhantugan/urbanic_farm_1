package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.JSUtils;

public class US_020_StepDef_ED {
    HomePage homePage = new HomePage();

    @And("User clickable the About Us button")
    public void userClickableTheAboutUsButton() {
        JSUtils.clickElementByJS(homePage.link_aboutUs_footer);
        BrowserUtilities.waitFor(3);
    }


}

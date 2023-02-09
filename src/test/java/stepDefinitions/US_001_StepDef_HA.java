package stepDefinitions;

import io.cucumber.java.en.And;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_001_StepDef_HA {
    @And("user closes browser")
    public void userClosesBrowser() {
        BrowserUtilities.waitFor(3);
        Driver.closeDriver();
    }
}

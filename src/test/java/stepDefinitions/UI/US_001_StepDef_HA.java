package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_001_StepDef_HA {
    @And("user closes browser")
    public void userClosesBrowser() {
        BrowserUtilities.waitFor(7);
        Driver.closeDriver();
    }
    @Given("user on the Urbanic Farm page")
    public void userOnTheUrbanicFarmPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
    }
}

package stepDefinitions.UI;

import io.cucumber.java.en.Given;
import utilities.DatabaseUtilities;


public class DataBaseStepDef {
    @Given("user approves the last product from database")
    public void userApprovesTheLastProductFromDatabase() {

        DatabaseUtilities.approveLastProduct();

    }
}

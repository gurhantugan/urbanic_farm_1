package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static stepDefinitions.Hooks.driver;


public class CommonPage {
    public CommonPage() {
        PageFactory.initElements(Driver.getDriver(), this);

}

    }









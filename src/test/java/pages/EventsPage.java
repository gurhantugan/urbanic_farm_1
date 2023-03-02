package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsPage extends CommonPage{

    @FindBy(css = "class=\"Navbar_button__9mlDv\"")
    public WebElement button_Navbar;

    @FindBy(xpath = "(//*[@href=\"/account/events\"])[2]")
     public WebElement button_events;

    @FindBy(xpath = "(//*[text()='Register'])[2]")
    public WebElement button_events1;

}

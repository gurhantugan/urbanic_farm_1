package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EventsPage extends CommonPage{

    @FindBy(xpath = "(//*[@href=\"/account/events\"])[2]")
     public WebElement button_events;

    @FindBy(xpath = "//*[text()='Register']")
    public List<WebElement> button_register;

    @FindBy(css = "Registered Events")
    public WebElement button_eventsRegistered;

}

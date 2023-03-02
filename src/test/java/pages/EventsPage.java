package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsPage extends CommonPage{

    @FindBy(xpath = "(//*[@href=\"/account/events\"])[2]")
     public WebElement button_events;
}

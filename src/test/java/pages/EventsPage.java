package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EventsPage extends CommonPage {

    @FindBy(xpath = "//*[text()='Register']")
    public List<WebElement> button_register;

    @FindBy(css = "Registered Events")
    public WebElement button_eventsRegistered;

    @FindBy(css = "[type=\"number\"]")
    public WebElement box_number;

    @FindBy(css = "[id=\"terms\"]")
    public WebElement box_terms;

    @FindBy(css = "[class=\"eventRegister_approveBtn__1P-N2\"]")
    public WebElement button_approve;

    @FindBy(css = "You've already registered this event. Please check 'Registered Events' tab.")
    public WebElement yellowMesage;




}

package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EventsPage extends CommonPage {

    @FindBy(xpath = "//*[text()='Register']")
    public List<WebElement> button_register;

    @FindBy (css = ".text-center.text-warning.mt-3")
    public List<WebElement> button_text;

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

    @FindBy(css = ".row.justify-content-center.text-warning")
    public List<WebElement> events_all;

    @FindBy(css = ".text-center.text-warning.mt-3")
    public List<WebElement> events_scheduled;

    @FindBy(xpath = "//*[.='Registered Events']")
    public WebElement link_registeredEvent;

    @FindBy(xpath = "//*[.='You have now registered to this event']")
    public WebElement approve_mesage;

    @FindBy(css = "(//*[@class=\"btn btn-outline-success p-1 col-lg-3 col-12 ScheduledEvents_btn__1gJtD\"])[30]")
    public WebElement button_regesterMhsl;

    @FindBy(xpath = "//*[@name=\"delete\"]")
    public WebElement button_delete;

    @FindBy(xpath = "(//*[@class=\"btn btn-primary mr-4\"])[1]")
    public WebElement button_yes;


}




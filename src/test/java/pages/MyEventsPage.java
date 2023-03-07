package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyEventsPage extends CommonPage {

    @FindBy(xpath = "//a[@class='Sidebar_section_btn__1sp6i h6 '][text()='My Events']")
    public WebElement link_MyEvents;

    @FindBy(xpath = "//button[@class='events-i-organize_btnCreate__2AWbt']")
    public WebElement button_Create_newEvents;

    @FindBy(css="#title")
    public WebElement box_title;

    @FindBy(css="#address2")
    public WebElement box_Address;

    @FindBy(css="#date")
    public WebElement box_Date;

    @FindBy(css="#time")
    public WebElement box_time;

    @FindBy(css="#fee")
    public WebElement box_Fee;

    @FindBy(css="#duration")
    public WebElement box_duration;

    @FindBy(css="#attendeeLimit")
    public WebElement box_attendeeLimit;

    @FindBy(css="#tac")
    public WebElement box_TermsAndConditions;

    @FindBy(css=".btn.btn-outline-success.px-4")
    public WebElement button_Submit;



}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyEventsPage extends CommonPage {

    @FindBy(xpath = "//a[@class='Sidebar_section_btn__1sp6i h6 '][text()='My Events']")
    public WebElement link_MyEvents;

    @FindBy(xpath = "//button[@class='events-i-organize_btnCreate__2AWbt']")
    public WebElement button_Create_newEvents;

    @FindBy(css = "#title")
    public WebElement textBox_title;

 @FindBy(css = ".btn.btn-outline-success.mb-1")
    public WebElement button_addAddress;

 @FindBy(css = "#addressTitle")
    public WebElement textBox_addressTitle;

 @FindBy(css = "#address")
    public WebElement textBox_address;

@FindBy(css = "#states")
    public WebElement dropDown_states;

@FindBy(css = "#cities")
    public WebElement dropDown_cities;

@FindBy(css = "#postal")
    public WebElement textBox_postal;

@FindBy(css = ".btn.btn-outline-success.ml-3")
    public WebElement button_addressSubmit;

@FindBy(css = "#date")
    public WebElement textBox_date;

@FindBy(css = "#time")
    public WebElement textBox_time;

@FindBy(css = "#fee")
    public WebElement textBox_fee;
@FindBy(css = "#duration")
    public WebElement textBox_duration;
@FindBy(css = "#attendeeLimit")
    public WebElement textBox_attendeeLimit;
@FindBy(css = "#schedule")
    public WebElement textBox_schedule;
@FindBy(css = "#description")
    public WebElement textBox_description;

@FindBy(css = "#tac")
    public WebElement textBox_termsAndConditions;

@FindBy(css = "#eventImages")
    public WebElement textBox_eventImages;

@FindBy(css = ".btn.btn-outline-success.px-4")
    public WebElement button_createEventSubmit;

    @FindBy(xpath = "//button[@class='btn btn-outline-warning p-1 col-lg-3 col-12 ScheduledEvents_btn__1gJt'D]")
    public WebElement button_cancel;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary p-1 col-lg-5 col-12 ScheduledEvents_btn__1gJtD']")
    public WebElement button_mark_as_completed;

    @FindBy(xpath = "//button[@class='btn btn-outline-info p-1 col-lg-4 col-12 ScheduledEvents_btn__1gJtD']")
    public WebElement button_copy_link;

    @FindBy(xpath = "(//button[@class='btn btn-primary mr-4'])[1]")
    public WebElement button_Yes_cancel;

    @FindBy(css = ".Toastify__toast-body.toastr_custom-toastr__iiU37")
    public WebElement message_event_canceled;

    @FindBy(css = ".Toastify__toast-body.toastr_custom-toastr__iiU37")
    public WebElement message_event_deleted;

    @FindBy(css = ".Toastify__toast-body.toastr_custom-toastr__iiU37")
    public WebElement message_event_completed;

    @FindBy(css = ".Toastify__toast-body.toastr_custom-toastr__iiU37")
    public WebElement message_event_copied;

    @FindBy(xpath = "(//span[text()='CANCELED'])[1]")
    public WebElement message_canceled;

    @FindBy(xpath = "//button[text()='My Completed Events']")
    public WebElement button_completed_events;


    @FindBy(xpath = "(//span[text()='COMPLETED'])[1]")
    public WebElement message_completed;

    @FindBy(xpath = "//button[text()='No']")
    public WebElement button_noCancel;

    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement button_yesCancel;

}

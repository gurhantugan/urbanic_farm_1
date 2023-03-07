package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyEventsPage extends CommonPage {

    @FindBy(xpath = "//a[@class='Sidebar_section_btn__1sp6i h6 '][text()='My Events']")
    public WebElement link_MyEvents;

    @FindBy(xpath = "//button[@class='events-i-organize_btnCreate__2AWbt']")
    public WebElement button_Create_newEvents;

    @FindBy(css = "#title")
    public WebElement box_title;

    @FindBy(css = "#address2")
    public WebElement box_Address;

    @FindBy(css = "#date")
    public WebElement box_Date;

    @FindBy(css = "#time")
    public WebElement box_time;

    @FindBy(css = "#fee")
    public WebElement box_Fee;

    @FindBy(css = "#duration")
    public WebElement box_duration;

    @FindBy(css = "#attendeeLimit")
    public WebElement box_attendeeLimit;

    @FindBy(css = "#tac")
    public WebElement box_TermsAndConditions;

    @FindBy(css = ".btn.btn-outline-success.px-4")
    public WebElement button_Submit;

    @FindBy(css = "#title")
    public WebElement box_Title;

    @FindBy(css = "#address2")
    public WebElement box_AdressFirst;

    @FindBy(xpath = "//button[@class='btn btn-outline-success mb-1']")
    public WebElement button_Add;

    @FindBy(css = "#addressTitle")
    public WebElement box_addressTitle;

    @FindBy(css = "#address")
    public WebElement box_addressSecond;

    @FindBy(css = "#states")
    public WebElement box_states;

    @FindBy(css = "#cities")
    public WebElement box_cities;

    @FindBy(css = "#postal")
    public WebElement box_postal;

    @FindBy(xpath = "//button[@class='btn btn-outline-success ml-3']")
    public WebElement button_submit;

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

    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement button_cancel;

    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement button_delete;

    @FindBy(xpath = "//button[text()='Mark as Completed']")
    public WebElement button_mark_as_completed;

    @FindBy(xpath = "//button[text()='Copy Link']")
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


}

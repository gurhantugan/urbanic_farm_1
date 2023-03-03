package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyEventsPage extends CommonPage {

    @FindBy(xpath = "//a[@class='Sidebar_section_btn__1sp6i h6 '][text()='My Events']")
    public WebElement link_MyEvents;

    @FindBy(xpath = "//button[@class='events-i-organize_btnCreate__2AWbt']")
    public WebElement button_Create_newEvents;

    @FindBy(xpath = "//button[@class='btn btn-outline-warning p-1 col-lg-3 col-12 ScheduledEvents_btn__1gJt'D]")
    public WebElement button_cancel;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary p-1 col-lg-5 col-12 ScheduledEvents_btn__1gJtD']")
    public WebElement button_mark_as_completed;

    @FindBy(xpath = "//button[@class='btn btn-outline-info p-1 col-lg-4 col-12 ScheduledEvents_btn__1gJtD']")
    public WebElement button_copy_link;

}

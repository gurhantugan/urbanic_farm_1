package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyEventsPage extends CommonPage {

    @FindBy(xpath = "//a[@class='Sidebar_section_btn__1sp6i h6 '][text()='My Events']")
    public WebElement link_MyEvents;

    @FindBy(xpath = "//button[@class='events-i-organize_btnCreate__2AWbt']")
    public WebElement button_Create_newEvents;

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











}

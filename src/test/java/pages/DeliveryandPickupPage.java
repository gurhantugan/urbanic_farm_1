package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryandPickupPage extends CommonPage{

    @FindBy(css ="#SELLER_FLEXIBLE")
    public WebElement box_SellerFlexDel;

    @FindBy(xpath ="//input[@id='freeFlexibleDeliveryRange']")
    public WebElement box_freeFlexDel;

    @FindBy(xpath ="//input[@id='perMileCostFlex']")
    public WebElement box_perMileCostFlex;

    @FindBy(xpath ="//input[@id='minFreeFlexibleDeliveryOrder']")
    public WebElement box_minFreeFlexibleDeliveryOrder;

    @FindBy(xpath ="//input[@id='minFreeFlexibleDeliveryOrder']")
    public WebElement box_maxFlexibleDeliveryRange;

    @FindBy(xpath ="//select[@id='_deliveryBeginDay']")
    public WebElement toolbar_deliveryBeginDay;

    @FindBy(xpath ="//select[@id='_deliveryEndDay']")
    public WebElement toolbar_deliveryEndDay;

    @FindBy(xpath ="//select[@id='_orderByDay']")
    public WebElement toolbar_orderByDay;

    @FindBy(xpath ="//input[@id='_deliveryBeginTime']")
    public WebElement box_deliveryBeginTime;

    @FindBy(xpath ="//input[@id='_deliveryEndTime']")
    public WebElement box_deliveryEndTime;

    @FindBy(xpath ="//input[@id='_orderByTime']")
    public WebElement box_orderByTime;

    @FindBy(xpath ="(//button[@id='hubManageSaveButton'])[3]")
    public WebElement button_update;

    @FindBy(xpath ="(//button[@id='hubManageSaveButton'])[2]")
    public WebElement button_plus;

    @FindBy(xpath ="//a[@class='Navbar_textLink__f6_Al cursor-pointer ml-4 mr-3 text-capitalize']")
    public WebElement user;

    @FindBy(css ="[href='/account/delivery']")
    public WebElement delivery_section;

    //a[@class='Sidebar_section_btn__1sp6i h6 Sidebar_active__1HCV5']






















}

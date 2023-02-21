package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeliveryPickUpSettingsPage extends CommonPage {

    @FindBy (xpath = "//*[@id='SELLER_FLEXIBLE']")
    public WebElement checkbox_Seller_Flexible;

    @FindBy (css = "[id=\"freeDeliveryRange\"]")
    public WebElement textbox_FreeDeliveryRange;

    @FindBy (css = "[id=\"perMileCost\"]")
    public WebElement textbox_PerMileCost;

    @FindBy (css = "[id=\"maxDeliveryRange\"]")
    public WebElement textbox_MaxDeliveryRange;

    @FindBy (css = "[id=\"estimatedDeliveryTime\"]")
    public WebElement textbox_EstimatedDeliveryTime;

    @FindBy (css = "[id=\"providingDistance\"]")
    public WebElement textbox_UpTo;

    @FindBy (css = "[id=\"minFreeDeliveryOrder\"]")
    public WebElement textbox_MinFreeDeliveryOrder;

    @FindBy (xpath = "(//*[@id=\"hubManageSaveButton\"])[3]")
    public WebElement button_Update;

    @FindBy (xpath = "//*[text()='Your delivery settings have been successfully updated']")
    public WebElement allert_Message;

    @FindBy (xpath = "(//*[@id=\"hubManageSaveButton\"])[1]")
    public WebElement button_Plus;

    @FindBy (xpath = "//*[@id=\"estimatedTime\"]")
    public List<WebElement> textbox_EstimatedTimeList;

    @FindBy (xpath = "//*[@id=\"providingDistance\"]")
    public List<WebElement> textbox_DistanceList;






























































}

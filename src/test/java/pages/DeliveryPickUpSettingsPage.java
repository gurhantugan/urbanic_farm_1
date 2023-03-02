package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeliveryPickUpSettingsPage extends CommonPage {

        @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[3]/div/div/div[1]/a[3]")
        public WebElement button_deliveryAndPickUp;

        @FindBy(linkText = "Buyer picks up on the vine")
        public WebElement button_buyerPickUpOnTheVine;

        @FindBy(xpath = "//*[@class='col-md-2 col-sm-6 col-12']")
        public WebElement button_yourAvailableHours;

        @FindBy(id = "startTime2")
        public WebElement startTime;

        @FindBy(id = "endTime2")
        public WebElement endTime;

        @FindBy(xpath = "//button[.=\"Update\"]")
        public WebElement button_update;

        @FindBy(className = "Toastify__toast-body toastr_custom-toastr__iiU37")
        public WebElement validationMessage;

        @FindBy(xpath = "//*[@id=\"1siao9axx\"]/div[1]")
        public WebElement validationAlert;

        @FindBy(xpath = "//*[@id='SELLER_FLEXIBLE']")
        public WebElement checkbox_Seller_Flexible;

        @FindBy(css = "[id=\"freeDeliveryRange\"]")
        public WebElement textbox_FreeDeliveryRange;

        @FindBy(css = "[id=\"perMileCost\"]")
        public WebElement textbox_PerMileCost;

        @FindBy(css = "[id=\"maxDeliveryRange\"]")
        public WebElement textbox_MaxDeliveryRange;

        @FindBy(css = "[id=\"estimatedDeliveryTime\"]")
        public WebElement textbox_EstimatedDeliveryTime;

        @FindBy(css = "[id=\"providingDistance\"]")
        public WebElement textbox_UpTo;

        @FindBy(css = "[id=\"minFreeDeliveryOrder\"]")
        public WebElement textbox_MinFreeDeliveryOrder;

        @FindBy(xpath = "(//*[@id=\"hubManageSaveButton\"])[3]")
        public WebElement button_Update;

        @FindBy(xpath = "//*[text()='Your delivery settings have been successfully updated']")
        public WebElement allert_Message;

        @FindBy(xpath = "(//*[@id=\"hubManageSaveButton\"])[1]")
        public WebElement button_Plus;

        @FindBy(xpath = "//*[@id=\"estimatedTime\"]")
        public List<WebElement> textbox_EstimatedTimeList;

        @FindBy(xpath = "//*[@id=\"providingDistance\"]")
        public List<WebElement> textbox_DistanceList;

        @FindBy(css = ".custom-control-input.DeliverySettings_regular-checkbox__1gkSd")
        public List<WebElement> checkbox_all;

        @FindBy(name = "BUYER_PICKUP")
        public WebElement checkbox_buyerPicksUp;

        @FindBy(name = "SELLER_DELIVERY")
        public WebElement checkbox_sellerDeliversTheProducts;

        @FindBy(name = "SELLER_FLEXIBLE")
        public WebElement checkbox_sellerFlexibleDelivery;

}


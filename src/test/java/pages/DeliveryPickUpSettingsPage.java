package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeliveryPickUpSettingsPage extends CommonPage{

        @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[3]/div/div/div[1]/a[3]")
        public WebElement button_deliveryAndPickUp;

        @FindBy(linkText = "Buyer picks up on the vine")
        public WebElement button_buyerPickUpOnTheVine;
        @FindBy(xpath = "(//label[@class='custom-control-label ml-1'])[2]")
        public WebElement checkbox_buyerPicksUp;

        @FindBy(xpath = "//*[@class='col-md-2 col-sm-6 col-12']")
        public WebElement button_yourAvailableHours;

        @FindBy(id = "startTime2")
        public WebElement startTime;

        @FindBy(id = "startTime")
        public WebElement pickUpStartTime;

        @FindBy(id = "endTime2")
        public WebElement endTime;

        @FindBy(id = "endTime")
        public WebElement pickUpEndTime;

        @FindBy(xpath = "//button[.=\"Update\"]")
        public WebElement button_update;

        @FindBy(css = ".Toastify__toast-body.toastr_custom-toastr__iiU37")
        public  WebElement validationMessage;

        @FindBy(xpath ="//*[@id=\"1siao9axx\"]/div[1]")
        public  WebElement validationAlert;

        @FindBy(css = ".custom-control-input.DeliverySettings_regular-checkbox__1gkSd")
        public List<WebElement> checkbox_all;

        //@FindBy(css = "#BUYER_PICKUP")
        //public WebElement checkbox_buyerPicksUp;

        @FindBy(name = "SELLER_DELIVERY")
        public WebElement checkbox_sellerDeliversTheProducts;

        @FindBy(name = "SELLER_FLEXIBLE")
        public WebElement checkbox_sellerFlexibleDelivery;

        @FindBy(xpath = "(//span[.='Your available hours:'])[2]")
        public WebElement text_availableHours;




    }

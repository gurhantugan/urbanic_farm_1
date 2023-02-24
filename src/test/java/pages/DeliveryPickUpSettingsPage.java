package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryPickUpSettingsPage extends CommonPage{

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
        public  WebElement validationMessage;

        @FindBy(xpath ="//*[@id=\"1siao9axx\"]/div[1]")
        public  WebElement validationAlert;

    }

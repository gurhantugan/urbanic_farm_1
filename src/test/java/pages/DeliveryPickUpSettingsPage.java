package pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryPickUpSettingsPage extends CommonPage {

@FindBy(xpath ="//*[@id=\"__next\"]/div[4]/div[3]/div/div/div[1]/a[3]" )
public WebElement button_deliveryAndPickUp;

@FindBy(name = "deliveryType")
public WebElement button_buyerPickUpOnTheVine;

@FindBy(xpath = "//*[@class='col-md-2 col-sm-6 col-12']")
public WebElement button_yourAvailableHours;

}

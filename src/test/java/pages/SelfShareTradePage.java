package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelfShareTradePage extends CommonPage{

    @FindBy(xpath = "//span[text()='Cart']")
    public WebElement button_cart;

   @FindBy(xpath = "//span[text()='Sell-Share-Trade']")
   public WebElement button_Sell_Share_Trade;

   @FindBy(linkText = "About us")
    public WebElement link_About_us;

    @FindBy(linkText = "Contact us")
    public WebElement link_Contact_us;

    @FindBy(linkText = "Scheduled delivery")
    public WebElement link_Scheduled_delivery;

    @FindBy(xpath = "//span[text()='Events']")
    public WebElement link_Events;

    @FindBy(linkText = "Logout")
    public WebElement link_Logout;

    @FindBy(xpath = "//span[text()='Cart']")
    public WebElement link_Cart;

    @FindBy(xpath = "//nav/a[text()='Huseyin']")
    public WebElement button_navHuseyin;
    
    @FindBy(xpath = "(//a[text()='Logout'])[1]")
    public WebElement button_logout;

    @FindBy(css = ".Notifications_notificationIcon__3fwZN")
    public WebElement icon_notifications;
    
    @FindBy(css = ".Notifications_notificationEmptyText__UyZF4")
    public WebElement icon_notificationsHeader;

}

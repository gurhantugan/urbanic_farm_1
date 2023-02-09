package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelfShareTradePage extends CommonPage{

    @FindBy(xpath = "//span[text()='Cart']")
    public WebElement button_cart;
    @FindBy(xpath = "//nav/a[text()='Huseyin']")
    public WebElement button_navHuseyin;
    @FindBy(xpath = "(//a[text()='Logout'])[1]")
    public WebElement button_logout;

    @FindBy(css = ".Notifications_notificationIcon__3fwZN")
    public WebElement icon_notifications;
    @FindBy(css = ".Notifications_notificationEmptyText__UyZF4")
    public WebElement icon_notificationsHeader;
}

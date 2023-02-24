package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OrdersPage extends CommonPage {

    @FindBy(css = "a[href='/account/orders']")
    public WebElement button_orders;

    @FindBy(css = "h3.text-capitalize")
    public WebElement text_yourOrders;

    @FindBy(xpath = "//a[text()='View order details']")
    public WebElement button_viewOrderDetails;

    @FindBy(xpath = "//a[text()='Seller page']")
    public WebElement button_sellerPage;

    @FindBy(xpath = "(//div[@class='sc-gtsrHT gfuSqG'])[1]")
    public WebElement field_orderSummary;

    @FindBy(xpath = "(//div[@class='sc-gtsrHT gfuSqG'])[2]")
    public WebElement field_orderContents;

    @FindBy(xpath = "//span[text()='Seller address']")
    public WebElement text_sellerAdress;

    @FindBy(xpath = "//a[text()='View larger map']")
    public WebElement button_viewLargerMap;

    @FindBy(xpath = "(//span[text()='Reject all'])[1]")
    public WebElement button_rejectAll;

    @FindBy(css = ".text-muted.OrderCard_order-detail__container__3kd-R>span")
    public List<WebElement> idOfOrders;
    @FindBy(xpath = "//*[text()='View order details']")
    public List<WebElement> viewOrderDetails;

    @FindBy(css = "div.h3>span")
    public WebElement orderDetails;

    @FindBy(xpath = "//*[text()='Order summary']")
    public WebElement orderSummary;

    @FindBy(xpath = "//*[text()='Order contents']")
    public WebElement orderContents;

    @FindBy(xpath = "//*[text()='Seller page']")
    public List<WebElement> buttons_sellerPage;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public WebElement button_addToCard;

    @FindBy(xpath = "//*[text()='Seller address']")
    public List<WebElement> texts_sellerAddress;

    @FindBy(css = "iframe.d-block")
    public List<WebElement> iframe;


    @FindBy(xpath = "(//span[@class='font-weight-bold'])[2]")
    public WebElement order_number;

    @FindBy(xpath = "(//div[@class='list-group-item list-group-item-action  active'])[1]")
    public WebElement order_status_buyer;

    @FindBy(xpath = "//span[@class='Notifications_filterButton__3COw5'][text()='Mark all as read']")
    public WebElement link_mark_all_as_read;

    @FindBy(css = ".Notifications_emptyText__3BV2W")
    public WebElement text_no_unread_notifications;

    @FindBy(css=".Notifications_notificationEmptyIcon__39m7C")
    public WebElement cross_notification;
}

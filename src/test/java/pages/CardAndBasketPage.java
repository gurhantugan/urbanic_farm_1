package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CardAndBasketPage extends CommonPage{

    @FindBy(xpath = "//button[@type='button'][normalize-space()='Add to Cart']")
    public List<WebElement> button_addToCard;

    @FindBy(xpath = "(//span[contains(text(),'+')])[1]")
    public WebElement button_plus;

    @FindBy(css = ".counter_number__3dHrY")
    public List<WebElement> number_quantity;

    @FindBy(xpath = "(//td[@class='text-end py-3'])[3]")
    public WebElement totalCost;

    @FindBy(xpath = "(//tr/td)[3]")
    public WebElement price;

    @FindBy(xpath = "(//td[@class='py-3 align-middle text-end'])[1]")
    public WebElement button_delete;

    @FindBy(xpath = "//h5")
    public WebElement text;

    @FindBy(xpath = "(//tbody[@class='border-bottom']/tr/th)[1]")
    public WebElement seller_name;

    @FindBy(xpath = "(//tbody[@class='border-bottom']/tr/th)[2]")
    public WebElement product_name;

    @FindBy(xpath = "//button[@class='btn btn-block font-weight-bold Basket_checkOutBtn__1946L']")
    public WebElement button_checkOut;

    @FindBy(xpath = "//button[@class='proceed_btn__vZFGE'][text()='Next']")
    public WebElement button_Next;

    @FindBy(xpath = "//button[@class='proceed_btn__vZFGE'][text()='Go To Payment']")
    public WebElement button_GoToPayment;

    @FindBy(css=".css-ltr-1m7plzc-button-Button")
    public WebElement button_paypalLogin;

    @FindBy(css="#email")
    public WebElement email_paypal;

    @FindBy(css="#password")
    public WebElement password_paypal;

    @FindBy(css="#btnLogin")
    public WebElement button_loginLast_paypal;

    @FindBy(css="#payment-submit-btn")
    public WebElement button_complete_purchase;

    @FindBy(css=".mt-2.font-weight-bold")
    public WebElement text_payment_successful;

    @FindBy(xpath = "//*[@font-size='1.3em']")
    public WebElement notification_bell;

    @FindBy(linkText = "Your Order is Placed")
    public WebElement link_order_placed;

    @FindBy(css=".Notifications_notificationDownContent__1R3pg>span")
    public WebElement cross_close_notification;

    @FindBy(css = "td.align-middle.text-end svg")
    public List<WebElement> removeProductFromCart;

    @FindBy(css = "button.Basket_checkOutBtn__1946L")
    public WebElement proceedToCheckOut;

    @FindBy(css = "button.collapsible_toggle__1oudq")
    public WebElement enterPromoCode_button;

    @FindBy(css = "[placeholder='your promo code']")
    public WebElement enterPromoCode_text;

    @FindBy(id = "promo-code")
    public WebElement enterPromoCode_apply;

    @FindBy(xpath = "(//td[@class='text-end py-3'])[1]/p")
    public WebElement cartTotal_subtotal;



}

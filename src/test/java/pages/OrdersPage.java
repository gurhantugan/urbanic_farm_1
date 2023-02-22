package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends CommonPage {

    @FindBy(xpath = "//a[text()='Orders']")
    public WebElement button_orders;

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
}

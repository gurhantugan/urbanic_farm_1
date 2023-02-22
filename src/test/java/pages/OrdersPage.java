package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends CommonPage{

    @FindBy(css = "a[href='/account/orders']")
    public WebElement button_orders;

    @FindBy(css = "h3.text-capitalize")
    public WebElement text_yourOrders;
}

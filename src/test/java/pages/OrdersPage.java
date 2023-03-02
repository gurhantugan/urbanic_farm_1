package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends CommonPage {

    @FindBy(css = ".d-flex.flex-column:nth-child(3)")
    public WebElement columnCard;

    @FindBy(xpath = "(//span[@class='cursor-pointer text-success h6'])[1]")
    public WebElement rateTheProduct;

    @FindBy(css = ".btn.btn-outline-info.mt-2")
    public WebElement rateTheProduct_submitButton;




}

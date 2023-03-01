package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SoldItemsPage extends CommonPage {

    @FindBy(xpath = "(//span[@class='text-muted'])[1]")
    public WebElement soldItems_orderID;

    @FindBy(xpath = "(//select[@class='cursor-pointer shadow-sm px-3 mb-5 bg-white rounded h6'])[1]")
    public WebElement soldItems_orderStatus;


}

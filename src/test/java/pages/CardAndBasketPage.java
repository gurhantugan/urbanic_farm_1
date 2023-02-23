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

    @FindBy(xpath = "//tbody[5]/tr[1]/td[5]//*[name()='svg']")
    public WebElement button_delete;

    @FindBy(css = "//h5[contains(text(),'Are you sure you want to delete the product?')]")
    public WebElement text;
}

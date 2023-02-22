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
}

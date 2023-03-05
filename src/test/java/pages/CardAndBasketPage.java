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

//    @FindBy(xpath = "(//button[contains(text(),'Yes')])[1]")
//    public WebElement buttonYes;
//
//    @FindBy(xpath = "(//button[contains(text(),'No')])[1]")
//    public WebElement buttonNo;
    
}

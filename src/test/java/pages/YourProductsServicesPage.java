package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourProductsServicesPage extends CommonPage{
    @FindBy(css = ".col-6.col-sm-4.text-center.mb-3.cursor-pointer.text-secondary")
    public List<WebElement> links_allProducts;

    @FindBy(css = ".GoBack_goback__6sa4O")
    public WebElement button_goBack;

}

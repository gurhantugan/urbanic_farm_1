package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends CommonPage{

    @FindBy(xpath = "//a[text()='Address']")
    public WebElement button_adress;
}

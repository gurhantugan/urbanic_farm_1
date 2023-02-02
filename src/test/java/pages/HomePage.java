package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonPage {

    @FindBy(css = "//a[text()='Login']")
    public WebElement button_login;

    @FindBy(xpath = "(//a[text()='Logout'])[2]")
    public WebElement button_logout;

    @FindBy(xpath = "//a[text()='Register']")
    public  WebElement button_register;

    @FindBy(xpath = "//button[text()='Get fresh produce']")
    public WebElement button_getFreshProduce;

    @FindBy(xpath = "//a[text()='Privacy policy']")
    public WebElement link_privacyPoliciy;
}

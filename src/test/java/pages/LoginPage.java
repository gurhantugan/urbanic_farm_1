package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonPage {

    @FindBy(css = "[name='email']")
    public WebElement textbox_email;

    @FindBy(css = "[name='password']")
    public WebElement textbox_password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement button_login;

    @FindBy(css = "[type='submit']")
    public WebElement button_submit;

    @FindBy(xpath = "//span[text()='Cart']")
    public WebElement button_cart;

    @FindBy(xpath = "//a[@class='Navbar_textLink__f6_Al cursor-pointer ml-4 mr-3 text-capitalize']")
    public WebElement button_accountHome;


}

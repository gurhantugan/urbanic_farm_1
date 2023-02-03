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

    @FindBy(css = ".text-info")
    public WebElement button_forgotPassword;

    @FindBy(css = ".mb-4")
    public WebElement message_pleaseVerifyYourEmail;

    @FindBy(css = ".input-group>.form-control")
    public WebElement textbox_verifyEmail;

    @FindBy(css = ".input-group>.btn")
    public WebElement button_verifyEmail;

    @FindBy(css = ".text-center>.alert")
    public WebElement message_emailIsSent;




}

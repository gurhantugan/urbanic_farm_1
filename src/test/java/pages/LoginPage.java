package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonPage {

    @FindBy(css = "[name='email']")
    private WebElement textbox_email;

    @FindBy(css = "[name='password']")
    private WebElement textbox_password;

    @FindBy(css = "[type='submit']")
    private WebElement button_submit;

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

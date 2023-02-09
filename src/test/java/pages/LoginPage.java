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


    @FindBy(xpath = "//a[@class='Navbar_textLink__f6_Al cursor-pointer ml-4 mr-3 text-capitalize']")
    public WebElement button_accountHome;

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

    @FindBy(xpath = "//*[@name='plainPassword']")
    public WebElement textbox_newPasswordofResetPage;

    @FindBy(xpath = "//*[@name='confirmPassword']")
    public WebElement textbox_confirmPasswordofResetPage;

    @FindBy(css = ".btn")
    public WebElement button_submitOfResetPage;

    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement message_changePassword;


    @FindBy(xpath = "//input[@name='email']")
    public WebElement button_emailOnLoginPage;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement button_passwordOnLoginPage;

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement buttonLogin;

    @FindBy(xpath = "//*[@name=\"email\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[text()='Forgot Password']")
    public WebElement forgotPasswordText;

    @FindBy(xpath = "//*[text()='Please verify your email.']")
    public WebElement pleaseText;


    @FindBy(xpath = "(//a[@class='Navbar_textLink__f6_Al mr-4 ml-1'])[1]")
    public WebElement loginAboutLink;







}

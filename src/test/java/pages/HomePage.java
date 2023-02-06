package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonPage {

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButton;

    //@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='text']/*[local-name()='tspan'][1]")
   // public WebElement logoutButton;
    @FindBy(xpath ="//label[@for='allCategories']")
    public  WebElement hometitle;

    @FindBy(xpath = "//body/div/div/div/div/a[@href='/auth/login']")
    public WebElement button_navbarLogin;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement box_email;
    //@FindBy(css = ".Footer_listCon__29kxp>li>a[href='/mobile']")

    @FindBy(xpath = "//input[@type='password']")
    public WebElement box_password;
@FindBy(xpath = "//div/div/div/div/div//a[.='get the app']")
    public WebElement button_getApp;

    //div/div/div/ul/li//a[@href='/mobile']

    //*[contains(text(),'get the app')]
    @FindBy(xpath = "//div/div//a[@href='https://apps.apple.com/tr/app/urbanicfarm/id1581829783']")
    public WebElement link_Apple;

    @FindBy(id = "registration_form_firstname")
    public WebElement box_regFirstname;

    @FindBy(id = "registration_form_middlename")
    public WebElement box_regMidname;

    @FindBy(id = "registration_form_lastname")
    public WebElement box_regLasttname;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement box_regEmail;

    @FindBy(id = "registration_form_plainPassword")
    public WebElement box_regPassword;

    @FindBy(id = "registration_form_confirmPassword")
    public WebElement box_regConfirmPassword;






}

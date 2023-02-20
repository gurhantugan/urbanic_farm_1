package pages;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonPage {

//    @FindBy(xpath = "//a[text()='Login']")
//    public WebElement loginButton;
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement button_login;

    //@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='text']/*[local-name()='tspan'][1]")
    // public WebElement logoutButton;
    @FindBy(xpath = "//label[@for='allCategories']")
    public WebElement hometitle;

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

    @FindBy(xpath = "(//a[text()='Logout'])[2]")
    public WebElement button_logout;

    @FindBy(xpath = "//div[@class='Navbar_linkContainer__2jWIM']//a[text()='About Us']")
    public WebElement link_aboutUs;


    @FindBy(xpath = "(//button[@class='section-2_shopButton__17T04'])[2]")
    public WebElement button_shellYourProduct;

    @FindBy(xpath = "//a[.='about us']")
    public WebElement link_aboutUs_footer;

    @FindBy(xpath = "//a[normalize-space()='Support the local food movement']")
    public WebElement link_support;

    @FindBy(xpath = "//a[text()='Terms of service']")
    public WebElement termsOfServiceLink;

    @FindBy(xpath = "(//a[@class='Navbar_textLink__f6_Al mr-4'])[4]")
    public WebElement link_contactUs;

    @FindBy(xpath = "//a[text()='Discover Local Sellers Near You']")
    public WebElement link_discoverLocalSellers;

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement button_register;

    @FindBy(xpath = "//button[text()='Get fresh produce']")
    public WebElement button_getFreshProduce;

    @FindBy(xpath = "//a[text()='Privacy policy']")
    public WebElement link_privacyPoliciy;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/urbanicfarm/']")
    public WebElement button_linkedin;


    @FindBy(xpath = "(//a[text()='Blog'])[1]")
    public WebElement button_blog;


    @FindBy(css = ".btn.text-uppercase")
    public List<WebElement> links_sell_share_trade;

    @FindBy(xpath = "//a[text()='Sell-Share-Trade']")
    public WebElement link_sellShareTrade;

    @FindBy(xpath = "//a[text()='contact us']")
    public WebElement link_contactUsFooter;
    public List<WebElement> buttons_sell_share_trade;

    @FindBy(xpath ="(//*[@class=\"Navbar_textLink__f6_Al mr-4\"])[2]")
    public WebElement button_explore;
  

    @FindBy(xpath ="(//*[@class=\"Footer_footer-col__2BbbT\"]//a)[3]")
    public WebElement buttonFooterBlog;

    @FindBy(xpath ="//*[text()='+1 (669) 696-5906']")
    public WebElement phoneNumber;



    @FindBy(xpath = "//*[text()='Register Now']")
    public WebElement button_registerNow;

    @FindBy(xpath = "//button[@class='section-9_gofunderButton__32gaj']")
    public WebElement button_wefunder;
    
  @FindBy(xpath = "//div[@class='alert alert-warning ']/span")
    public WebElement adressMessageText;

    @FindBy(linkText = "here")
    public WebElement linkAdress;

    @FindBy(css = "[href*='facebook']")
    public WebElement btn_facebook;
}


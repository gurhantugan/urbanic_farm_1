package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonPage {

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement button_login;

    @FindBy(xpath = "(//a[text()='Logout'])[2]")
    public WebElement button_logout;

    @FindBy(xpath = "//div[@class='Navbar_linkContainer__2jWIM']//a[text()='About Us']")
    public WebElement link_aboutUs;

    @FindBy(xpath = "//a[text()='Terms of service']")
    public WebElement termsOfServiceLink;

    @FindBy(xpath = "(//a[@class='Navbar_textLink__f6_Al mr-4'])[4]")
    public WebElement link_contactUs;

    @FindBy(xpath = "//a[text()='Discover Local Sellers Near You']")
    public WebElement link_discoverLocalSellers;

    @FindBy(xpath = "//a[text()='Register']")
    public  WebElement button_register;

    @FindBy(xpath = "//button[text()='Get fresh produce']")
    public WebElement button_getFreshProduce;

    @FindBy(xpath = "//a[text()='Privacy policy']")
    public WebElement link_privacyPoliciy;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/urbanicfarm/']")
    public WebElement button_linkedin;

    @FindBy(css = ".btn.text-uppercase")
    public List<WebElement> buttons_sell_share_trade;
}

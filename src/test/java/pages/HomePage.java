package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonPage {

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement button_login;

    @FindBy(xpath = "(//a[text()='Logout'])[2]")
    public WebElement button_logout;

    @FindBy(xpath = "//div[@class='Navbar_linkContainer__2jWIM']//a[text()='About Us']")
    public WebElement link_aboutUs;

    @FindBy(xpath = "(//button[@class='section-2_shopButton__17T04'])[2]")
    public WebElement button_shellYourProduct;

    @FindBy(xpath = "//a[@class='Navbar_textLink__f6_Al mr-4'][normalize-space()='About Us']")
    public WebElement link_AboutUs;

    @FindBy(xpath = "//a[normalize-space()='Support the local food movement']")
    public WebElement link_support;
}

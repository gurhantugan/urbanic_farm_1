package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {

@FindBy(xpath = "/html/body/div/div[4]/div[1]/div[2]/a[5]")
////a[@class='Navbar_textLink__f6_Al mr-4'][5]
    public WebElement loginButton;

@FindBy(xpath = "//input[@type='email']")
    public WebElement buyerEmail;

@FindBy(xpath = "//input[@type='password']")
    public WebElement buyerPassword;
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetInTouchPage extends CommonPage{
    @FindBy(xpath = "//button[contains(text(),'Send Message')]")
    public WebElement button_SendMessage;

    @FindBy(xpath = "//button[contains(text(),'Send Message')]")
    public WebElement button_yourNameWarning;

    @FindBy(xpath = "//div[contains(text(),'Please enter a valid email address.')]")
    public WebElement button_yourEmailWarning;

    @FindBy(xpath = "//div[contains(text(),'Please enter a message with at least 10 characters.')]")
    public WebElement button_yourMessageWarning;

    @FindBy(xpath = "//input[@placeholder='Your Name']")
    public WebElement button_yourName;

    @FindBy(xpath = "//input[@placeholder='Your Email']")
    public WebElement button_yourEmail;

    @FindBy(xpath = "//textarea[@placeholder='Message']")
    public WebElement button_yourMessage;

    @FindBy(xpath = "//div[contains(text(),'Thanks for your message! It has been sent to us.')]")
    public WebElement ToastMessage;


}

package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonPage {

    @FindBy(css = "[name='email']")
    private WebElement emailText;

    @FindBy(css = "[name='password']")git
    private WebElement passwordText;

    @FindBy(css = "[type='submit']")
    private WebElement submitButton;




}

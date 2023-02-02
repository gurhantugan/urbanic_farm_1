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




}

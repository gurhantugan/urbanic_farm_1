package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends CommonPage{
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement button_Submit;
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
    @FindBy(xpath = "//style[@data-n-href=\"/_next/static/css/8979904a68b7c58e206f.css\"]")
    public WebElement alert_unmatchedPassw;


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends CommonPage {


    @FindBy(xpath = "(//a[contains(text(),'Register')])[1]")
    public WebElement button_register;

    @FindBy(xpath = "(//input[@class='form-control mb-3 shadow-input validation_validation__iLr7O'])[1]")
    public WebElement button_FirstName;

    @FindBy(xpath = "//input[@id='registration_form_lastname']")
    public WebElement button_LastName;

    @FindBy(xpath = "(//input[@class='form-control mb-1 shadow-input validation_validation__iLr7O'])[2]")
    public WebElement button_Email;

    @FindBy(xpath = "//input[@id='registration_form_plainPassword']")
    public WebElement button_Password;

   @FindBy(id = "registration_form_firstname")
    public WebElement firstNameBox;

@FindBy(xpath = "//input[@title='This field should only contain letters. e.g. john'][1]")
    public WebElement alertSign;

@FindBy(id="registration_form_lastname")
    public WebElement lastnameBox;

@FindBy(id = "registration_form_middlename")
    public WebElement middleNameBox;

@FindBy(id="registration_form_email")
    public WebElement emailBox;

@FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCodeBox;

}

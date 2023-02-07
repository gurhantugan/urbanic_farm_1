package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends CommonPage {

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

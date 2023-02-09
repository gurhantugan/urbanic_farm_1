package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import static utilities.Driver.getDriver;

public class RegisterPage extends CommonPage {

    @FindBy(css = "#registration_form_firstname")
    public WebElement firstName_registerForm;

    // ctrl D -> duplicate
    @FindBy(css = "#registration_form_lastname")
    public WebElement lastName_registerForm;


    // 2. yol
    // public WebElement webElement = getDriver().findElement(By.cssSelector("#registration_form_firstname"));

    @FindBy(css = "#registration_form_firstname")
    public WebElement firstname;

    @FindBy(css = "#registration_form_middlename")
    public WebElement middleName;

    @FindBy(css = "#registration_form_lastname")
    public WebElement lastName;

    @FindBy(css = "#registration_form_email")
    public WebElement email;

    @FindBy(css = "#registration_form_plainPassword")
    public WebElement password;

    @FindBy(css = "#registration_form_confirmPassword")
    public WebElement confirmPassword;

    @FindBy(css = "[name='zipCode']")
    public WebElement zipCode;

    @FindBy(css = ".btn.alazea-btn")
    public WebElement registerButton;

    @FindBy(xpath = "//h1")
    public WebElement welcome;

    @FindBy(xpath = "//h2")
    public WebElement whatWouldYouLikeToDo;

    @FindBy(xpath = "//a[text()='Buy local food']")
    public WebElement buyLocalFood;

    @FindBy(xpath = "//a[text()='Sell local food']")
    public WebElement sellLocalFood;

    @FindBy(xpath = "//a[text()='Provide service for gardening']")
    public WebElement serviceForGardening;

    @FindBy(xpath = "//a[text()='I will do all']")
    public WebElement willDoAll;

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

    @FindBy(id = "registration_form_lastname")
    public WebElement lastnameBox;

    @FindBy(id = "registration_form_middlename")
    public WebElement middleNameBox;

    @FindBy(id = "registration_form_email")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCodeBox;

    @FindBy(xpath = "//span[text()='Events']")
    public WebElement button_Events;

    @FindBy(xpath = "//button[text()='Register']")
    public WebElement button_eventRegister;

}

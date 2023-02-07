package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends CommonPage{

    @FindBy(xpath = "//button[text()='Add New Address']")
    public WebElement button_addNewAddress;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement textBox_searchPlaces;

    @FindBy(xpath = "//span[contains(text(),'Henry Ford')]")
    public WebElement select_firstAddress;

    @FindBy(xpath = "//label[text()='Address Title*']")
    public WebElement title_addressTitle;

    @FindBy(xpath = "//label[text()='Address*']")
    public WebElement title_address;

    @FindBy(xpath = "//label[text()='State*']")
    public WebElement title_state;

    @FindBy(xpath = "//label[text()='City*']")
    public WebElement title_city;

    @FindBy(xpath = "//label[text()='Postal/Zip*']")
    public WebElement title_postal;

    @FindBy(xpath = "//label[contains(text(),'delivery address')]")
    public WebElement title_deliveryAddress;

    @FindBy(xpath = "//label[contains(text(),'sales address')]")
    public WebElement title_salesAddress;

    @FindBy(xpath = "//input[@id='addressTitle']")
    public WebElement textBox_home;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement textBox_address;

    @FindBy(xpath = "//input[@id='states']")
    public WebElement textBox_states;

    @FindBy(xpath = "//input[@id='citiesDataIdAddAddress']")
    public WebElement textBox_city;

    @FindBy(xpath = "//input[@id='postal']")
    public WebElement textBox_postal;

    @FindBy(xpath = "//input[@id='isDefault']")
    public WebElement checkBox_deliveryAddress;

    @FindBy(xpath = "//input[@id='isSellerAddress']")
    public WebElement checkBox_sellerAddress;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement button_submit;

    @FindBy(xpath = "//div[text()='Your Address successfully added']")
    public WebElement message_successful;
}

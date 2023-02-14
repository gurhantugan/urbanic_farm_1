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

    @FindBy(css = "button[class='btn btn-outline-success']")
    public WebElement addNewAddress_button;

    @FindBy(xpath = "//input[@placeholder='Search Places ...']")
    public WebElement searchPlace;

    @FindBy(xpath = "//li[@role='option'][1]")
    public WebElement dropDownMenu;

    @FindBy(xpath = "//div[text()='Your Address successfully added']")
    public WebElement warningMessage_successfullyAdded;

    @FindBy(xpath = "//button[text()='Remove']")
    public WebElement button_remove;

    @FindBy(xpath = "//button[contains(text(),'My Sales Address')]")
    public WebElement button_MySalesAddress;

    @FindBy(xpath = "//span[contains(text(),'My delivery address')]")
    public WebElement text_Mydeliveryaddress;

    @FindBy(xpath = "//button[contains(text(),'Non Selected Address')]")
    public WebElement button_NonSelectedAddress;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement button_Edit;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement box_address;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement button_submit2;

    @FindBy(xpath = "//div[contains(text(),'Your Address successfully updated')]")
    public WebElement warningMessage_yourAddressSuccessfullyUpdated;

    @FindBy(xpath = "//button[contains(text(),'Remove')]")
    public WebElement button_remove2;

    @FindBy(xpath = "(//h5[@class='text-center mb-4'][contains(text(),'Are you sure to delete')])[1]")
    public WebElement box_textDelete;

//    @FindBy(xpath = "(//button[contains(text(),'No')])[2]")
//    public WebElement button_No;
//
//    @FindBy(xpath = "(//button[contains(text(),'Yes')])[1]")
//    public WebElement button_Yes;

    @FindBy(xpath = "//div[contains(text(),'Address deleted')]")
    public WebElement getWarningMessage_addressDeleted;



}

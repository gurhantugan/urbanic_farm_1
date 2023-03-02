package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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



    @FindBy(xpath = "//button[@name='delivery']")
    public WebElement button_deliveryAddress;

    @FindBy(xpath = "//button[@name='sales']")
    public WebElement button_salesAddress;

    @FindBy(xpath = "//div[@class='card-body']")
    public WebElement body_AddressCard;

 @FindBy(xpath = "//span[@class='h6 ml-2']")
    public List<WebElement> adresses_dropdown;



   @FindBy(xpath = "//input[@id='address']")
   public WebElement address_Bar;

    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement button_cancel;

    @FindBy(linkText = "Logout")
    public WebElement logout_button;

    @FindBy(xpath = "//button[@class='mr-2 btn btn-outline-warning']")
    public WebElement button_edit;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--bottom-right']")
    public WebElement message_update;

    @FindBy(id = "isSellerAddress")
    public WebElement checkbox_sales_address;

    @FindBy(xpath = "//div[@role='alert']/span")
    public WebElement message_address_notset;

    @FindBy(xpath = "//span[text()='My delivery address']")
    public WebElement title_delivery_address;

    @FindBy(className = "AddAddressModal_inlineErrormsg__2Fw2s")
    public WebElement message_valid_zipcode;

    @FindBy(xpath ="//button[@class='btn btn-outline-info']")
    public WebElement delivery_button;

    @FindBy(xpath = "//input[@id='addressTitle']")
    public WebElement address_title;



}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourProductsServicesPage extends CommonPage{

    @FindBy(css = ".col-6.col-sm-4.text-center.mb-3.cursor-pointer.text-secondary")
    public List<WebElement> links_allProducts;

    @FindBy(css = ".GoBack_goback__6sa4O")
    public WebElement button_goBack;

    @FindBy(xpath = "//*[@id='vegetables']")
    public WebElement vegetables;

    @FindBy(css = ".Sidebar_section_btn__1sp6i[href='/account/address']")
    public WebElement sideButton_account;

    @FindBy(css = ".Sidebar_section_btn__1sp6i[href='/account/hub']")
    public WebElement sideButton_yourProductsServices;

    @FindBy(css = ".col-6>svg")
    public List<WebElement> variousProduct;

    @FindBy(css = "[hubuniquename='VEGETABLES_AND_FRUITS_HUB']")
    public WebElement button_vegetablesFruits;

    @FindBy(css = ".rounded[name='type']")
    public List<WebElement> rounded;

    @FindBy(css = "#selectProductName")
    public WebElement textbox_productName;

    @FindBy(css = "[name='price']")
    public WebElement textbox_price;

    @FindBy(css = "[name='stock']")
    public WebElement textbox_stock;

    @FindBy(css = "#selectProductUnit")
    public WebElement dropDown_unit;

    @FindBy(css = ".font-weight-bold")
    public List<WebElement> products;

    @FindBy(xpath = "//*[text()='Update']")
    public WebElement button_update;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement button_cancel;

    @FindBy(css = "#unitType")
    public WebElement dropDown_unit_edit;

    @FindBy(css = "#isTrade")
    public WebElement checkBox_trade;

    @FindBy(css = "#isOrganic")
    public WebElement checkBox_organic;

    @FindBy(xpath = "//*[text()='No']")
    public WebElement button_no;

    @FindBy(css = "div[role='alert']")
    public WebElement alert;

    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement button_yes;

}

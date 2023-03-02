package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtilities;
import java.util.List;
import static stepDefinitions.Hooks.driver;
public class YourProductsServicesPage extends CommonPage {
    @FindBy(xpath = "//div[@class='row m-0 p-2 align-items-center']/span")
    public List<WebElement> allhubs;
    @FindBy(xpath = "//a[contains(@class,'HubManagement_productTitle__2ke7R')]")
    public List<WebElement> allAddedProducts;
    @FindBy(xpath = "//datalist[@id='productName']/option")
    public List<WebElement> allProductsNames;
    @FindBy(xpath = "//span[contains(@class,'HubManagement_badge__2jPOb')]")
    public List<WebElement> allProductsStatus;
    @FindBy(xpath = "//input[@id='selectProductName']")
    public WebElement addNewProduct_Name;
    @FindBy(xpath = "//input[@id='hubManagePrice']")
    public WebElement addNewProduct_Price;
    @FindBy(xpath = "//input[@id='hubManageStock']")
    public WebElement addNewProduct_Stock;
    @FindBy(xpath = "//select[@id='selectProductUnit']")
    public WebElement addNewProduct_Unit;
    @FindBy(css = "button#hubManageSaveButton")
    public WebElement addNewProduct_Submit;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement update;
    @FindBy(xpath = "//a[@class='btn btn-danger']")
    public WebElement delete;
    @FindBy(xpath = "(//div[@class='text-center mb-2']/a)[1]")
    public WebElement yes;
    @FindBy(xpath = "(//div[@class='text-center mb-2']/a)[2]")
    public WebElement no;

    public void clickAddedProduct(String productName) {
        BrowserUtilities.scrollAndClickWithJS(driver.findElement(By.xpath("//a[text()='" + productName + "']")));
    }


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
    public WebElement button_delete;

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

    @FindBy(css = "#c49tybhn0>div[role='alert']")
    public WebElement alert2;

    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement button_yes;

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountPage extends CommonPage{

    @FindBy(xpath = "//a[text()='Address']")
    public WebElement button_adress;

    @FindBy(css = "#QRCode")
    public WebElement qrCode;

    @FindBy(css = "svg.cursor-pointer:nth-of-type(1)")
    public WebElement button_copy;

    @FindBy(css = "svg.cursor-pointer:last-of-type")
    public WebElement button_download;

    @FindBy(css = ".btn-outline-warning")
    public WebElement button_edit;

    @FindBy(css = "input.form-control[type='file']")
    public WebElement button_chooseFile;

    @FindBy(css = "[name='phone']")
    public WebElement textbox_phone;

    @FindBy(css = "button.btn-outline-primary")
    public WebElement button_save;

    @FindBy(css = "div.toastr_custom-toastr__iiU37")
    public WebElement message_toast;

    @FindBy(css = "span.AccountLayout_backtoTop__1FvtX")
    public WebElement toogle;

    @FindBy(css = "tr:nth-of-type(2) td.Profile_td__w9cTI:nth-of-type(2)")
    public WebElement firstName;

    @FindBy(css = "tr:nth-of-type(3) td.Profile_td__w9cTI:nth-of-type(2)")
    public WebElement email;

    @FindBy(css = "img.rounded-circle")
    public WebElement picture;

    @FindBy(css = "div.toastr_custom-toastr__iiU37")
    public WebElement toastMessage;




}

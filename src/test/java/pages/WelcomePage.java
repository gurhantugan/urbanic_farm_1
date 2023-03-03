package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WelcomePage extends CommonPage{
    @FindBy(xpath = "//span[.='Local seller near you']")
    public WebElement text_localSellerNearYou;

    @FindBy(css = ".ProductCard_userName__MaY5h")
    public List<WebElement> list_allSellers;

    @FindBy(css = ".m-0.mb-1.text-start.text-white.ProductCard_productTitle__3K4rg")
    public List<WebElement> list_allProducts;

    @FindBy(id = "page2")
    public WebElement button_page2;

    @FindBy(css = ".row.d-flex.justify-content-center div button:nth-of-type(2) span")
    public List<WebElement> button_plus;

    @FindBy(css = ".row.d-flex.justify-content-center div button:nth-of-type(1) span")
    public List<WebElement> button_minus;

    @FindBy(css = ".col-12.mt-2.w-75.btn.btn-success.ProductCard_addCartBtn___oxgf")
    public List<WebElement> button_AddToCard;

    @FindBy(css = ".Toastify__toast-body.toastr_custom-toastr__iiU37")
    public WebElement successMessage_addedToYourBasket;

    @FindBy(css = ".h4")
    public WebElement button_cancel;

    @FindBy(css = ".BasketDropdown_container__15BpD")
    public WebElement avatar_basketDropdown;

    @FindBy(css = ".col-12.mt-2.w-75.btn.btn-success.FeaturedProductCard_addCartBtn__2QCpK:nth-of-type(1)")
    public List<WebElement> button_addToYourCardUnderBasketAvatar;

    @FindBy(css = ".m-0.mb-1.text-start.text-white.FeaturedProductCard_productTitle__2rzUT")
    public List<WebElement> text_AllProductsNameDown;

    @FindBy(xpath = "(//tbody/tr/th)[2]")
    public WebElement text_AddedProductNameUp;

   @FindBy(xpath = "//p[@class='ProductCard_userName__MaY5h'][text()='Mathew']")
    public List<WebElement> list_SellerName;


 @FindBy(id = "productSortSelect")
    public WebElement select_sort;

  @FindBy(css=".Navbar_textLink__f6_Al.cursor-pointer.ml-4.mr-3.text-capitalize")
    public WebElement account_name;


    @FindBy(id = "mapSearchBox")
    public WebElement WhatAreYouLookingFor;

    @FindBy(id = "location")
    public WebElement SearchInMiles;

    @FindBy(id = "allCategories")
    public WebElement Categories;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement SearchOnlyInOrganic;

    @FindBy(id = "searchMapButton")
    public WebElement Search;

    @FindBy(xpath = "//div[@class='Navbar_support-container__2qv_z']")
    public WebElement SupportTheLocalFoodMovement;

    @FindBy(xpath = "//div[@class='Navbar_support-container__2qv_z p-2 cursor-pointer']")
    public WebElement SupportTheLocalFoodMovement2;

}

package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static stepDefinitions.Hooks.driver;


public class CommonPage {

    public CommonPage() {
        try {
            PageFactory.initElements(Driver.getDriver(), this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            PageFactory.initElements(driver, this);


        }catch (Exception e){
            e.printStackTrace();



    }
}

}








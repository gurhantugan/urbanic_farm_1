package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static stepDefinitions.Hooks.driver;


public abstract class CommonPage {

    public CommonPage() {
        try {
          PageFactory.initElements(Driver.getDriver(), this);

        } catch (Exception e) {
            System.out.println("test baslamadi");
            e.printStackTrace();
            System.out.println("test baslamadi");


        }

   }
}






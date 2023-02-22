package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import utilities.Driver;

import utilities.BrowserUtilities;
import utilities.DatabaseUtilities;


public class Hooks {
    public static WebDriver driver;
    public static CommonPage commonPage;
    public static Actions actions;
    public static boolean isCookiesDeleted = true;
    public static boolean isHeadless = false;
    public static java.lang.String browserType = "chrome";
    public static boolean isFullScreen = true;
    public static int width;
    public static int height;
    public void setup() {
        driver = Driver.getDriver();
    }

    @Before(value = "@headless", order = 0)
    public void setIsHeadless() {
        isHeadless = true;
    }

    @Before(value = "@firefox", order = 0)
    public void setIsFirefox() {
        browserType = "firefox";
    }


    @Before(value = "@iPhone12", order = 0)
    public void setiPhone12() {
        isFullScreen = false;
        width = 390;
        height = 844;
    }

    @Before("@DB")
    public void setupDatabase() {
        DatabaseUtilities.createConnection();

    }

    @After("@DB")
    public void closeDatabase() {
        DatabaseUtilities.closeConnection();

    }
    @Before(order = 2, value = "@buyer")
    public void loginAsBasic() {
        BrowserUtilities.loginMethod(enums.USERINFO.BUYER);
    }

    @Before(order = 2, value = "@seller")
    public void loginAsStandard() {
        BrowserUtilities.loginMethod(enums.USERINFO.SELLER);
    }

}

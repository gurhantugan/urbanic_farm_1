package stepDefinitions;


import org.openqa.selenium.WebDriver;
import utilities.Driver;


public class Hooks {
    public static WebDriver driver;
    public static boolean isHeadless = false;
    public static java.lang.String browserType = "chrome";

    public static boolean isFullScreen = true;
    public static int width;
    public static int height;

    public void setup() {

        driver = Driver.getDriver( "https://test.urbanicfarm.com/" );
    }

}

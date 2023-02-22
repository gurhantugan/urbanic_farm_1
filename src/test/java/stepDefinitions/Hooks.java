package stepDefinitions;



import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;

import utilities.DatabaseUtilities;
import utilities.Driver;


public class Hooks {
    public static WebDriver driver;
    public static boolean isHeadless = false;
    public static java.lang.String browserType = "chrome";

    public static boolean isFullScreen = true;
    public static int width;
    public static int height;

    public void setup() {

        driver = Driver.getDriver( );
    }
    @Before("@DB")
    public void setupDatabase() {
        DatabaseUtilities.createConnection();

    }

    @After("@DB")
    public void closeDatabase() {
        DatabaseUtilities.closeConnection();

    }
}

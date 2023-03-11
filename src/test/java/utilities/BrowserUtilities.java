package utilities;

import enums.USERINFO;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AccountPage;
import pages.LoginPage;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.annotation.Nullable;
import javax.imageio.ImageIO;
//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;
//import java.awt.image.BufferedImage;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static stepDefinitions.UI.Hooks.actions;
import static stepDefinitions.UI.Hooks.driver;


public class BrowserUtilities {
    static AccountPage accountPage = new AccountPage();
    static LoginPage loginPage = new LoginPage();

    public static void loginMethod(USERINFO userinfo) {

        driver.get("https://test.urbanicfarm.com/auth/login");
        loginPage.loginMethod(userinfo);
    }

    public static void loginMethod(String userName, String password) {
        driver.get("https://test.urbanicfarm.com/auth/login");
        loginPage.loginMethod(userName, password);
    }

    public static void localClear() {
        LocalStorage local = ((WebStorage) Driver.getDriver()).getLocalStorage();
        local.clear();
        Driver.getDriver().navigate().refresh();
        waitForPageToLoad(10);

    }

    public static void writeDataToIdsFile(String tip, String id) { // room=123123
        try (OutputStream output = new FileOutputStream("ids.properties")) {
            Properties prop = new Properties();
            prop.setProperty(tip, id);
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    @Nullable
    public static String readDataFromIdsFile(String tip) { // room
        try (InputStream input = new FileInputStream("ids.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            return prop.getProperty(tip);

        } catch (IOException ex) {
            return null;
        }
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeOutInSeconds));
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }

    public static void verifyElementDisplayed(By by) {
        try {
            Assert.assertTrue("Element not visible: " + by, Driver.getDriver().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + by);

        }
    }

    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }

    public static void verifyElementNotDisplayed(By by) {
        try {
            Assert.assertFalse("Element should not be visible: " + by, Driver.getDriver().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();

        }
    }

    public static void verifyElementNotDisplayed(WebElement element) {
        try {
            Assert.assertFalse("Element should not be visible: ", element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();

        }
    }

    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static List<String> getElementsText(By locator) {

        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public static void verifyElementClickable(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isEnabled());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }

    public static void verifyElementNotClickable(WebElement element) {
        try {
            Assert.assertFalse("Element not visible: " + element, element.isEnabled());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public static void switchToWindowWithIndex(int index) {
        List<String> windowHandles = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowHandles.get(index));
    }

    public static void staleElementClick(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .ignoring(StaleElementReferenceException.class)
                .until((WebDriver d) -> {
                    element.click();
                    return true;
                });
    }


    public static boolean isDisplayedElement(By element) {
        boolean elementExist = false;
        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            WebElement webElement = Driver.getDriver().findElement(element);
            Assert.assertTrue(webElement.isDisplayed());
            elementExist = true;
        } catch (Exception e) {
            elementExist = false;
        }
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println("Element Current Status is" + elementExist + "");

        return elementExist;


    }

    public static void clearAndSend(WebElement element, String str) {
        BrowserUtilities.waitForVisibility(element, 10);
        String value = element.getAttribute("value");
        for (int i = 0; i < value.length(); i++) {
            element.sendKeys(Keys.BACK_SPACE);

        }
        element.sendKeys(str);
    }

    public static void clearText(WebElement element) {
        BrowserUtilities.waitForVisibility(element, 10);
        String value = element.getAttribute("value");
        for (int i = 0; i < value.length(); i++) {
            element.sendKeys(Keys.BACK_SPACE);

        }

    }

    public static void clearAndSendAndAssert(WebElement element, String str) {
        BrowserUtilities.waitForVisibility(element, 10);
        String value = element.getAttribute("value");
        for (int i = 0; i < value.length(); i++) {
            element.sendKeys(Keys.BACK_SPACE);
        }
        BrowserUtilities.waitFor(3);
        element.sendKeys(str);
        Assert.assertEquals(str, element.getAttribute("value"));
    }


    /*public static void handlingNotification(WebElement element) throws AWTException, InterruptedException {
        JSUtils.clickElementByJS(element);

        Robot robot = new Robot();

        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(5000);
        JSUtils.clickElementByJS(element);

        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(5000);
        JSUtils.scrollIntoViewJS(element);
        BrowserUtilities.waitFor(2);
        JSUtils.clickElementByJS(element);
    }

      public static void masterClick(WebElement element) {
        BrowserUtilities.scrollToElement(element);
        BrowserUtilities.waitForVisibility(element, 3);
        BrowserUtilities.waitForClickability(element, 3);
        element.click();
    }*/

    public static boolean isDisplayedElement(WebElement element) {
        boolean elementExist = false;
        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            //WebElement webElement = Driver.getDriver().findElement(element);
            Assert.assertTrue(element.isDisplayed());
            elementExist = true;
        } catch (Exception e) {
            elementExist = false;
        }
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println("toast message is--->" + element.getText());
        System.out.println(" Current Element Status Is " + elementExist + ".");

        return elementExist;

    }

    public static boolean isDisplayedText(String text) {
        boolean elementExist = false;
        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            // WebElement webElement = driver.findElement(By.xpath("//*[text()[normalize-space() = '"+text+"']]"));
            // Assert.assertTrue(webElement.isDisplayed());

            By element = By.xpath("//*[text()[normalize-space() = '" + text + "']]");
            Assert.assertTrue(Driver.getDriver().findElement(element).isDisplayed());

            elementExist = true;
        } catch (Exception e) {
            elementExist = false;
        }
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println(" Pop-up is returned " + text + "(" + elementExist + ").");

        return elementExist;

    }


    /*public static void uploadFileWithRobot(WebElement element, String fileLocation) throws AWTException {

        // Robot object creation
        Robot r = new Robot();

        //BrowserUtilities.waitFor(4);
        JSUtils.clickElementByJS(element);

        r.setAutoDelay(2000);
        StringSelection s = new StringSelection(fileLocation);
        // Clipboard copy
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        r.setAutoDelay(1000);
        //pressing ctrl+v
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);

        //releasing ctrl+v
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.setAutoDelay(1000);

        //pressing enter
        r.keyPress(KeyEvent.VK_ENTER);
        //releasing enter
        r.keyRelease(KeyEvent.VK_ENTER);

    }*/


    /*public static void handlingNotification() throws AWTException, InterruptedException {

        Robot robot = new Robot();

        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        // BrowserUtilities.waitFor(1);


    }*/

    public static WebElement waitForClickability(WebElement element, int timeout) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));


    }

    public static String getDay_day_month_year_time(int hourToSkip) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR, hourToSkip);
        SimpleDateFormat format1 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
        return format1.format(cal.getTime());
    }

    public static String createDate(int year, int month, int day) {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;   //2022-12-23
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime date = now.plusYears(year).plusMonths(month).plusDays(day);
        return dtf.format(date);
    }

    public static String createTime(int hour, int minute) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR, hour);
        cal.add(Calendar.MINUTE, minute);
        SimpleDateFormat simpleformat = new SimpleDateFormat("HH:mm");
        return simpleformat.format(cal.getTime());
    }

    public static void refreshPage() {
        driver.navigate().refresh();
        waitForPageToLoad(10);
    }

    public static void cleanTextInBox(WebElement element) {
        String inputText = element.getAttribute("value");
        if (inputText != null) {
            for (int i = 0; i < inputText.length(); i++) {
                element.sendKeys(Keys.BACK_SPACE);
            }
        }
        waitFor(1);
    }

    public static void clearLocalSessionCookies() {
        LocalStorage local = ((WebStorage) driver).getLocalStorage();
        SessionStorage session = ((WebStorage) driver).getSessionStorage();
        local.clear();
        session.clear();
        driver.manage().deleteAllCookies();
    }

    public static String getSessionId() {
        return driver.manage().getCookieNamed("PHPSESSID").toString().split(";")[0];
    }

    public static String createDate2(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, month);
        cal.add(Calendar.DAY_OF_MONTH, day);
        cal.add(Calendar.YEAR, year);
        SimpleDateFormat simpleformat = new SimpleDateFormat("MM-dd-yyyy");
        return simpleformat.format(cal.getTime());
    }

    public static void acceptAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }


    }

    public static boolean fileIsExist(String filePath, String fileName){
        File file = new File(filePath);

        File[] listFiles = file.listFiles();

        for (File w:listFiles) {
            if(w.getName().equals(fileName)){
                return w.exists();
            }
        }
        return false;
    }
    public static boolean deleteFile(String filePath, String fileName){
        File file = new File(filePath);

        File[] listFiles = file.listFiles();

        for (File w:listFiles) {
            if(w.getName().equals(fileName)){
                w.delete();
                break;
            }
        }
        return false;
    }

    public static String giveMeRandomPic(List<String> pics){
        Random random = new Random();
        int randomPic = random.nextInt(pics.size());
        return pics.get(randomPic);

    }
    public static String giveMeRandomPic(List<String> pics, String pic){
        pics.remove(pic);
        Random random = new Random();
        int randomPic = random.nextInt(pics.size());
        return pics.get(randomPic);
    }

    public static void screenShotWebElement(WebElement webElement, String filepath){
        File screenShoot = webElement.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenShoot,new File(filepath));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    /*public static boolean assertImageAreDifferent(String image1Path,String image2Path){
        BufferedImage image1, image2;
        try{
            image1 = ImageIO.read(new File(image1Path));
            image2 = ImageIO.read(new File(image2Path));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        ImageDiffer imageDiffer = new ImageDiffer();
        ImageDiff diff = imageDiffer.makeDiff(image1,image2);

        return diff.hasDiff();
    }*/
    /**
     * method token kullanarak local storage i doldurup, login sayfasina gitmeden login yapmamizi sagliyor
     *
     * @param token kullanicinin token i
     * @param web   site icerisinde gitmek istedigimiz url note: urbanicfarm.com/  den sonrasi girilmesi lazim
     * @author omeryttnc
     * @since 11.02.2023
     */
    public static void loginWithTokenSeller(String token, String web) {
        LocalStorage localStorage = ((WebStorage) Driver.getDriver()).getLocalStorage();
        String key1 = "a27c6fac85ae1295535e42c9d3e3f305";
        String key2 = "e3e1601fca9c429344c15527cd542142";

        String url = "https://test.urbanicfarm.com/";

        String value2 = token;
        String value1 = token.split("\\.")[1];
        Driver.getDriver().get(url);
        localStorage.setItem(key1, value1);
        localStorage.setItem(key2, value2);

        Driver.getDriver().get(url + web);

        waitForPageToLoad(10);


    }
    public static boolean assertImageAreDifferent(String image1Path,String image2Path){
        BufferedImage image1, image2;
        try{
            image1 = ImageIO.read(new File(image1Path));
            image2 = ImageIO.read(new File(image2Path));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        ImageDiffer imageDiffer = new ImageDiffer();
        ImageDiff diff = imageDiffer.makeDiff(image1,image2);

        return diff.hasDiff();
    }


    public static void loginWithTokenBuyer(String token, String web) {
        LocalStorage localStorage = ((WebStorage) Driver.getDriver()).getLocalStorage();
        String key1 = "a27c6fac85ae1295535e42c9d3e3f305";
        String key2 = "e3e1601fca9c429344c15527cd542142";

        String url = "https://test.urbanicfarm.com/";

        String value2 = token;
        String value1 = token.split("\\.")[1];
        Driver.getDriver().get(url);
        localStorage.setItem(key1, value1);
        localStorage.setItem(key2, value2);

        Driver.getDriver().get(url + web);

        waitForPageToLoad(10);


    }
    public static void scrollAndClickWithJS(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", webElement);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", webElement);
    }

    public static String getStatusOfProduct(String productName) {
        return driver.findElement(By.xpath("//a[@title='"+productName+"']/../../span")).getText();
    }
    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void toastMessageAssertion(String toastMessage) {
        BrowserUtilities.waitForClickable(accountPage.toastMessage, 3);
        String actualToastMessage = accountPage.toastMessage.getText();
        String expectedToastMessage = toastMessage;
        Assert.assertEquals(expectedToastMessage, actualToastMessage);
    }
    public static WebElement waitForClickable(WebElement element, int timeout) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void masterClick(WebElement element) {
        BrowserUtilities.scrollToElement(element);
        BrowserUtilities.waitForVisibility(element, 2);
        BrowserUtilities.waitForClickability(element, 2);

        element.click();

    }

    public static void assertTextColor(String rgba, WebElement webElement) {
        Assert.assertEquals(rgba, webElement.getCssValue("color"));
    }

    public static void cleanTextFromWebelemnt(WebElement webElement) {
        // omer -> 4 -> 4 defa backspace
        webElement.click();
        // a -> 1
        int valueLength = webElement.getAttribute("value").length();

        for (int i = 0; i < valueLength; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }
    }

}







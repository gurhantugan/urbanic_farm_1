package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

import static utilities.BrowserUtilities.waitFor;

public class US_001_StepDef_HA {
    @And("user closes browser")
    public void userClosesBrowser() {
        waitFor(7);
        Driver.closeDriver();
    }

    @Given("user on the Urbanic Farm page")
    public void userOnTheUrbanicFarmPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
    }
//Navigate to CDL.co.uk
    //Navigate to our "news" page
    //Open "Cloud Only Transformation"
    //Go back
    //Navigate to career vacancies
    //Input "Product Owner" into the filter
    //Verify that "Product Owner" is shown and click to show the role overview

    @Test
    public void navigatingWebPage() {
        Driver.getDriver().get("https://www.cdl.co.uk/");
        JSUtils.scrollDownByJS();
        WebElement news = Driver.getDriver().findElement(By.xpath("(//a[text()='news'])[1]"));
        news.click();

        JSUtils.scrollDownByJS();
        WebElement News = Driver.getDriver().findElement(By.xpath("(//a[.='News'])[2]"));
        News.click();

        WebElement transformation = Driver.getDriver().findElement(By.xpath("(//div[contains(text(),'Cloud-only transformation')])[1]"));

        JSUtils.scrollIntoViewJS(transformation);
        waitFor(2);

        JSUtils.clickElementByJS(transformation);
        waitFor(3);

        Driver.getDriver().navigate().back();
        waitFor(2);

        WebElement vacancy = Driver.getDriver().findElement(By.xpath("//img[@title='Vacancies']"));
        vacancy.click();

        WebElement vacancyFilter = Driver.getDriver().findElement(By.cssSelector("#vacsearch"));
        JSUtils.scrollIntoViewJS(vacancyFilter);
        waitFor(1);

        vacancyFilter.sendKeys("Project Manager" + Keys.ENTER);

        String projectManagerText = Driver.getDriver().findElement(By.xpath("//*[.='Project Manager']")).getText();

        Assert.assertEquals("Project Manager", projectManagerText);


    }
}

package stepDefinitions.UI;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.JSUtils;

public class deneme_US_001_StepDef {

    @When("User verifies url {string}")
    public void user_verifies_url(String expectedUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Not Equals URL", actualUrl, expectedUrl);
    }

    @Then("User verifies title and Homepage")
    public void user_verifies_title_and_homepage() {
        String expectedTitle = "Get Your Locally Sourced Veggies&Fruits from neighbors | Urbanic Farm";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        //deneme
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
        Driver.getDriver().get("https://www.cdl.co.uk");
        JSUtils.scrollDownByJS();
        WebElement news = Driver.getDriver().findElement(By.xpath("(//a[text()='news'])[1]"));
        news.click();
        JSUtils.scrollDownByJS();
        WebElement News = Driver.getDriver().findElement(By.xpath("(//a[.='News'])[2]"));
        News.click();
        JSUtils.scrollIntoViewJS(Driver.getDriver().findElement
                (By.xpath("//div[contains(text(),'Cloud-only transformation')])[1]")));
        Driver.getDriver().navigate().back();


    }
}
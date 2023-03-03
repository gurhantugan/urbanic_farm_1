package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.EventsPage;
import utilities.BrowserUtilities;

import java.util.List;
import java.util.Random;

import static stepDefinitions.Hooks.driver;

public class US_075_StepDef_AK {

    EventsPage eventsPage = new EventsPage();
    Faker faker = new Faker();

    @FindBy(xpath = "//*[text()='Register']")
    public List<WebElement> button_register;

    //Random random =new Random();
    @When("user clicks Events the checkbox")
    public void userClicksEventsTheCheckbox() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.scrollAndClickWithJS(eventsPage.button_events);

    }

    @When("user participates in any of the events")
    public void userParticipatesInAnyOfTheEvents() {
        List<WebElement> allProducts = driver.findElements(By.xpath("//*[text()='Register']"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
//        BrowserUtilities.waitForVisibility((WebElement) eventsPage.button_register, 20);
//        BrowserUtilities.scrollAndClickWithJS(eventsPage.button_register.get(faker.number().numberBetween(1, 23)));

    }
//    @And("A user fills in the {string} of participants")
//    public void aUserFillsInTheOfParticipants(String number) {
//        eventsPage.box_number.sendKeys(number);
}


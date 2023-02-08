package stepDefinitions;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import pages.RegisterPage;
import utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtilities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static stepDefinitions.Hooks.driver;


public class US_034_StepDef_SG {

    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    List<String> lastNames = new ArrayList<>(Arrays.asList("Apaydin", "Duyarer", "Siler", "Basar"));
    Random rand = new Random();
    
    RegisterPage registerPage = new RegisterPage();

    @And("user fills out the registration form")
    public void userFillsOutTheRegistrationForm() {
//        registerPage.firstname.sendKeys(new Faker().name().firstName());
        registerPage.firstname.sendKeys(faker.name().firstName());
        registerPage.middleName.sendKeys(faker.name().firstName());
//        registerPage.lastName.sendKeys(faker.name().lastName());
        registerPage.lastName.sendKeys(lastNames.get(rand.nextInt(4)));
        registerPage.email.sendKeys(faker.internet().emailAddress().toLowerCase());
        String password = faker.internet().password(8, 30, true, true, true);
        registerPage.password.sendKeys(password);
        registerPage.confirmPassword.sendKeys(password);
        registerPage.zipCode.sendKeys(faker.address().zipCode(), Keys.TAB);
        BrowserUtilities.waitFor(5);
    }

    @And("user clicks on Register button")
    public void userClicksOnRegisterButton() {
//        actions.sendKeys(Keys.END).perform();

        BrowserUtilities.waitFor(2);
        registerPage.registerButton.click();
    }


    @Then("user verifies following elements are visible")
    public void userVerifiesFollowingElementsAreVisible(DataTable dataTable) {
        List<String> texts = dataTable.column(0);

        for (int i = 0; i < texts.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//*[text()='"+texts.get(i)+"']"));
            Assert.assertTrue(element.isDisplayed());
        }

    }

    @And("user verifies following elements are clickable")
    public void userVerifiesFollowingElementsAreClickable(DataTable dataTable) {
        List<String> texts = dataTable.column(0);

        for (int i = 0; i < texts.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//*[text()='"+texts.get(i)+"']"));
            Assert.assertTrue(element.isEnabled());
        }
    }

    @And("user verifies Welcome to Urbanic Farm is visible")
    public void userVerifiesWelcomeToUrbanicFarmIsVisible() {
        Assert.assertTrue(registerPage.welcome.isDisplayed());
    }
}

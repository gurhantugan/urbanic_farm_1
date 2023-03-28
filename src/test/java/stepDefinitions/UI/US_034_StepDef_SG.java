package stepDefinitions.UI;

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


public class US_034_StepDef_SG {

    static Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    static List<String> lastNames = new ArrayList<>(Arrays.asList("Apaydin", "Duyarer", "Siler", "Basar"));
    static Random rand = new Random();
    RegisterPage registerPage = new RegisterPage();
    public static String firstname = faker.name().firstName();
    public static String middleName = faker.name().firstName();
    public static String lastName = lastNames.get(rand.nextInt(4));
    public static String email = faker.internet().emailAddress().toLowerCase();
   public static String password = faker.internet().password(8, 30, true, true, true);

    @And("user fills out the registration form")
    public void userFillsOutTheRegistrationForm() {
//        registerPage.firstname.sendKeys(new Faker().name().firstName());
        registerPage.firstname.sendKeys(firstname);
        registerPage.middleName.sendKeys(middleName);
//        registerPage.lastName.sendKeys(faker.name().lastName());
        registerPage.lastName.sendKeys(lastName);
        registerPage.email.sendKeys(email);
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
            WebElement element = Driver.getDriver().findElement(By.xpath("//*[text()='" + texts.get(i) + "']"));
            Assert.assertTrue(element.isDisplayed());
        }

    }

    @And("user verifies following elements are clickable")
    public void userVerifiesFollowingElementsAreClickable(DataTable dataTable) {
        List<String> texts = dataTable.column(0);

        for (int i = 0; i < texts.size(); i++) {
            WebElement element = Driver.getDriver().findElement(By.xpath("//*[text()='" + texts.get(i) + "']"));
            Assert.assertTrue(element.isEnabled());
        }
    }

    @And("user verifies Welcome to Urbanic Farm is visible")
    public void userVerifiesWelcomeToUrbanicFarmIsVisible() {
        Assert.assertTrue(registerPage.welcome.isDisplayed());
    }
}

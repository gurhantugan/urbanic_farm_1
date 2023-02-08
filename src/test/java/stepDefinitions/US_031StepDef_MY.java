package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.RegisterPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.List;

public class US_031StepDef_MY {
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage= new HomePage();
    Actions action = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @When("user clicks on Register")
    public void userClicksOnRegister() {
      homePage.button_register.click();

    }

    @And("user hover over the first name box")
    public void userHoverOverTheFirstNameBox() {
       action.moveToElement(registerPage.firstNameBox).perform();
        BrowserUtilities.waitFor(3);


    }

    @And("user should see the alert")
    public void userShouldSeeTheAlert() {
        System.out.println(registerPage.firstNameBox.getDomProperty("title"));
        String domProperty = registerPage.firstNameBox.getDomProperty("title");
        Assert.assertEquals("This field should only contain letters. e.g. john",domProperty);



       /* Assert.assertTrue("no message",registerPage.alertSign.isDisplayed());
        BrowserUtils.waitFor(3);*/
    }

    @Then("user writes to First name box and checks the valid or red color with invalid message is coming")
    public void userWritesToFirstNameBoxAndChecksTheValidOrRedColorWithInvalidMessageIsComing(List<String>names) {
        String expectedColor="rgba(245, 110, 105, 1)";
        String actualColor = registerPage.firstNameBox.getCssValue("color");
        registerPage.firstNameBox.click();
        for (int i = 0; i < names.size(); i++) {
            int count= names.get(i).length();
            action.sendKeys(names.get(i)).perform();
     BrowserUtilities.waitFor(2);
     Assert.assertEquals("firstname color is not expected",expectedColor,actualColor);
            for (int j = 0; j < count; j++) {

                action.sendKeys(Keys.BACK_SPACE).perform();
            }
        }

    }


    @And("user hover over the Last name box")
    public void userHoverOverTheLastNameBox() {
        action.moveToElement(registerPage.lastnameBox).click(registerPage.lastnameBox);
        BrowserUtilities.waitFor(3);


    }

    @Then("user writes to Last name box and checks the valid or red color with invalid message is coming")
    public void userWritesToLastNameBoxAndChecksTheValidOrRedColorWithInvalidMessageIsComing(List<String>lastnames) {
        String expectedColor="rgba(245, 110, 105, 1)";
        String actualColor = registerPage.lastnameBox.getCssValue("color");

        registerPage.firstNameBox.click();
        for (int i = 0; i < lastnames.size(); i++) {
            int count= lastnames.get(i).length();
            action.sendKeys(lastnames.get(i)).perform();
            BrowserUtilities.waitFor(2);
            Assert.assertEquals("lastname color is not expected",expectedColor,actualColor);
            for (int j = 0; j < count; j++) {

                action.sendKeys(Keys.BACK_SPACE).perform();
            }
        }


    }

    @And("user hover over the Middle name box")
    public void userHoverOverTheMiddleNameBox() {
        action.moveToElement(registerPage.middleNameBox).click(registerPage.middleNameBox);
        BrowserUtilities.waitFor(2);



    }

    @Then("user writes to MiddleName  box and checks the valid or red color with invalid message is coming")
    public void userWritesToMiddleNameBoxAndChecksTheValidOrRedColorWithInvalidMessageIsComing(List<String>middleNames) {
        String expectedColor="rgba(72, 72, 72, 1)";
        String actualColor = registerPage.middleNameBox.getCssValue("color");

        registerPage.middleNameBox.click();

        for (int i = 0; i < middleNames.size(); i++) {
            int count= middleNames.get(i).length();
            action.sendKeys(middleNames.get(i)).perform();
            BrowserUtilities.waitFor(2);
            Assert.assertEquals("middlename color is not expected",expectedColor,actualColor);
            for (int j = 0; j < count; j++) {

                action.sendKeys(Keys.BACK_SPACE).perform();
            }
        }





    }

    @And("the user hover over the email box")
    public void theUserHoverOverTheEmailBox() {
        action.moveToElement(registerPage.emailBox).click(registerPage.emailBox);
        BrowserUtilities.waitFor(2);

    }


    @Then("the user writes a valid email with a black background color")
    public void theUserWritesAValidEmailWithABlackBackgroundColor() {
      String expectedRgba= "rgba(72, 72, 72, 1)";


        for (int i = 0; i < 5; i++) {

           BrowserUtilities.waitFor(2);
            String validEmailpre = faker.internet().emailAddress();
            String validEmail = validEmailpre.replaceFirst("\\.", "");
            System.out.println(validEmail);

            action.sendKeys(validEmail).perform();
            BrowserUtilities.waitFor(1);
            String actualRgba = registerPage.emailBox.getCssValue("color");
            Assert.assertEquals("Color of the text is not black",expectedRgba,actualRgba);

            for (int j = 0; j < validEmail.length(); j++) {
                action.sendKeys(Keys.BACK_SPACE).perform();

            }
        }
    }


    @Then("A alert should appear if no valid email has been entered: {string}")
    public void aAlertShouldAppearIfNoValidEmailHasBeenEntered(String message) {
        for (int i = 0; i < 5; i++) {
            String fakeName = faker.name().firstName();
            action.sendKeys(registerPage.emailBox, fakeName).perform();
            String actualMessage = registerPage.emailBox.getDomProperty("validationMessage");
            System.out.println(actualMessage);
            String expectedMessage = message + "'" + fakeName + "'" + " is missing an '@'.";
            Assert.assertEquals("not equal", expectedMessage, actualMessage);
            action.doubleClick(registerPage.emailBox).sendKeys(Keys.BACK_SPACE).build().perform();
            BrowserUtilities.waitFor(1);
        }
    }


    @And("the user hover over zip code box and sees {string}")
    public void theUserHoverOverZipCodeBoxAndSees(String zipMessage) {
       // ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoview(true)",registerPage.zipCodeBox);
        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
        BrowserUtilities.waitFor(2);
        action.moveToElement(registerPage.zipCodeBox).perform();
        String actualTitle = registerPage.zipCodeBox.getDomProperty("title");
        String expectedTitle= zipMessage;
        Assert.assertEquals("not equal",expectedTitle,actualTitle);
        registerPage.zipCodeBox.click();
    }




    @And("the user clicks and  gets {string} with invalid numbers")
    public void theUserClicksAndGetsWithInvalidNumbers(String expectedZipMessage,List<String>numbers) {

        String actualMessage=registerPage.zipCodeBox.getDomProperty("title");
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            BrowserUtilities.waitFor(2);
            action.sendKeys(registerPage.zipCodeBox,numbers.get(i));

             Assert.assertEquals("not same message",expectedZipMessage,actualMessage);
            action.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE)
                    .sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();

        }



    }
}




















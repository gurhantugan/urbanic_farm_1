package stepDefinitions.DB;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import stepDefinitions.UI.US_034_StepDef_SG;

import utilities.BrowserUtilities;
import utilities.DatabaseUtilities;
import utilities.Driver;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utilities.DatabaseUtilities.resultSet;

public class US_123_124_StepDef {

    RegisterPage registerPage = new RegisterPage();
    String email = US_034_StepDef_SG.email;
    String password = US_034_StepDef_SG.password;
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    AddressPage addressPage = new AddressPage();
    Actions actions = new Actions(Driver.getDriver());
    String addressFromUI;

    @Then("user verifies following column names are present in user")
    public void userVerifiesFollowingColumnNamesArePresentInUser(DataTable dataTable) throws SQLException {
        List<String> columnNames = dataTable.column(0);
        /*
        DatabaseUtilities.executeQuery("SELECT * from user");
        ResultSetMetaData rsmd = resultSet.getMetaData();
        for(String columnName: columnNames){//email
            boolean flag = false;
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.println(rsmd.getColumnName(i));
                if(rsmd.getColumnName(i).equals(columnName)){
                    flag= true;
                    break;
                }
            }
            Assert.assertTrue(flag);
        }*/


        DatabaseUtilities.executeQuery("SELECT " + columnNames.get(0) + "," + columnNames.get(1) + "," + columnNames.get(2) + " from user");
        ResultSetMetaData rsmd = resultSet.getMetaData();
        //SELECT id, email, first_name FROM user
        for (int i = 1; i < rsmd.getColumnCount(); i++) {
            System.out.println(rsmd.getColumnName(i) + " " + columnNames.get(i - 1));
            int j = 0;
            if (rsmd.getColumnName(i).equals(columnNames.get(i - 1))) {
                j = 1;
            }
            Assert.assertEquals(1, j);
        }

    }

    @And("user verifies the added user exists")
    public void userVerifiesTheAddedUserExists() throws SQLException {
        DatabaseUtilities.executeQuery("SELECT * FROM user WHERE first_name='" + US_034_StepDef_SG.firstname + "' AND email='" + email + "'");
        if (resultSet.next()) {
            System.out.println("Kullanici bulundu");
            System.out.println("email = " + email);
            System.out.println("password = " + password);

        } else {
            System.out.println("Kullanici kaydedilmedi");
        }

        DatabaseUtilities.executeQuery("SELECT * FROM user ORDER BY id DESC");
        while (resultSet.next()) {
            String email = resultSet.getString("email");
            String firstName = resultSet.getString("first_name");
            if (email.equals(email) && firstName.equals(US_034_StepDef_SG.firstname)) {
                System.out.println("Kullanici eklenmis");
                break;
            }
        }
    }

    @Then("user verifies following column names are present in {string}")
    public void userVerifiesFollowingColumnNamesArePresentIn(String tableName, DataTable dataTable) throws SQLException {
        List<String> columnNames = dataTable.column(0);

        /*DatabaseUtilities.executeQuery("SELECT * from user");
        ResultSetMetaData rsmd = resultSet.getMetaData();
        for(String columnName: columnNames){//email
            boolean flag = false;
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.println(rsmd.getColumnName(i));
                if(rsmd.getColumnName(i).equals(columnName)){
                    flag= true;
                    break;
                }
            }
            Assert.assertTrue(flag);
        }*/
        DatabaseUtilities.executeQuery("SELECT " + columnNames.get(0) + "," + columnNames.get(1) + "," + columnNames.get(2) + " from " + tableName);
        ResultSetMetaData rsmd = resultSet.getMetaData();
        //SELECT id, email, first_name FROM user
        for (int i = 1; i < rsmd.getColumnCount(); i++) {
            System.out.println(rsmd.getColumnName(i) + " " + columnNames.get(i - 1));
            int j = 0;
            if (rsmd.getColumnName(i).equals(columnNames.get(i - 1))) {
                j = 1;
            }
            Assert.assertEquals(1, j);
        }
    }
    @And("user log out")
    public void userLogOut() {

        BrowserUtilities.clickWithJS(homePage.logoutButton);
        BrowserUtilities.waitFor(3);
    }

    @When("user login as new registered user")
    public void userLoginAsNewRegisteredUser() {

        homePage.loginButton.click();
        loginPage.box_email.sendKeys(email);
        loginPage.box_password.sendKeys(password);
        loginPage.button_login.click();
        BrowserUtilities.waitFor(4);

            }






    @And("user clicks on user button")
    public void userClicksOnUserButton() {
        homePage.cristian_button.click();
        BrowserUtilities.waitFor(2);
    }

    @And("user goes to relavent url {string}")
    public void userGoesToRelaventUrl(String url) {
        Driver.getDriver().get(url);

    }

    @And("user enters new zipcode for address and selects the first one")
    public void userEntersNewZipcodeForAddressAndSelectsTheFirstOne() {
        String zipCode = String.valueOf(faker.number().numberBetween(10000, 99999));
        addressPage.textBox_searchPlaces.sendKeys(zipCode);
        BrowserUtilities.waitFor(2);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        addressFromUI = addressPage.textBox_address.getAttribute("value");
        addressPage.button_submit.click();
        BrowserUtilities.waitFor(5);


    }

    @And("user verifies user address in UI and user address in DB is same")
    public void userVerifiesUserAddressInUIAndUserAddressInDBIsSame() throws SQLException {
        System.out.println("actualAddress = " + addressFromUI);
        DatabaseUtilities.executeQuery("SELECT u.first_name, u.last_name, u.email, a.address FROM user u LEFT JOIN address a ON a.owner_id = u.id WHERE u.email='" + email + "'");
        List <Map<String,String>> userList = new ArrayList<>();
        while (resultSet.next()){
                ResultSetMetaData rsmd = resultSet.getMetaData();
                Map<String,String> rowMap = new HashMap<>();
                for (int i =1 ;i<=rsmd.getColumnCount();i++){
                    rowMap.put(rsmd.getColumnName(i),resultSet.getString(i));

                }
                userList.add(rowMap);
            System.out.println("userList = " + userList);

        }
        String addressFromDB = userList.get(0).get("address");
        Assert.assertEquals(addressFromUI,addressFromDB);
/*
SELECT * FROM address order by owner_id desc limit 1;
 */

    }

    @And("user logs out and closes the browser")
    public void userLogsOutAndClosesTheBrowser() {
        BrowserUtilities.clickWithJS(homePage.logoutButton);
        Driver.closeDriver();

    }
}
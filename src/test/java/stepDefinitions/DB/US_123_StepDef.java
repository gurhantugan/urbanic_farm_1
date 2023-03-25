package stepDefinitions.DB;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;
import stepDefinitions.UI.US_034_StepDef_SG;

import utilities.DatabaseUtilities;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import static utilities.DatabaseUtilities.resultSet;

public class US_123_StepDef{

    RegisterPage registerPage = new RegisterPage();

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
        DatabaseUtilities.executeQuery("SELECT * FROM user WHERE first_name='" + US_034_StepDef_SG.firstname + "' AND email='" + US_034_StepDef_SG.email + "'");
        if (resultSet.next()) {
            System.out.println("Kullanici bulundu");
        } else {
            System.out.println("Kullanici kaydedilmedi");
        }

        DatabaseUtilities.executeQuery("SELECT * FROM user ORDER BY id DESC");
        while (resultSet.next()){
            String email = resultSet.getString("email");
            String firstName= resultSet.getString("first_name");
            if(email.equals(US_034_StepDef_SG.email)&& firstName.equals(US_034_StepDef_SG.firstname)){
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
        DatabaseUtilities.executeQuery("SELECT " + columnNames.get(0) + "," + columnNames.get(1) + "," + columnNames.get(2) + " from "+ tableName);
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

    @When("user closes connection to database")
    public void userClosesConnectionToDatabase() {
    }
}
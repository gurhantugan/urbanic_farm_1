package utilities;
import org.junit.Assert;

import java.sql.*;

public class DatabaseUtilities {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    public static void createConnection() {
        System.out.println("abc");
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://51.158.110.102:3366/urbanicfarm",
                    "urbanicfarm_mysql_user",
                    "urbanicfarm_mysql_password"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void closeConnection() {
        System.out.println("xcd");
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void executeQuerry(String sql) {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void updateQuerry(String sql) {
        System.out.println("update");
        try {
            statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            System.out.println(i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void approveLastProduct() {
        System.out.println("approve");
        updateQuerry("UPDATE `hub_product` SET `product_listing_state` = 'APPROVED' WHERE `product_listing_state` LIKE 'IN_REVIEW' order BY id DESC;");
    }
}
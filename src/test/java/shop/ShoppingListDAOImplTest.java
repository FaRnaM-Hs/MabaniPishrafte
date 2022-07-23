package shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ShoppingListDAOImplTest {

    public static final String ERROR = "Connection to the database is impossible";
    public static final String INSERT_SQL = "INSERT INTO item (name, quantity) VALUES (?, ?)";
    public static final String SELECT_SQL = "SELECT * FROM item ORDER BY id DESC LIMIT 1";
    public static final String DELETE_SQL = "DELETE FROM item ORDER BY id DESC LIMIT 1";

    private String host;
    private String user;
    private String pass;

    @BeforeEach
    void setUp() {
        try (InputStream configFile = new FileInputStream("db-config.properties")) {
            Properties properties = new Properties();
            properties.load(configFile);
            host = properties.get("host").toString();
            user = properties.get("username").toString();
            pass = properties.get("password").toString();
        } catch (IOException e) {
            e.printStackTrace();
            Assertions.fail(ERROR);
        }
    }

    @Test
    void should_connect_to_MySQL_Database() {
        try (final Connection con = DriverManager.getConnection(host, user, pass)) {
            if (con == null)
                Assertions.fail(ERROR);
        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail(ERROR);
        }
    }


    @Test
    void should_insert_read_and_delete_an_item_in_database() {
        try (final Connection con = DriverManager.getConnection(host, user, pass);
             final PreparedStatement insert = con.prepareStatement(INSERT_SQL);
             final PreparedStatement select = con.prepareStatement(SELECT_SQL);
             final PreparedStatement delete = con.prepareStatement(DELETE_SQL)) {
            insert.setString(1, "Orange");
            insert.setInt(2, 5);
            insert.executeUpdate();

            final ResultSet resultSet = select.executeQuery();
            while (resultSet.next()) {
                Assertions.assertEquals(resultSet.getString("name"), "Orange");
                Assertions.assertEquals(resultSet.getInt("Quantity"), 5);
            }

            delete.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail(ERROR);
        }
    }
}

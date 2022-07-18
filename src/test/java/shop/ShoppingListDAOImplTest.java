package shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ShoppingListDAOImplTest {

    @Test
    void should_connect_to_MySQL_Database() {
        try (final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "1234")) {
            if (con == null)
                Assertions.fail("Connection to the database is impossible");
        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail("Connection to the database is impossible");
        }
    }
}

package shop;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class ShoppingListDAOImpl implements ShoppingListDAO {

    public static final String INSERT_SQL = "INSERT INTO item (name, quantity) VALUES (?, ?)";
    public static final String SELECT_SQL = "SELECT * FROM item";

    private String host;
    private String user;
    private String pass;

    public ShoppingListDAOImpl() {
        try (InputStream configFile = new FileInputStream("db-config.properties")) {
            Properties properties = new Properties();
            properties.load(configFile);
            host = properties.get("host").toString();
            user = properties.get("username").toString();
            pass = properties.get("password").toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Item> findAllItems() {
        List<Item> items = new LinkedList<>();

        try (final Connection con = DriverManager.getConnection(host, user, pass);
             final PreparedStatement select = con.prepareStatement(SELECT_SQL)) {
            final ResultSet resultSet = select.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                items.add(new Item(name, quantity));
            }

        } catch (SQLException e) {
            throw new MainSQLException(e);
        }
        return items;
    }

    @Override
    public void saveItems(List<Item> items) {
        try (final Connection con = DriverManager.getConnection(host, user, pass);
             final PreparedStatement insert = con.prepareStatement(INSERT_SQL)) {

            for (Item item : items) {
                insert.setString(1, item.getName());
                insert.setInt(2, item.getQuantity());
                insert.executeUpdate();
            }

        } catch (SQLException e) {
            throw new MainSQLException(e);
        }

    }
}

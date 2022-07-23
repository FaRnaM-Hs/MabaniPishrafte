package shop;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ShoppingListDAOImpl implements ShoppingListDAO {

    public static final String HOST = "jdbc:mysql://localhost:3306/shop";
    public static final String USER = "root";
    public static final String PASS = "1234";
    public static final String INSERT_SQL = "INSERT INTO item (name, quantity) VALUES (?, ?)";
    public static final String SELECT_SQL = "SELECT * FROM item";

    @Override
    public List<Item> findAllItems() {
        List<Item> items = new LinkedList<>();

        try (final Connection con = DriverManager.getConnection(HOST, USER, PASS);
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
        try (final Connection con = DriverManager.getConnection(HOST, USER, PASS);
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

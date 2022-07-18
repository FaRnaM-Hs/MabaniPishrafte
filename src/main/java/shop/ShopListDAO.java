package shop;

import java.util.List;

public interface ShopListDAO {

    List<Item> findAllItems();

    void saveItems(List<Item> items);
}

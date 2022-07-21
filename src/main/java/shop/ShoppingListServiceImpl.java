package shop;

import java.util.List;

public class ShoppingListServiceImpl implements ShoppingListService {

    @Override
    public List<Item> findAllItems() {
        final ShoppingListDAO shoppingListDAO = new ShoppingListDAOImpl();
        return shoppingListDAO.findAllItems();
    }

    @Override
    public void saveItems(List<Item> items) {
        for (Item item : items)
            item.check();

        final ShoppingListDAO shoppingListDAO = new ShoppingListDAOImpl();
        shoppingListDAO.saveItems(items);
    }
}

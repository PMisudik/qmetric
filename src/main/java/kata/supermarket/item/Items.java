package kata.supermarket.item;

import java.util.Collection;
import java.util.List;

public interface Items {
    Collection<Item> getItems();

    void add(Item item);
}

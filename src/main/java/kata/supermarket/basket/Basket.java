package kata.supermarket.basket;

import kata.supermarket.item.Item;
import kata.supermarket.item.Items;

import java.util.Collection;
import java.util.Collections;

public class Basket {
    private final Items items;

    public Basket(Items items) {
        this.items = items;
    }

    public void add(final Item item) {
        items.add(item);
    }

    public Collection<Item> items() {
        return Collections.unmodifiableCollection(items.getItems());
    }
}

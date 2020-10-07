package kata.supermarket.basket;

import kata.supermarket.calculator.TotalCalculator;
import kata.supermarket.item.Item;
import kata.supermarket.item.Items;

import java.math.BigDecimal;

public class Basket {
    private final Items items;

    public Basket(Items items) {
        this.items = items;
    }

    public void add(final Item item) {
        items.add(item);
    }

    public BigDecimal total() {
        return new TotalCalculator().calculate();
    }

}

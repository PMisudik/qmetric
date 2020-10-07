package kata.supermarket.calculator;

import kata.supermarket.basket.Basket;
import kata.supermarket.item.Item;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class DiscountsCalculator implements Calculator {
    private final List<Item> items;

    DiscountsCalculator(Basket basket) {
        this.items = new ArrayList<>(basket.items());
    }

    @Override
    public BigDecimal calculate() {
        return subtotal().subtract(discounts());
    }

    private BigDecimal subtotal() {
        return items.stream().map(Item::price)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO)
                .setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * TODO: This could be a good place to apply the results of
     * the discount calculations.
     * It is not likely to be the best place to do those calculations.
     * Think about how Basket could interact with something
     * which provides that functionality.
     */
    private BigDecimal discounts() {
        return BigDecimal.ZERO;
    }


}
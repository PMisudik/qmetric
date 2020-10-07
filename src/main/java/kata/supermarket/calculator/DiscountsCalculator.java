package kata.supermarket.calculator;

import kata.supermarket.basket.Basket;
import kata.supermarket.discount.Discounts;
import kata.supermarket.item.Items;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DiscountsCalculator implements Calculator {
    private final Items items;
    private final Discounts discounts;

    DiscountsCalculator(Basket basket, Discounts discounts) {
        this.discounts = discounts;
        this.items = basket.items();
    }

    @Override
    public BigDecimal calculate() {
        return discounts.discounts().stream().map(discount -> discount.apply(items))
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

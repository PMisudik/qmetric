package kata.supermarket.calculator;

import kata.supermarket.basket.Basket;

import java.math.BigDecimal;

public class TotalPriceCalculator implements Calculator {
    private final Calculator discountsCalculator;

    private final Basket basket;

    public TotalPriceCalculator(Basket basket) {
        this.discountsCalculator = new DiscountsCalculator(basket);
        this.basket = basket;
    }

    @Override
    public BigDecimal calculate() {
        return discountsCalculator.calculate();
    }
}

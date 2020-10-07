package kata.supermarket.product;

import java.math.BigDecimal;

public class WeighedProduct implements Product {
    private final BigDecimal pricePerKilo;

    public WeighedProduct(final BigDecimal pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    @Override
    public BigDecimal price() {
        return pricePerKilo;
    }
}

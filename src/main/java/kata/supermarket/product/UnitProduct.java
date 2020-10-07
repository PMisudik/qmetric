package kata.supermarket.product;

import java.math.BigDecimal;

public class UnitProduct implements Product {
    private final BigDecimal pricePerUnit;

    public UnitProduct(final BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public BigDecimal price() {
        return pricePerUnit;
    }

}

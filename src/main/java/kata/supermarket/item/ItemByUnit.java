package kata.supermarket.item;

import kata.supermarket.product.Product;
import kata.supermarket.product.UnitProduct;

import java.math.BigDecimal;

public class ItemByUnit implements Item {

    private final Product product;

    ItemByUnit(final UnitProduct product) {
        this.product = product;
    }

    public BigDecimal price() {
        return product.price();
    }
}

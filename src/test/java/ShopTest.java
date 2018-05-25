import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop;

    @Before
    public void before() {
        shop = new Shop("The Musicorium");
    }

    @Test
    public void hasStockCountOfZero() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void hasFundsOfZero() {
        assertEquals(0, shop.getFunds());
    }
}
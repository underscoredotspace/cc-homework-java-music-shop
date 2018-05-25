import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop;
    private AcousticGuitar yamahaF310;

    @Before
    public void before() {
        shop = new Shop("The Musicorium", 1000);
        yamahaF310 = new AcousticGuitar("Yamaha F310", 240, 300, "Black", 6);
    }

    @Test
    public void hasStockCountOfZero() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void hasStartingFunds() {
        assertEquals(1000, shop.getFunds());
    }

    @Test
    public void canBuyItem() {
        shop.buy(yamahaF310);
        assertEquals(760, shop.getFunds());
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canSellItem() {
        shop.buy(yamahaF310);
        shop.sell(yamahaF310);
        assertEquals(1060, shop.getFunds());
        assertEquals(0, shop.stockCount());
    }
}
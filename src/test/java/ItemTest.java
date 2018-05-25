import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private Item drumSticks;

    @Before
    public void before() {
        drumSticks = new Item("Drum Sticks", 15, 20);
    }

    @Test
    public void canGetName() {
        assertEquals("Drum Sticks", drumSticks.getName());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(20, drumSticks.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        drumSticks.setSellingPrice(30);
        assertEquals(30, drumSticks.getSellingPrice());
    }

    @Test
    public void canGetPurchaseCost() {
        assertEquals(15, drumSticks.getPurchaseCost());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(5, drumSticks.calculateMarkup());
    }
}
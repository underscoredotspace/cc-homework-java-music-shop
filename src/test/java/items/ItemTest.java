package items;

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
    public void getName() {
        assertEquals("Drum Sticks", drumSticks.getName());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(20, drumSticks.getSellingPrice());
    }

    @Test
    public void setSellingPrice() {
        drumSticks.setSellingPrice(30);
        assertEquals(30, drumSticks.getSellingPrice());
    }

    @Test
    public void getPurchaseCost() {
        assertEquals(15, drumSticks.getPurchaseCost());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(5, drumSticks.calculateMarkup());
    }
}
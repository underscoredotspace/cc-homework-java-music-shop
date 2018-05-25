import items.Item;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Item> stock;
    private int funds;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.funds = 0;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public int getFunds() {
        return this.funds;
    }
}

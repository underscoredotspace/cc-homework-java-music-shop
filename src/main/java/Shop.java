import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;
    private int funds;

    Shop(String name, int startingFunds) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.funds = startingFunds;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public int getFunds() {
        return this.funds;
    }

    public void buy(ISell item) {
        this.stock.add(item);
        this.funds -= item.getPurchaseCost();
    }

    public void sell(ISell item) {
        if (this.stock.remove(item)) {
            this.funds += item.getSellingPrice();
        }
    }
}

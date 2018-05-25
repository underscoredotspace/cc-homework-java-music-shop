package items;

public class Item implements ISell {
    public final String name;
    int sellingPrice;
    final int purchaseCost;

    public Item(String name, int purchaseCost, int sellingPrice) {
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.purchaseCost = purchaseCost;
    }

    public String getName() {
        return this.name;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getPurchaseCost() {
        return purchaseCost;
    }

    @Override
    public int calculateMarkup() {
        return this.sellingPrice - this.purchaseCost;
    }
}

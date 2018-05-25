public class DigitalPiano extends Instrument {
    private int keys;

    DigitalPiano(String name, int purchaseCost, int sellingPrice, String colour, int keys) {
        super(name, purchaseCost, sellingPrice, InstrumentType.KEYBOARD, colour, "plink");
        this.keys = keys;
    }

    public int getNumberOfKeys() {
        return this.keys;
    }
}

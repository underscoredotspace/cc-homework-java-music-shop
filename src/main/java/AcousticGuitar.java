public class AcousticGuitar extends Instrument {
    private final int strings;

    AcousticGuitar(String name, int purchaseCost, int sellPrice, String colour, int strings) {
        super(name, purchaseCost, sellPrice, InstrumentType.STRING, colour, "strum");
        this.strings = strings;
    }

    public int getNumberOfStrings() {
        return this.strings;
    }
}

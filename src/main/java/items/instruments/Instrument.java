package items.instruments;

import items.Item;

public abstract class Instrument extends Item {
    private final InstrumentType type;
    private final String colour;
    private final String sound;

    public Instrument(String name, int purchaseCost, int sellingPrice, InstrumentType type, String colour, String sound) {
        super(name, purchaseCost, sellingPrice);
        this.type = type;
        this.colour = colour;
        this.sound = sound;
    }

    public InstrumentType getType() {
        return this.type;
    }

    public String getColour() {
        return this.colour;
    }
}

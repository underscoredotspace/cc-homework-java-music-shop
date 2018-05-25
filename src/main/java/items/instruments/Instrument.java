package items.instruments;

import items.Item;

public abstract class Instrument extends Item implements IPlay {
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

    public String play() {
        return String.format("The %s plays and the crowd enjoy it's %s.", this.name, this.sound);
    }
}

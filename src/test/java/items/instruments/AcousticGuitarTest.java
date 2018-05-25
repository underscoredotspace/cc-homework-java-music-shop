package items.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AcousticGuitarTest {
    private AcousticGuitar yamahaF310;

    @Before
    public void before() {
        yamahaF310 = new AcousticGuitar("Yamaha F310", 240, 300, "Black", 6);
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", yamahaF310.getColour());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, yamahaF310.getNumberOfStrings());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRING, yamahaF310.getType());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("The Yamaha F310 plays and the crowd enjoy it's strum.", yamahaF310.play());
    }
}
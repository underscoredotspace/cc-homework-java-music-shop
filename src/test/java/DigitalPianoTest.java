import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitalPianoTest {
    private DigitalPiano korgLP180;

    @Before
    public void before() {
        korgLP180 = new DigitalPiano("Korg LP-180", 450, 640, "White", 88);
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(88, korgLP180.getNumberOfKeys());
    }
}
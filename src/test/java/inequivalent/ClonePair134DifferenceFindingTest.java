package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair134DifferenceFindingTest {

    private final ClonePair134 subject = new ClonePair134();

    @Test
    void methodsHandleLargeNegativeInterpolationDifferently() {
        assertEquals(-1.0E308, subject.method1(-1.0E308, -10.0, -1.0));
        assertTrue(Double.isNaN(subject.method2(-1.0E308, -10.0, -1.0)));
    }
}

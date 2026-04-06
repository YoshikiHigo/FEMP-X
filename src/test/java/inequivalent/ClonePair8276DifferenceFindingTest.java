package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8276DifferenceFindingTest {
    @Test
    void methodsHandleNegativeNumbersDifferently() {
        ClonePair8276 clonePair = new ClonePair8276();

        assertEquals("0-1", clonePair.method1(-1, 3));
        assertEquals("-1", clonePair.method2(-1, 3));
    }
}

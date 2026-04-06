package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair5964DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5964 clonePair = new ClonePair5964();

        assertEquals(1.5f, clonePair.method1("1,5"));
        assertThrows(NumberFormatException.class, () -> clonePair.method2("1,5"));
    }
}

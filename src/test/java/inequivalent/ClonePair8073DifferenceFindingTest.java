package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair8073DifferenceFindingTest {
    @Test
    void methodsParseDifferentSuffixes() {
        ClonePair8073 clonePair = new ClonePair8073();

        assertEquals(1.0, clonePair.method1("1D"));
        assertNull(clonePair.method2("1D"));
    }
}

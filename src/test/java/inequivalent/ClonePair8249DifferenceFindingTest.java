package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8249DifferenceFindingTest {
    @Test
    void methodsTreatNullAndEmptyStringDifferently() {
        ClonePair8249 clonePair = new ClonePair8249();

        assertFalse(clonePair.method1(null, ""));
        assertTrue(clonePair.method2(null, ""));
    }
}

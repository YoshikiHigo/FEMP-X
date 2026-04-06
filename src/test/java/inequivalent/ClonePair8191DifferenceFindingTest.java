package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8191DifferenceFindingTest {
    @Test
    void methodsConvertFractionalNumbersDifferently() {
        ClonePair8191 clonePair = new ClonePair8191();

        assertFalse(clonePair.method1(0.5));
        assertTrue(clonePair.method2(0.5));
    }
}

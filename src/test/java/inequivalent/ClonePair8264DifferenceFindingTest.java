package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8264DifferenceFindingTest {
    @Test
    void methodsInterpretAsteriskDifferently() {
        ClonePair8264 clonePair = new ClonePair8264();

        assertTrue(clonePair.method1("*", "abc"));
        assertFalse(clonePair.method2("*", "abc"));
    }
}

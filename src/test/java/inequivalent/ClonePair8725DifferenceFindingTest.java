package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8725DifferenceFindingTest {
    @Test
    void methodsIgnoreSeparatorsDifferently() {
        ClonePair8725 clonePair = new ClonePair8725();

        assertTrue(clonePair.method1("a-b", "ab"));
        assertFalse(clonePair.method2("a-b", "ab"));
    }
}

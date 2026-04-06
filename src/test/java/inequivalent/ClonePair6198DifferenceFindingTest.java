package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6198DifferenceFindingTest {
    @Test
    void onlyMethod2TreatsAsteriskAsWildcard() {
        ClonePair6198 clonePair = new ClonePair6198();

        assertFalse(clonePair.method1("abc", "a*c"));
        assertTrue(clonePair.method2("abc", "a*c"));
    }
}

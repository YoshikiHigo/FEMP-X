package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6618DifferenceFindingTest {
    @Test
    void methodsCheckDifferentStringRelationships() {
        ClonePair6618 clonePair = new ClonePair6618();

        assertFalse(clonePair.method1("a", "b"));
        assertTrue(clonePair.method2("a", "b"));
    }
}

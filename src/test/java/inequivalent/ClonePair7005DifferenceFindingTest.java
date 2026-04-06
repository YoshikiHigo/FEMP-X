package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7005DifferenceFindingTest {
    @Test
    void methodsCompareDifferentPositions() {
        ClonePair7005 clonePair = new ClonePair7005();

        assertTrue(clonePair.method1("ab", 'b'));
        assertFalse(clonePair.method2("ab", 'b'));
    }
}

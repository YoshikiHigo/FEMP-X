package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7856DifferenceFindingTest {
    @Test
    void methodsUseLongAndDoublePrecisionDifferently() {
        ClonePair7856 clonePair = new ClonePair7856();

        assertTrue(clonePair.method1(0.0, 0.6, 1.0));
        assertFalse(clonePair.method2(0.0, 0.6, 1.0));
    }
}

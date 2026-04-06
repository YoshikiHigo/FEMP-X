package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7862DifferenceFindingTest {
    @Test
    void methodsTreatEmptyStringAndAsteriskDifferently() {
        ClonePair7862 clonePair = new ClonePair7862();

        assertTrue(clonePair.method1(new String[]{""}));
        assertFalse(clonePair.method2(new String[]{""}));
    }
}

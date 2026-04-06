package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7731DifferenceFindingTest {
    @Test
    void methodsCompareDatePrecisionDifferently() {
        ClonePair7731 clonePair = new ClonePair7731();

        assertTrue(clonePair.method1(new Date(1_000L), new Date(1_500L)));
        assertFalse(clonePair.method2(new Date(1_000L), new Date(1_500L)));
    }
}

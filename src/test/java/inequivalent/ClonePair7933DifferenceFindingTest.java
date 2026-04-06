package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair7933DifferenceFindingTest {
    @Test
    void methodsConvertFloatingPointNumbersDifferently() {
        ClonePair7933 clonePair = new ClonePair7933();

        assertEquals(1L, clonePair.method1(1.0));
        assertNull(clonePair.method2(1.0));
    }
}

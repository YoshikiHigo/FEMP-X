package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3137DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair3137 clonePair = new ClonePair3137();

        ArrayIndexOutOfBoundsException method1Exception =
                assertThrows(ArrayIndexOutOfBoundsException.class, () -> clonePair.method1(new float[]{}));
        ArrayIndexOutOfBoundsException method2Exception =
                assertThrows(ArrayIndexOutOfBoundsException.class, () -> clonePair.method2(new float[]{}));

        assertTrue(method1Exception.getMessage().contains("Index 0"));
        assertTrue(method2Exception.getMessage().contains("Index -1"));
        assertNotEquals(method1Exception.getMessage(), method2Exception.getMessage());
    }
}

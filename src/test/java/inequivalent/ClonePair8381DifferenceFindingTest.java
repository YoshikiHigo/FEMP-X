package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8381DifferenceFindingTest {
    @Test
    void methodsHandleEquallyShortArraysDifferently() {
        ClonePair8381 clonePair = new ClonePair8381();

        assertFalse(clonePair.method1(new byte[]{1}, new byte[]{1}, 2));
        assertTrue(clonePair.method2(new byte[]{1}, new byte[]{1}, 2));
    }
}

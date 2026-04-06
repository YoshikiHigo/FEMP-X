package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8012DifferenceFindingTest {
    @Test
    void methodsHandlePrimitiveParameterTypesDifferently() {
        ClonePair8012 clonePair = new ClonePair8012();

        assertFalse(clonePair.method1(new Class[]{Integer.TYPE}, new Object[]{1}));
        assertTrue(clonePair.method2(new Class[]{Integer.TYPE}, new Object[]{1}));
    }
}

package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair11012DifferenceFindingTest {
    @Test
    void methodsHandleNonIntegerNumbersDifferently() {
        ClonePair11012 clonePair = new ClonePair11012();

        assertThrows(ClassCastException.class, () -> clonePair.method1(Collections.singletonList(1L)));
        assertEquals(1, clonePair.method2(Collections.singletonList(1L)));
    }
}

package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair10498DifferenceFindingTest {
    @Test
    void methodsTrimIntegerTextDifferently() {
        ClonePair10498 clonePair = new ClonePair10498();

        assertNull(clonePair.method1(" 1 "));
        assertEquals(1, clonePair.method2(" 1 "));
    }
}

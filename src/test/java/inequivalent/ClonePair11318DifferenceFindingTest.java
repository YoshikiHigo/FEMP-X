package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11318DifferenceFindingTest {
    @Test
    void methodsCompareDifferentNumberWidths() {
        ClonePair11318 clonePair = new ClonePair11318();

        assertEquals(65536, clonePair.method1(65536, 1).intValue());
        assertEquals(1, clonePair.method2(65536, 1).intValue());
    }
}

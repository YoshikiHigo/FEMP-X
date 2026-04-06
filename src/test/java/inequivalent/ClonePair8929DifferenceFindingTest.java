package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8929DifferenceFindingTest {
    @Test
    void methodsSkipSpacesDifferently() {
        ClonePair8929 clonePair = new ClonePair8929();

        assertEquals(1, clonePair.method1(" a", 0));
        assertEquals(0, clonePair.method2(" a", 0));
    }
}

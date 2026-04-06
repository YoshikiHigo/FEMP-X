package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8115DifferenceFindingTest {
    @Test
    void methodsSkipSpacesDifferently() {
        ClonePair8115 clonePair = new ClonePair8115();

        assertEquals("", clonePair.method1(2, "1 x"));
        assertEquals("1", clonePair.method2(2, "1 x"));
    }
}

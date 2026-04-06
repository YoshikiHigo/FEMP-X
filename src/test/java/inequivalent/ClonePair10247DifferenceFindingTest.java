package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10247DifferenceFindingTest {
    @Test
    void methodsReturnDifferentCaseInsensitiveFallbackMatch() {
        ClonePair10247 clonePair = new ClonePair10247();

        assertEquals(2, clonePair.method1("AAA", "a"));
        assertEquals(0, clonePair.method2("AAA", "a"));
    }
}

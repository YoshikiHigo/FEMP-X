package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10951DifferenceFindingTest {
    @Test
    void methodsMeasureAsciiLengthDifferently() {
        ClonePair10951 clonePair = new ClonePair10951();

        assertEquals("ab", clonePair.method1("ab", 1, "..."));
        assertEquals("a...", clonePair.method2("ab", 1, "..."));
    }
}

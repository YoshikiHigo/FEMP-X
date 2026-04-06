package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12692DifferenceFindingTest {
    @Test
    void onlyMethod2RemovesNonTrailingMatch() {
        ClonePair12692 clonePair = new ClonePair12692();

        assertEquals("ab", clonePair.method1("ab", "a"));
        assertEquals("b", clonePair.method2("ab", "a"));
    }
}

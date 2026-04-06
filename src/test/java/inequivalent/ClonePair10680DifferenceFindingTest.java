package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10680DifferenceFindingTest {
    @Test
    void methodsCompareDifferentStringPrefixes() {
        ClonePair10680 clonePair = new ClonePair10680();

        assertEquals(-1, clonePair.method1("abcx", "abcy"));
        assertEquals(0, clonePair.method2("abcx", "abcy"));
    }
}

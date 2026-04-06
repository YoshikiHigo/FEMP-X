package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10916DifferenceFindingTest {
    @Test
    void methodsTrimRepeatedPrefixesDifferently() {
        ClonePair10916 clonePair = new ClonePair10916();

        assertEquals("xa", clonePair.method1("xxa", "x"));
        assertEquals("a", clonePair.method2("xxa", "x"));
    }
}

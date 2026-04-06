package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11258DifferenceFindingTest {
    @Test
    void methodsTruncateDifferentSides() {
        ClonePair11258 clonePair = new ClonePair11258();

        assertEquals("ab", clonePair.method1("abc", 2));
        assertEquals("bc", clonePair.method2("abc", 2));
    }
}

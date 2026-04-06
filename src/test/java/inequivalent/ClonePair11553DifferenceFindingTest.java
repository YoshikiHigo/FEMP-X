package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11553DifferenceFindingTest {
    @Test
    void methodsTruncateWithDifferentSuffixHandling() {
        ClonePair11553 clonePair = new ClonePair11553();

        assertEquals("...", clonePair.method1("abc", 3));
        assertEquals("ab", clonePair.method2("abc", 3));
    }
}

package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11270DifferenceFindingTest {
    @Test
    void methodsComparePrefixWithDifferentCaseSensitivity() {
        ClonePair11270 clonePair = new ClonePair11270();

        assertEquals("aA", clonePair.method1("A", "a"));
        assertEquals("A", clonePair.method2("A", "a"));
    }
}

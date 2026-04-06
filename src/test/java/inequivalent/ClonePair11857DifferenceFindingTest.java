package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11857DifferenceFindingTest {
    @Test
    void methodsReturnSuffixAndPrefixDifferently() {
        ClonePair11857 clonePair = new ClonePair11857();

        assertEquals("bc", clonePair.method1("abc", 2));
        assertEquals("ab", clonePair.method2("abc", 2));
    }
}

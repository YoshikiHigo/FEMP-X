package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12480DifferenceFindingTest {
    @Test
    void methodsReturnFirstAndLastMatchingIndexes() {
        ClonePair12480 clonePair = new ClonePair12480();
        Object[] values = {"a", "a"};

        assertEquals(0, clonePair.method1("a", values));
        assertEquals(1, clonePair.method2("a", values));
    }
}

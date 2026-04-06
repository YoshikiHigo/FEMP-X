package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9982DifferenceFindingTest {
    @Test
    void methodsReturnFirstAndLastMatchDifferently() {
        ClonePair9982 clonePair = new ClonePair9982();

        assertEquals(0, clonePair.method1("aba", "a"));
        assertEquals(2, clonePair.method2("aba", "a"));
    }
}

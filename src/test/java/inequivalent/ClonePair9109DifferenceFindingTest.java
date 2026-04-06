package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9109DifferenceFindingTest {
    @Test
    void methodsPrioritizeLengthDifferently() {
        ClonePair9109 clonePair = new ClonePair9109();

        assertEquals(1, clonePair.method1("aa", "b"));
        assertEquals(-1, clonePair.method2("aa", "b"));
    }
}

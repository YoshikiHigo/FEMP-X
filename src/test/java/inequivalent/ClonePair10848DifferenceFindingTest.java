package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10848DifferenceFindingTest {
    @Test
    void methodsPadOppositeSides() {
        ClonePair10848 clonePair = new ClonePair10848();

        assertEquals("ax", clonePair.method1("a", 2, "x"));
        assertEquals("xa", clonePair.method2("a", 2, "x"));
    }
}

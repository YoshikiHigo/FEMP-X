package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10876DifferenceFindingTest {
    @Test
    void methodsPadOppositeSides() {
        ClonePair10876 clonePair = new ClonePair10876();

        assertEquals("xa", clonePair.method1("a", 2, "x"));
        assertEquals("ax", clonePair.method2("a", 2, "x"));
    }
}

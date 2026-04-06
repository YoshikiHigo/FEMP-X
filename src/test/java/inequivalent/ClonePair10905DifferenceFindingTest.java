package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10905DifferenceFindingTest {
    @Test
    void methodsPadOppositeSides() {
        ClonePair10905 clonePair = new ClonePair10905();

        assertEquals("ax", clonePair.method1("a", 2, "x"));
        assertEquals("xa", clonePair.method2("a", 2, "x"));
    }
}

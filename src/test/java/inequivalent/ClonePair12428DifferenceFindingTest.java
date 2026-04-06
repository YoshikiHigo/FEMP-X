package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12428DifferenceFindingTest {
    @Test
    void methodsPadOppositeSides() {
        ClonePair12428 clonePair = new ClonePair12428();

        assertEquals("a ", clonePair.method1("a", 2));
        assertEquals(" a", clonePair.method2("a", 2));
    }
}

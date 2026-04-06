package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11739DifferenceFindingTest {
    @Test
    void methodsRepeatAndTruncateDifferently() {
        ClonePair11739 clonePair = new ClonePair11739();

        assertEquals("aa", clonePair.method1("a", 2));
        assertEquals("a", clonePair.method2("a", 2));
    }
}

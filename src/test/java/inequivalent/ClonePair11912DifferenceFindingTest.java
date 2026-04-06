package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11912DifferenceFindingTest {
    @Test
    void methodsHandleNullReplacementDifferently() {
        ClonePair11912 clonePair = new ClonePair11912();

        assertEquals("", clonePair.method1("a", "a", null));
        assertEquals("a", clonePair.method2("a", "a", null));
    }
}

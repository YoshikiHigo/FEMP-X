package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12669DifferenceFindingTest {
    @Test
    void methodsTrimOppositeEnds() {
        ClonePair12669 clonePair = new ClonePair12669();

        assertEquals("a", clonePair.method1("xa", 'x'));
        assertEquals("xa", clonePair.method2("xa", 'x'));
    }
}

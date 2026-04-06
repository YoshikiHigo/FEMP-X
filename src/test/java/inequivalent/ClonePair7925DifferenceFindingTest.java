package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7925DifferenceFindingTest {
    @Test
    void methodsReplaceFirstAndAllOccurrencesDifferently() {
        ClonePair7925 clonePair = new ClonePair7925();

        assertEquals("ba", clonePair.method1("aa", "a", "b", true));
        assertEquals("bb", clonePair.method2("aa", "a", "b", true));
    }
}

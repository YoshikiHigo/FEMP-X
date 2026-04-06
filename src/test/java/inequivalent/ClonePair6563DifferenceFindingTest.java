package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.regex.PatternSyntaxException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6563DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6563 clonePair = new ClonePair6563();

        assertThrows(PatternSyntaxException.class, () -> clonePair.method1("a", "*"));
        assertTrue(clonePair.method2("a", "*"));
    }
}
